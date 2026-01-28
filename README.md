<p align="center">
  <img src="https://github.com/jyothir-369/Registration-Form-Automation/blob/main/screenshots/screen%20shot1.png" width="45%" alt="Error State" />
  <img src="https://github.com/jyothir-369/Registration-Form-Automation/blob/main/screenshots/screen%20shot2.png" width="45%" alt="Success State" />
</p>

# Intelligent Registration System

Modern, responsive **registration form** with real-time client-side validation and **end-to-end Selenium automation testing**.

## ✨ Features

### Form Fields
- First Name (required)
- Last Name (required)
- Email (required, disposable domains blocked)
- Phone Number (required, country-specific format)
- Age
- Gender (Male / Female / Other)
- Address
- Country (dropdown)
- State (dynamic dropdown)
- City (dynamic dropdown)
- Password + Confirm Password
- Terms & Conditions checkbox (required)

### Client-Side Validations
- Required field checks
- Real-time inline error messages + field highlighting
- Submit button disabled until form is valid
- Email format + disposable domain detection
- Phone number validation (based on selected country)
- Password strength meter (Weak / Medium / Strong)
- Password matching validation
- Form reset after successful submission

### Dynamic Behavior
- Country → updates available States
- State → updates available Cities
- Password strength visualization
- Real-time form validity status

### User Feedback
- Inline red error messages
- Top-level summary message
- Success toast: **"Registration Successful!"**

## 🤖 Automation Testing (Selenium + Java)

### Implemented Test Flows

**Flow A – Negative Case**  
- Submit form with missing Last Name  
- Verify: error message + field highlight  
- Screenshot: `screen shot1.png`

**Flow B – Positive Case (Happy Path)**  
- Fill all fields with valid data  
- Accept terms  
- Submit → verify success message & form reset  
- Screenshot: `screen shot2.png`

**Flow C – Form Logic & UI Validation**  
- Country → State dropdown population  
- State → City dropdown population  
- Password strength indicator behavior  
- Mismatched confirm password error  
- Submit button disabled/enabled correctly

### Automation Highlights
- Uses **Selenium WebDriver + Java**
- **Explicit waits** (`WebDriverWait`) – no `Thread.sleep()`
- Selenium Manager (auto driver handling)
- Screenshot capture on key steps
- Page title & URL verification

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
├── index.html          # Main registration form
├── style.css           # Styles & responsive design
├── script.js           # Form logic & validations
├── RegistrationTest.java # Selenium test script
├── screenshots/
│   ├── screen shot1.png    # Error case
│   └── screen shot2.png    # Success case
└── README.md
text## ▶️ How to Run

### 1. Open the Form (Manual Testing)

Just double-click `index.html` or open it with any modern browser.

### 2. Run Automation Tests

**Prerequisites**
- Java 8+ installed
- Internet connection (first run downloads ChromeDriver)

**Steps**
1. Open project in IntelliJ / Eclipse / VS Code
2. Right-click → Run `RegistrationTest.java`
3. Watch Chrome launch and execute tests automatically
4. Check console output + `screenshots/` folder

## 🎥 Demo

A short screen recording showing the automation flow is included in the submission.

## 📸 Screenshots

<p align="center">
  <img src="https://github.com/jyothir-369/Registration-Form-Automation/blob/main/screenshots/screen%20shot1.png" width="48%" alt="Form with validation errors" />
  <br><br>
  <img src="https://github.com/jyothir-369/Registration-Form-Automation/blob/main/screenshots/screen%20shot2.png" width="48%" alt="Successful registration" />
</p>

---

**Author:** Jyothir Raghavalu Bhogi  
**GitHub:** https://github.com/jyothir-369  
**Project Repo:** https://github.com/jyothir-369/Registration-Form-Automation
