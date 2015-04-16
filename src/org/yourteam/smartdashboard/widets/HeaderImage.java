package org.yourteam.smartdashboard.widets;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import edu.wpi.first.smartdashboard.gui.StaticWidget;
import edu.wpi.first.smartdashboard.properties.Property;

public class HeaderImage extends StaticWidget
{
	ImageIcon headerIcon;

	JLabel headerLabel;
	/**
	 * 
	 */
	private static final long serialVersionUID = -5524897683464348374L;

	@Override
	public void propertyChanged(Property arg0)
	{
		
	}

	@Override
	public void init()
	{
		headerIcon = new ImageIcon(getClass().getClassLoader().getResource("org/team3128/dashbored/images/header.png"));
		headerLabel = new JLabel(headerIcon);
		
		add(headerLabel);
	}

}
