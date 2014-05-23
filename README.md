pentaho-birtplugin
==================

The BIRT plugin for Pentaho Business Analytics provides integration support of BIRT Viewer  in Pentaho User Console Interface.
It requires the WebViewerExample deployment in Tomcat webapps directory.
 
Building
--------
The BIRT plugin is built with Apache Ant.

Before we compile the Plugin
	1) download Birt runtime distribution into your local machine
	2) Stop Pentaho Server
	3) copy "WebViewerExample" from Birt runtime into pentaho´s tomcat (follow BIRT instructions for this)

Builing the Plugin:
1) copy build.properties.example to build.properties 
2) set environment properties in build.properties to point to Pentaho server and Birt runtime files locations. 
3) run "ant package" to build the destrubtion file of Birt plugin using your properties

Deploy plugin:
1) run "and deploy" to copy the Birt plugin into Pentaho´s System folder

Testing the Plugin:
1) Start pentaho
2) from the Birt runtime, copy/upload the file "hello_world.rptdesign" into the pentaho repository
3) click on the hello world and see it working....



License
-------
Licensed under the Apache License, Version 2.0. See LICENSE for more information.
