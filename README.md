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

#### Root Cause
- Dynamic element IDs (e.g., `doctitle_2980`)
- Element rendered via AJAX
- Verification executed before page load completion

#### Step-by-Step Fix

**Step 1: Identify if the locator uses a dynamic ID**
- Open the Object Repository entry
- Check if the XPath relies on a numeric or changing ID

📘 Reference:
https://docs.katalon.com/docs/manage-test-artifacts/object-repository

---

**Step 2: Replace dynamic ID with a resilient locator**
```xpath
//a[contains(@id,'doctitle_')]
//a[contains(text(),'Manalo')]
```

📘 Reference:
https://docs.katalon.com/docs/automate/handle-dynamic-elements

---

**Step 3: Add an explicit wait before verification**
```groovy
WebUI.waitForElementVisible(obj, 30)
WebUI.verifyElementVisible(obj)
```

📘 Reference:
https://docs.katalon.com/docs/automate/web-testing/waits

---

### 5.2 Timing & Synchronization Failures

#### Root Cause
- Immediate verification without waits
- Slow network or heavy UI rendering

#### Step-by-Step Fix

**Step 1: Replace `verifyElementVisible` with wait-based flow**
```groovy
WebUI.waitForElementPresent(obj, 30)
```

📘 Reference:
https://docs.katalon.com/docs/automate/web-testing/waits

---

**Step 2: Validate page load before interacting**
```groovy
WebUI.waitForPageLoad(30)
```

📘 Reference:
https://docs.katalon.com/docs/automate/web-testing/page-load-timeout

---

### 5.3 Data Dependency Failures

#### Root Cause
- Test relies on pre-existing records
- Shared environment data modified by other tests

#### Step-by-Step Fix

**Step 1: Create test data during setup**
- Add a setup test case to create required records

📘 Reference:
https://academy.katalon.com/courses/data-driven-testing

---

**Step 2: Use unique test data identifiers**
```groovy
def docName = "AUTO_DOC_" + System.currentTimeMillis()
```

📘 Reference:
https://docs.katalon.com/docs/automate/data-driven-testing

---

### 5.4 Locator Fragility

#### Root Cause
- Absolute XPath usage
- Index-based locators

#### Step-by-Step Fix

**Step 1: Replace absolute XPath with relative XPath**
```xpath
//div[@class='document-list']//a
```

📘 Reference:
https://academy.katalon.com/courses/web-element-locators

---

### 5.5 Environment Configuration Issues

#### Root Cause
- Missing or incorrect profile variables

#### Step-by-Step Fix

**Step 1: Validate Profiles before execution**
- Open **Profiles/** folder
- Ensure all required variables exist

📘 Reference:
https://docs.katalon.com/docs/run/execute-tests-with-profiles

---

**Step 2: Add environment validation test case**
```groovy
WebUI.verifyNotEqual(GlobalVariable.baseUrl, '')
```

📘 Reference:
https://docs.katalon.com/docs/maintain/global-variables

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

