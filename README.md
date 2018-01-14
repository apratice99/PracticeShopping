Background: I have used cucumber jvm project template to write the scenarios in BDD format.

Project Structure: helpers package contains data helper and log classes. Modules package will have all action classes for example signin action , checkout action. pageObjects have page object classes defined step_definitions package has all step definitions and hooks class as well as Cucumber Runner class (where we can set options) features package has all .feature files testData package has test data files eg. excel files pom.xml – since it is a maven project and has all dependencies as GAVs log4j.xml – config file for log4j

Both the scenarios are covered: 
Scenario 1: Order TShirt & Verify item exist in Order History
Scenario 2:  Update Personal Information(FirstName) in My Account. & Further verify FirstName field appears updated.


Note:
Update "webdriver.chrome.driver" in Hooks.java
