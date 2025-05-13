# SeleniumBDD: Web UI Automation with Selenium and Cucumber

This project demonstrates UI automation testing using Selenium WebDriver with Java, structured with the Page Object Model (POM) and Behaviour-Driven Development (BDD) principles using Cucumber. It showcases best practices in test automation, including clear test definitions, maintainable page objects, and integration with CI/CD pipelines.

The primary goal was to re-familiarize with Selenium WebDriver, explore modern automation practices, and integrate Cucumber for behaviour-driven tests, culminating in a project suitable for a portfolio.

## Features

*   **Behaviour-Driven Development (BDD):** Uses Cucumber for writing test scenarios in a human-readable Gherkin format (`.feature` files).
*   **Page Object Model (POM):** Implements the POM design pattern for maintainable and reusable page-specific code.
*   **Selenium WebDriver:** Automates browser interactions for UI testing.
*   **Multiple Test Scenarios:** Includes tests for various user interactions (e.g., successful login, login with incorrect credentials, login with empty fields).
*   **Cross-Browser Testing (Setup):** Configured to run tests, including in headless mode, which is essential for CI environments.
*   **Gradle Build Automation:** Uses Gradle for managing dependencies and running tests.
*   **JUnit 5:** Leveraged for assertions within step definitions.
*   **CI/CD Integration:** Includes a GitHub Actions workflow (`.github/workflows/ci.yml`) to automatically run tests on push.

## Technologies Used

*   **Java:** Programming language for test development.
*   **Selenium WebDriver:** For browser automation.
*   **Cucumber:** For BDD and Gherkin feature files.
*   **Gradle:** For build automation and dependency management.
*   **JUnit 5:** For assertions in tests.
*   **GitHub Actions:** For Continuous Integration.
*   **Target Application:** OrangeHRM Demo Site

## Getting Started

### Prerequisites

*   Java Development Kit (JDK) 11 or higher installed.
*   Gradle installed (or use the Gradle wrapper `gradlew` provided in the project).
*   A compatible web browser (e.g., Chrome, Firefox).

### Setup

1.  **Clone the repository:**

2. **Running Tests**
To run all Cucumber tests, execute the following Gradle command from the project root directory:
```
./gradlew test
```

Test reports can be found in the `build/reports/tests/test/` directory. Cucumber reports might also be configured (check `build.gradle` for specific report paths if custom reporters are added).

## Project Structure Highlights

*   `src/main/java/jp/funk/pages/`: Contains Page Object classes (e.g., `LoginPage.java`, `DashboardPage.java`).
*   `src/test/java/jp/funk/steps/`: Contains Cucumber step definition classes (e.g., `LoginSteps.java`).
*   `src/test/java/jp/funk/utils/`: Utility classes like `WebDriverManager.java`.
*   `src/test/resources/features/`: Contains Cucumber feature files (e.g., `login.feature`).
*   `.github/workflows/ci.yml`: GitHub Actions workflow configuration for automated testing.
*   `build.gradle`: Gradle build script defining dependencies and tasks.
*   `JOURNAL.md`: A development journal tracking progress, challenges, and learnings.

## Key Learnings & Milestones

*   Successfully set up Selenium WebDriver with Java and Gradle.
*   Implemented the Page Object Model for robust and maintainable tests.
*   Integrated Cucumber for BDD, writing tests in Gherkin.
*   Overcame challenges with step definition inheritance by using composition.
*   Configured tests to run in headless mode for CI/CD environments.
*   Set up a GitHub Actions workflow to automate test execution on every push.
*   Migrated from a complex target site (eBay) to a simpler one (OrangeHRM) for more focused learning on automation fundamentals.
