# Website Testing Automation Project

This project automates the testing of a website's various functionalities using Java, Selenium WebDriver, RestAssured, Maven and Cucumber for Behavior Driven Development (BDD) testing, along with api tests to verify backend functionalities.

## Technologies Used
- Java: Programming language.
- Selenium WebDriver: Browser automation tool.
- Cucumber: Framework for writing test scenarios in Gherkin syntax.
- JUnit: Testing framework.
- REST Assured: Library for automating api testing.
- Maven: Dependency management.

### Prerequisites
- Java Development Kit (JDK) 22 or higher.
- Maven for managing dependencies.
- ChromeDriver for browser automation.
- An IDE

## Running Tests

### You can run the tests from the command line or from within your IDE.

#### From the command line:
<pre><code>// IDK YET //</code></pre>

### From within the IDE:
1. Navigate to "src/test/runner/TestRunner"
2. Change "tags" parameter to the relevant one (Regestration_E2E, Registration, Login, Smoke)
3. Run the file


## Test Structure
#### The project follows a standard Maven and Cucumber BDD structure:

- src/main/java: Contains the main code.
- src/test/java: Contains the step definitions, api tests, Page Objects and Cucumber runners.
- src/test/resources: Contains feature files where the BDD scenarios are written.

## Reporting
After running the tests, a detailed test report will be generated in the target/cucumber-reports folder. This report includes passed/failed tests, execution time, and any errors encountered.
