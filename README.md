# SmartDashboard SDK
This repository is a starting point for teams wishing to make their own plugins for the FRC Smart Dashboard.  It uses an ant script to automate the building and deploying of the code.  It comes with a copy of the decompiled SmartDashboard source for ease of debugging and learning.

### Setup
1. On a computer with the WPILib java SDK installed to `%userprofile%/wpilib` (it should get installed by the Eclipse FRC java plugin), clone this repository and import it with Eclipse JDK.
2. In Eclipse, go to File -> Import... -> Run/Debug -> Launch Configurations.  Hit next.
3. Hit the Browse... button at the top, and select the Launch Configurations folder inside the cloned repo.
4. Check all of the .launch files, and hit finish.
5. Use the External Tools menu (click the arrow next to the play button with a toolbox) to launch the `DashboardBase Ant Build` configuration.
6. The SmartDashboard should pop up, and the `Generic Team` header image should be visible.  If it's not, try to add HeaderImage using the Add... menu at the top.
7. If the HeaderImage choice is not there, something's gone wrong. Otherwise, you're good!

### Writing Code
##### Getting Started
1. Rename the provided package to your team's.  
2. Subclass StaticWidget (for objects that do not communicate with the robot) and Widget (for objects that do communicate with the robot) to create custom GUI controls.
3. They should be automagically found by SmartDashboard once it loads your team's plugin.  
4. Rename the project to whatever you like
5. Change the JarName property at the top of build.xml to match it. 

Prior to the 2015 season, there was a wiki page about writing SmartDashboard plugins on WPI's TeamForge.  Unfortuantely, that wiki seems to have been erased by TeamForge's (rubbish) upgrade of their software, and the Wayback Machine was disabled by robots.txt.  So, now there is no official documentation whatsoever.

To install the plugin on your drive computer, either clone the repository and run it once from eclipse, or copy the built jar from the install subdirectory in the project to %userprofile%/SmartDashboard/extensions on the drive pc.

For a good example of how to write lots of interesting widgets, check out the [WAR Lords GitHub repo](https://github.com/team2485/sdwidgets).

### Debugging
You may have noticed that there is an "Ant Debug" configuration that got imported.  While line numbers inside the SmartDashboard jar are a bit off with the decompiled source, you can debug the SmartDashboard with this setup.  

First, run the `ProjectName Ant Debug` configuration from the external tools menu in Eclipse, where `ProjectName` is the name you assigned to your SDK project.  Then, run the `ProjectName Debug` configuration from the debug menu.  This will use Java's remote socket debugging to connect to the ant build and debug your code.


