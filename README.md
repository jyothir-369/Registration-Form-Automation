# Intelligent Registration System

Modern, responsive registration form with real-time **client-side validation** and **end-to-end Selenium WebDriver automation** (Java).

<p align="center">
  <strong>Beautiful UI + Robust Validation + Reliable Automation</strong>
</p>

## ✨ Key Features

### Form Fields
- First Name (required)
- Last Name (required)
- Email (required, disposable domains blocked)
- Phone Number (required, country-specific format validation)
- Age
- Gender (Male / Female / Other)
- Address
- Country (dropdown)
- State (dynamic dropdown)
- City (dynamic dropdown)
- Password
- Confirm Password
- Terms & Conditions (checkbox – required)

### Client-Side Validations
- Required fields check
- Real-time inline error messages + red field highlighting
- Submit button disabled until form is 100% valid
- Email format + disposable domain detection
- Phone number validation based on selected country
- Password strength meter (Weak / Medium / Strong) with visual indicator
- Confirm Password matching validation
- Form resets automatically after successful submission

### Dynamic & Interactive Behavior
- Country selection → updates State dropdown
- State selection → updates City dropdown
- Live password strength feedback
- Real-time form validity status

### User Feedback
- Inline red error messages for each invalid field
- Top-level success/error notification
- Success message: **"Registration Successful!"**

## 🤖 Automation Testing (Selenium + Java)

### Test Scenarios

**Negative Scenario**  
- Submit form with missing Last Name  
- Verify error message and field highlighting  
- Screenshot captured: `screen shot1.png`

**Positive Scenario (Happy Path)**  
- Fill all fields with valid data  
- Password & Confirm Password match  
- Accept Terms & Conditions  
- Submit → verify success message + form reset  
- Screenshot captured: `screen shot2.png`

**Form Logic & UI Validation**  
- Country → State dropdown population  
- State → City dropdown population  
- Password strength indicator updates correctly  
- Mismatched Confirm Password shows error  
- Submit button disabled/enabled in real-time

### Automation Highlights
- Selenium WebDriver + Java
- Explicit waits (`WebDriverWait`) – no `Thread.sleep()`
- Automatic ChromeDriver management (Selenium Manager)
- Page title & URL verification
- Screenshots on key validation points

## 🛠 Tech Stack

**Frontend**  
- HTML5  
- CSS3 (Glassmorphism + animations)  
- Vanilla JavaScript

**Automation**  
- Java  
- Selenium WebDriver  
- Chrome Browser

## 📂 Project Structure
registration-system/
├── index.html                  # Main registration form page
├── style.css                   # All styling & responsive design
├── script.js                   # Client-side validation & dynamic logic
├── RegistrationTest.java       # Selenium automation test script
├── screenshots/                # Captured test screenshots
│   ├── screen shot1.png        # Error / validation failure state
│   └── screen shot2.png        # Successful registration state
└── README.md                   # This documentation file


## ▶️ How to Run

### 1. Manual Testing (UI)
1. Open `index.html` in any modern browser  
2. Fill the form and test validations

### 2. Run Automation Tests
**Requirements**
- Java 8 or higher installed
- Internet connection (first run downloads ChromeDriver)

**Steps**
1. Open the project folder in IntelliJ IDEA, Eclipse, or VS Code
2. Run `RegistrationTest.java` as a Java application / test
3. Chrome browser will launch automatically
4. Tests will execute and save screenshots in `screenshots/`

## 📸 Screenshots

<p align="center">
  <img src="https://github.com/jyothir-369/Registration-Form-Automation/blob/main/screenshots/screen%20shot1.png" width="48%" alt="Form with validation errors - Negative test case" /><br><br>
  <img src="https://github.com/jyothir-369/Registration-Form-Automation/blob/main/screenshots/screen%20shot2.png" width="48%" alt="Successful registration - Positive test case" />
</p>

---

**Author:** Jyothir Raghavalu Bhogi  
**GitHub:** [@jyothir-369](https://github.com/jyothir-369)  
**Repository:** [Registration-Form-Automation](https://github.com/jyothir-369/Registration-Form-Automation)
