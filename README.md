# 🛒 Tricentis Demo Web Shop Automation Testing

## 📌 Overview

This project automates key user flows of the Tricentis Demo Web Shop, including:

* User registration and login
* Product search and browsing
* Adding items to the cart
* Checkout and order placement
* Order confirmation and validation

The automation suite emphasizes reliability, maintainability, and reusability by implementing clean code principles and structured test components.

## ⚙️ Tech Stack

* **Programming Language**: Java
* **Testing Framework**: TestNG / JUnit
* **Automation Tool**: Selenium WebDriver
* **Build Tool**: Maven / Gradle
* **Design Pattern**: Page Object Model (POM)
* **Reporting**: Allure / ExtentReports
* **CI/CD**: GitHub Actions / Jenkins (optional)
* **Test Data**: JSON / CSV (if applicable)

## 📁 Project Structure

```
├── src/test/java
│   ├── tests         # Test classes
│   ├── pages         # Page Object classes
│   └── utils         # Utility classes and helpers
├── test-data         # Test data files (JSON/CSV/etc.)
├── reports           # Generated test reports
├── pom.xml           # Maven build configuration
└── README.md         # Project documentation
```

## ✅ Features

* Modular Page Object Model for better maintainability
* Cross-browser execution support
* Externalized test data
* CI-friendly setup with easy integration
* Interactive and comprehensive test reports

## 🚀 Getting Started

Clone the repository and run tests locally:

```bash
git clone https://github.com/yourusername/tricentis-webshop-automation.git
cd tricentis-webshop-automation
mvn clean install
```

## 🧪 Running Tests

To execute tests:

```bash
mvn test
```

Test results will be generated in the `reports` directory.

## 📝 Contributing

Contributions are welcome! Please fork the repository, create a new branch, and submit a pull request with your changes.

---
