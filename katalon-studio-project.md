# AO Automation Test – Project Documentation

## 1. Project Overview
The **AO Automation Test** project is a Katalon Studio–based test automation framework designed to validate web-based workflows for the *Archive One (AO)* application. The project follows Katalon’s standard structure and supports UI-driven functional testing, regression testing, and environment-based execution.

This documentation provides:
- A full project structure explanation
- Test architecture and execution flow
- Common errors found in the project
- Root cause analysis
- Detailed recommendations and fixes
- External learning references (Katalon Academy)

---

## 2. Technology Stack
- **Automation Tool:** Katalon Studio
- **Language:** Groovy (Katalon Keywords & Test Cases)
- **Automation Engine:** Selenium WebDriver
- **Build Tool:** Gradle (`build.gradle`)
- **Target Application:** Archive One (Web)

---

## 3. Project Structure Breakdown

### 3.1 Core Configuration Files
| File | Purpose |
|-----|--------|
| `AO Automation Test.prj` | Katalon project definition |
| `build.gradle` | Dependency & build configuration |
| `console.properties` | Runtime execution settings |
| `cookies.json` | Session/cookie persistence (if used) |

---

### 3.2 Test Assets

#### **Test Cases/**
Contains all UI automation scripts written in Groovy. Each test case represents a functional scenario (e.g., add note, search document, open record).

#### **Test Suites/**
Logical grouping of test cases for:
- Regression testing
- Smoke testing
- Feature-based execution

#### **Object Repository/**
Stores all UI element locators (XPath, CSS, attributes). This is a critical dependency for test stability.

#### **Keywords/**
Custom reusable functions extending Katalon’s built-in keywords.

#### **Data Files/**
External test data sources used for data-driven testing.

---

### 3.3 Supporting Components

| Folder | Description |
|------|------------|
| `Drivers/` | Browser drivers (Chrome, Edge, etc.) |
| `Profiles/` | Environment variables (QA, UAT, PROD) |
| `Reports/` | Execution results and error logs |
| `Test Listeners/` | Pre/Post execution hooks |
| `Plugins/` | Katalon plugins |

---

## 4. Test Execution Flow
1. Test Suite is triggered (manual or CI)
2. Environment Profile is loaded
3. Browser driver is initialized
4. Test Listener (Before Test Suite) executes
5. Test Cases run sequentially
6. UI elements are resolved via Object Repository
7. Verification steps assert expected behavior
8. Reports and logs are generated

---

## 5. Common Errors Identified in the Project
Based on analysis of execution logs inside the **Reports/** directory, the following recurring issues were identified.

---

### 5.1 Element Not Found / Not Visible

**Typical Error:**
```
StepFailedException: Web element located by XPath not found
Unable to verify object is visible
```

**Root Causes:**
- Dynamic element IDs (e.g., `doctitle_2980`)
- Page not fully loaded
- AJAX-rendered elements
- Incorrect page navigation

**Recommendations:**
- Avoid hard-coded dynamic IDs
- Use resilient locators:
```xpath
//a[contains(@id,'doctitle_')]
//a[contains(text(),'Manalo')]
```
- Add explicit waits:
```groovy
WebUI.waitForElementVisible(obj, 30)
```

---

### 5.2 Timing & Synchronization Failures

**Symptoms:**
- Tests pass locally but fail in CI
- Random or flaky failures

**Root Causes:**
- `verifyElementVisible` used without waits
- Heavy page load or slow network

**Fix:**
- Replace immediate verification with wait-based logic
- Use `waitForElementPresent` before interaction

---

### 5.3 Data Dependency Failures

**Symptoms:**
- Tests fail only when certain records are missing
- Errors when verifying specific document names

**Root Causes:**
- Test data not created during setup
- Shared environment data modified by other tests

**Fix:**
- Create test data as part of test setup
- Use unique, test-generated records
- Implement teardown cleanup

---

### 5.4 Locator Fragility

**Symptoms:**
- Tests break after UI changes

**Root Causes:**
- Absolute XPath usage
- Over-reliance on index-based selectors

**Fix:**
- Prefer relative XPath
- Use stable attributes (name, aria-label, data-*)

---

### 5.5 Environment Configuration Issues

**Symptoms:**
- Tests fail only in certain profiles

**Root Causes:**
- Incorrect URLs or credentials
- Missing profile variables

**Fix:**
- Validate all Profiles before execution
- Add environment validation test case

---

## 6. Best Practices Recommendations

### 6.1 Object Repository Standards
- One object = one responsibility
- Avoid duplicate locators
- Name objects clearly and consistently

### 6.2 Test Case Design
- One test case = one business scenario
- Avoid chaining too many verifications
- Fail fast with meaningful messages

### 6.3 Reporting & Debugging
- Enable screenshots on failure
- Attach logs to CI artifacts
- Review Reports after every run

---

## 7. Learning & Reference Links
- **Katalon Academy (Official):**
  https://academy.katalon.com
- **Handling Dynamic Objects:**
  https://docs.katalon.com/docs/automate/handle-dynamic-elements
- **Synchronization & Waits:**
  https://docs.katalon.com/docs/automate/web-testing/waits
- **Object Repository Best Practices:**
  https://docs.katalon.com/docs/manage-test-artifacts/object-repository

---

## 8. Conclusion
The AO Automation Test project is well-structured and aligns with Katalon standards. Most failures are caused by **locator instability, timing issues, and data dependency**, not framework defects. By improving locator strategies, enforcing waits, and stabilizing test data, the overall reliability and maintainability of the automation suite can be significantly improved.

This document can be used for **onboarding, maintenance, audits, and CI troubleshooting**.

