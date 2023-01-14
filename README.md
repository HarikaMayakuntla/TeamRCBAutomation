# TeamRCBAutomation

## Table of contents

- Requirements
- Installation
- Configuration
- Project Execution

# Requirements
- Java and Maven has to be installed in local machine
- TestNG, Rest Assured knowledge is required
- To understand testNG, follow https://testng.org/doc/
- To understand RestAssured, follow https://rest-assured.io/

# Installation
- To download and install JAVA - https://www.oracle.com/in/java/technologies/downloads/ 
- To download and install Maven - https://www.baeldung.com/install-maven-on-windows-linux-mac

# Configuration
- Set Java and Maven home path variables
- Add testNG and RestAssured dependencies in pom.xml
- Any dependencies if you want to configure in your project after clone , ref: https://mvnrepository.com/

# Project Execution
- RestAssured util methods are present in src/main/java/org/testVagrant/utils/RestAssuredUtil.java
- Base setup before starting the test is present in src/test/java/org/testVagrant/tests/BaseTest.java
- All the tests are present in src/test/java/org/testVagrant/tests
- Any endpoints required for the project can be configured in src/main/java/org/testVagrant/utils/Endpoints.java
- Navigate to project folder from command line and run 'mvn clean test'
- If not you can directly run testng.xml file by right click --> run testng.xml
- To run each test class seperately --> right click in test class and click run 

