/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class SchedulingElement as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the SchedulingElementBean Interface. The CIM class SchedulingElement is described as
 * follows:
 * 
 * SchedulingElement represents the configuration information that a PacketSchedulingService has for one of the elements that it is scheduling. The
 * scheduled element is either a QueuingService or another Packet SchedulingService. Among the subclasses of this class, some are defined in such a
 * way that all of their instances are work conserving. Other subclasses, however, have instances that either are or are not work conserving. In this
 * class, the boolean property WorkConserving indicates whether an instance is or is not work conserving. Note that WorkConserving is restricted to
 * TRUE in the subclasses that are inherently work conserving, since instances of these classes cannot be anything else.
 */
public class SchedulingElement extends ManagedElement implements Serializable
{

	/**
	 * This constructor creates a SchedulingElementBeanImpl Class which implements the SchedulingElementBean Interface, and encapsulates the CIM class
	 * SchedulingElement in a Java Bean. The CIM class SchedulingElement is described as follows:
	 * 
	 * SchedulingElement represents the configuration information that a PacketSchedulingService has for one of the elements that it is scheduling.
	 * The scheduled element is either a QueuingService or another Packet SchedulingService. Among the subclasses of this class, some are defined in
	 * such a way that all of their instances are work conserving. Other subclasses, however, have instances that either are or are not work
	 * conserving. In this class, the boolean property WorkConserving indicates whether an instance is or is not work conserving. Note that
	 * WorkConserving is restricted to TRUE in the subclasses that are inherently work conserving, since instances of these classes cannot be anything
	 * else.
	 */
	protected SchedulingElement() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property instanceID.
	 */
	private String	instanceID;

	/**
	 * This method returns the SchedulingElement.instanceID property value. This property is described as follows:
	 * 
	 * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure
	 * uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: <OrgID>:<LocalID>
	 * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name
	 * that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a
	 * recognized global authority. (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure
	 * uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between
	 * <OrgID> and <LocalID>. <LocalID> is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world)
	 * elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across
	 * any InstanceIDs produced by this or other providers for this instance's NameSpace. For DMTF defined instances, the 'preferred' algorithm MUST
	 * be used with the <OrgID> set to 'CIM'.
	 * 
	 * @return String current instanceID property value
	 * @exception Exception
	 */
	@Override
	public String getInstanceID() {

		return this.instanceID;
	} // getInstanceID

	/**
	 * This method sets the SchedulingElement.instanceID property value. This property is described as follows:
	 * 
	 * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure
	 * uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: <OrgID>:<LocalID>
	 * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name
	 * that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a
	 * recognized global authority. (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure
	 * uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between
	 * <OrgID> and <LocalID>. <LocalID> is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world)
	 * elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across
	 * any InstanceIDs produced by this or other providers for this instance's NameSpace. For DMTF defined instances, the 'preferred' algorithm MUST
	 * be used with the <OrgID> set to 'CIM'.
	 * 
	 * @param String
	 *            new instanceID property value
	 * @exception Exception
	 */
	@Override
	public void setInstanceID(String instanceID) {

		this.instanceID = instanceID;
	} // setInstanceID

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property workConserving.
	 */
	private boolean	workConserving;

	/**
	 * This method returns the SchedulingElement.workConserving property value. This property is described as follows:
	 * 
	 * A boolean property indicating whether the PacketSchedulingService tied to this instance (by the ElementInSchedulingService aggregation) is
	 * treating the queue/input tied to this instance, in a work-conserving manner. The queue/input is indicated by either the QueueToSchedule or
	 * SchedulingServiceToSchedule association. Note that this property is writeable, indicating that an administrator can change the behavior of the
	 * SchedulingElement - but only for those elements that can operate in a non-work conserving mode.
	 * 
	 * @return boolean current workConserving property value
	 * @exception Exception
	 */
	public boolean isWorkConserving() {

		return this.workConserving;
	} // getWorkConserving

	/**
	 * This method sets the SchedulingElement.workConserving property value. This property is described as follows:
	 * 
	 * A boolean property indicating whether the PacketSchedulingService tied to this instance (by the ElementInSchedulingService aggregation) is
	 * treating the queue/input tied to this instance, in a work-conserving manner. The queue/input is indicated by either the QueueToSchedule or
	 * SchedulingServiceToSchedule association. Note that this property is writeable, indicating that an administrator can change the behavior of the
	 * SchedulingElement - but only for those elements that can operate in a non-work conserving mode.
	 * 
	 * @param boolean new workConserving property value
	 * @exception Exception
	 */
	public void setWorkConserving(boolean workConserving) {

		this.workConserving = workConserving;
	} // setWorkConserving

} // Class SchedulingElement