/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class ConfigurationComponent as well as methods comparable
 * to the invokeMethods defined for this class. This Class implements the ConfigurationComponentBean Interface. The CIM class ConfigurationComponent
 * is described as follows:
 * 
 * Note: The Configuration class is being deprecated in lieu of using a ConcreteComponent relationship to indicate a hierarchy of instances of Setting
 * or SettingData. Deprecated description: ConfigurationComponent aggregates "lower-level" Configuration objects into a "high-level" Configuration.
 * This association enables the assembly of complex configurations by grouping together simpler ones. For example, a logon policy for the United
 * States could consist of two Configuration groups, one for the East Coast and one for the West Coast. Each of these groups could in turn consist of
 * multiple Configurations to handle different aspects of the logon process.
 */
@Deprecated
public class ConfigurationComponent extends Association implements
		Serializable {

	/**
	 * This constructor creates a ConfigurationComponentBeanImpl Class which implements the ConfigurationComponentBean Interface, and encapsulates the
	 * CIM class ConfigurationComponent in a Java Bean. The CIM class ConfigurationComponent is described as follows:
	 * 
	 * Note: The Configuration class is being deprecated in lieu of using a ConcreteComponent relationship to indicate a hierarchy of instances of
	 * Setting or SettingData. Deprecated description: ConfigurationComponent aggregates "lower-level" Configuration objects into a "high-level"
	 * Configuration. This association enables the assembly of complex configurations by grouping together simpler ones. For example, a logon policy
	 * for the United States could consist of two Configuration groups, one for the East Coast and one for the West Coast. Each of these groups could
	 * in turn consist of multiple Configurations to handle different aspects of the logon process.
	 */
	public ConfigurationComponent() {
	};

	/**
	 * This method create an Association of the type ConfigurationComponent between one Configuration object and Configuration object
	 */
	@Deprecated
	public static ConfigurationComponent link(Configuration
			configGroup, Configuration configComponent) {

		return (ConfigurationComponent) Association.link(ConfigurationComponent.class, configGroup, configComponent);
	}// link

} // Class ConfigurationComponent
