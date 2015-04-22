# SmartDashboard SDK
This repository is a starting point for teams wishing to make their own plugins for the FRC Smart Dashboard.  It uses an ant script to automate building and deployment of the code.

## Setup
1. On a computer with the WPILib java SDK installed (it should get installed by the Eclipse FRC java plugin), clone this repository and import it with Eclipse JDK.
2. In eclipse, go to File -> Import... -> Run/Debug -> Launch Configurations.  Hit next.
3. Hit the Browse... button at the top, and select the Launch Configurations folder inside the cloned repo.
4. Check all of the .launch files, and hit finish.
5. Use the External Tools menu (click the arrow next to the play button with a toolbox) to launch the `DashboardBase Ant Build` configuration.
6. The SmartDashboard should pop up, and the `Generic Team` header image should be visible.  If it's not, try to add HeaderImage using the Add... menu.  If the HeaderImage choice is not there, something's gone wrong. Otherwise, you're good!