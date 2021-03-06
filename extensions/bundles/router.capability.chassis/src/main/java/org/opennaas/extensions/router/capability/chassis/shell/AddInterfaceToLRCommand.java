package org.opennaas.extensions.router.capability.chassis.shell;

import org.apache.felix.gogo.commands.Argument;
import org.apache.felix.gogo.commands.Command;
import org.opennaas.core.resources.IResource;
import org.opennaas.core.resources.capability.ICapability;
import org.opennaas.core.resources.command.Response;
import org.opennaas.core.resources.shell.GenericKarafCommand;
import org.opennaas.extensions.router.capability.chassis.ChassisCapability;
import org.opennaas.extensions.router.junos.actionssets.ActionConstants;
import org.opennaas.extensions.router.model.ComputerSystem;
import org.opennaas.extensions.router.model.NetworkPort;

@Command(scope = "chassis", name = "addInterfaceToLR", description = "Transfere an exitent subinterface from a physical router to a logical one.")
public class AddInterfaceToLRCommand extends GenericKarafCommand {

	@Argument(index = 0, name = "resourceType:ParentResourceName", description = "Parent resource id, source of the transference", required = true, multiValued = false)
	private String	physicalResourceId;

	@Argument(index = 1, name = "resourceType:ChildResourceName", description = "Child resource id, target of the transference.", required = true, multiValued = false)
	private String	logicalResourceId;

	@Argument(index = 2, name = "interface", description = "The name of the interface to be transfered", required = true, multiValued = false)
	private String	interfaceName;

	@Override
	protected Object doExecute() throws Exception {
		printInitCommand("Add an interface to a child logical router");

		try {

			IResource sourceResource = getResourceFromFriendlyName(physicalResourceId);

			/* create call parameters */

			ComputerSystem logicalRouterModel = createLRModelWithInterface(logicalResourceId, interfaceName);

			ICapability chassisCapability = getCapability(sourceResource.getCapabilities(), ChassisCapability.CHASSIS);

			Response response = (Response) chassisCapability.sendMessage(ActionConstants.ADDINTERFACETOLOGICALROUTER, logicalRouterModel);
			printResponseStatus(response, physicalResourceId);

		} catch (Exception e) {
			printError(e);
			printEndCommand();
			return -1;
		}

		printEndCommand();
		return null;
	}

	public ComputerSystem createLRModelWithInterface(String logicalRouterFriendlyId, String interfaceNameWithPort) throws Exception {

		// That's a hack for not requiring logicalRouter to be already added in the resource manager when this command is executed.
		// Instead of getting the resource using resource manager, we take logicalRouter name from the friendly id.
		ComputerSystem logicalRouterModel = new ComputerSystem();
		String[] targetResourceName = splitResourceName(logicalRouterFriendlyId);
		logicalRouterModel.setName(targetResourceName[1]);
		logicalRouterModel.setElementName(targetResourceName[1]);

		// That's a hack for not requiring interface to be already created in opennaas model when this command is executed.
		// Instead of getting it from physical router model, we use only the interface identifier.
		// Action will fail (in execute) if this interface is not created
		String[] paramsInterface = splitInterfaces(interfaceNameWithPort);
		NetworkPort iface = new NetworkPort();
		iface.setName(paramsInterface[0]);
		iface.setPortNumber(Integer.parseInt(paramsInterface[1]));
		logicalRouterModel.addLogicalDevice(iface);

		return logicalRouterModel;
	}

}
