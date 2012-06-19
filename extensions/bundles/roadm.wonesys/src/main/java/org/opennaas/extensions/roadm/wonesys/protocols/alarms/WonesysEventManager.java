package org.opennaas.extensions.roadm.wonesys.protocols.alarms;

import org.opennaas.core.events.EventManager;
import org.opennaas.extensions.roadm.wonesys.activator.Activator;
import org.osgi.framework.BundleContext;

public class WonesysEventManager extends EventManager {

	@Override
	public BundleContext getBundleContext() {
		return Activator.getBundleContext();
	}

}
