<p align="center">
  <img src="screenshots/screenshot1.png" alt="Form with validation errors" width="45%" />
  <img src="screenshots/screenshot2.png" alt="Successful registration" width="45%" />
  <br><br>
  <b>Intelligent Registration System</b>
</p>

<h1 align="center">Intelligent Registration System</h1>

<p align="center">
  <a href="https://github.com/jyothir-369/Registration-Form-Automation/stargazers">
    <img src="https://img.shields.io/github/stars/jyothir-369/Registration-Form-Automation?style=social" alt="GitHub stars">
  </a>
  <a href="https://github.com/jyothir-369/Registration-Form-Automation/fork">
    <img src="https://img.shields.io/github/forks/jyothir-369/Registration-Form-Automation?style=social" alt="GitHub forks">
  </a>
</p>

## 📌 Project Overview

A modern, responsive **Registration Form** with comprehensive **client-side validation** (HTML, CSS, JavaScript) and **end-to-end automation testing** using **Selenium WebDriver (Java)**.

**Key demonstration areas:**
- Clean & modern UI development
- Robust client-side form validation
- Dynamic & dependent dropdowns
- Professional Selenium automation with screenshots

---

## 📂 Project Structure
registration-system/
├── index.html          # Main registration form
├── style.css           # Styling & responsive design (glassmorphism + animations)
├── script.js           # Form validation, dynamic dropdowns, password strength
├── RegistrationTest.java  # Selenium WebDriver automation script (Java)
├── screenshots/
│   ├── screenshot1.png    # Error state example
│   └── screenshot2.png    # Success state example
└── README.md
text---

## 🧩 Features

### Form Fields
- First Name (required)
- Last Name (required)
- Email (required, format + disposable domain check)
- Phone Number (required, country-based format)
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
- Email format + disposable domain blocking
- Phone number format validation (based on country)
- Password strength meter (Weak / Medium / Strong)
- Confirm Password matching check

### User Experience
- Instant inline + top-level feedback
- **"Registration Successful!"** message on submit
- Form auto-reset after success
- Smooth animations & glassmorphism design
- Fully responsive (mobile-friendly)

### Dynamic Behavior
- Country → auto-populates State dropdown
- State → auto-populates City dropdown
- Event-driven JavaScript updates

---

## 🤖 Automation Testing (Selenium)

**Tech stack:**
- Selenium WebDriver (Java)
- Chrome Browser
- Selenium Manager (auto driver management – no manual setup)

### Test Scenarios Covered

**Negative Flow (Flow A)**  
→ Missing required field (Last Name)  
→ Validates error message & field highlight  
→ Captures `screenshot1.png`

**Positive Flow (Flow B)**  
→ Complete valid data entry  
→ Password match + Terms accepted  
→ Validates success message + form reset  
→ Captures `screenshot2.png`

**Logic Validation (Flow C)**  
- Country/State/City dependency checks
- Password strength indicator behavior
- Mismatched confirm password error
- Submit button disabled/enabled logic

**Good practices used:**
- Explicit waits (`WebDriverWait`) instead of `Thread.sleep`
- Stable handling of dynamic elements

---

## ▶️ How to Run

### 1. View & Test the Form Manually
```bash
# Just open in browser
open index.html    # macOS
start index.html   # Windows
xdg-open index.html # Linux
2. Run Selenium Automation
Prerequisites:

Java 8+ installed
Any IDE (IntelliJ IDEA / Eclipse recommended)

Steps:

Open project in IDE
Run RegistrationTest.java as a Java application
Chrome browser opens automatically
Automation executes → screenshots saved in /screenshots/


📸 Screenshots
Error StateSuccess Statescreenshots/screenshot1.pngscreenshots/screenshot2.png

🎥 Demo
A short screen recording showing the full automation flow (positive + negative scenarios) is included in the submission / repository.

🏁 Summary
This project showcases:

Modern, responsive UI with animations
Production-grade client-side validation
Dynamic form logic
Reliable, real-world Selenium automation practices

Great for portfolios, interview demos, or learning QA + front-end automation.

Author: Jyothir Raghavalu Bhogi
GitHub: jyothir-369
Repository: Registration-Form-Automation
