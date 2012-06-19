package org.opennaas.extensions.roadm.wonesys.activator;

import org.opennaas.core.events.IEventManager;
import org.opennaas.core.resources.AbstractActivator;
import org.opennaas.core.resources.ActivatorException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractActivator implements BundleActivator {

	static Log						log				= LogFactory.getLog(Activator.class);

	private static BundleContext	bundleContext	= null;
	//used only by commented functions below
	//private static HashMap<Integer, ServiceRegistration>	registeredServices	= new HashMap<Integer, ServiceRegistration>();

	@Override
	public void start(BundleContext context) throws Exception {
		bundleContext = context;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		Activator.bundleContext = null;
	}

	public static BundleContext getBundleContext() {
		return bundleContext;
	}

	public static IEventManager getEventManagerService() throws ActivatorException {
		log.debug("Calling EventManager");
		log.debug("Params: context=" + bundleContext + " class=" + IEventManager.class.getName());
		return (IEventManager) getServiceFromRegistry(bundleContext, IEventManager.class.getName());
	}
	
	// Commented functions from the protocol bundle
	
	// public static EventAdmin getEventAdmin() {
	// ServiceReference reference = bundleContext.getServiceReference(EventAdmin.class.getName());
	// return (EventAdmin) bundleContext.getService(reference);
	// }
	//
	// public static int registerService(String serviceName, Object service, Dictionary<String, Object> properties){
	// ServiceRegistration registration = bundleContext.registerService(serviceName, service, properties);
	// registeredServices.put(registeredServices.size()+1, registration);
	// return registeredServices.size();
	// }
	//
	// public static void unregisterService (int serviceID){
	// ServiceRegistration registration = registeredServices.get(serviceID);
	// registration.unregister();
	// registeredServices.remove(serviceID);
	// }


}
