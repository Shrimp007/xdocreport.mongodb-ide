package fr.opensagres.mongodb.ide.launching.internal;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

public class ServerLaunchConfigurationTab extends
		AbstractLaunchConfigurationTab {

	public void createControl(Composite parent) {
		// TODO Auto-generated method stub

	}

	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub

	}

	public void initializeFrom(ILaunchConfiguration configuration) {
		// TODO Auto-generated method stub

	}

	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub

	}

	public String getName() {
		return Messages.ServerLaunchConfigurationTab_name;
	}

	@Override
	public Image getImage() {
		return ImageResources.getImage(ImageResources.IMG_MONGO_16);
	}
}