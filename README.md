<p align="center">
  <img src="https://github.com/jyothir-369/Registration-Form-Automation/blob/main/screenshots/screen%20shot1.png" width="45%" />
  <img src="https://github.com/jyothir-369/Registration-Form-Automation/blob/main/screenshots/screen%20shot2.png" width="45%" />
</p>

# Intelligent Registration System

## 📌 Project Overview
This project is a modern, responsive **Registration System** built using **HTML, CSS, and JavaScript**, with complete **client-side validations** and **automation testing using Selenium WebDriver (Java)**.

The goal of this project is to demonstrate:
- UI development skills  
- Client-side validation logic  
- Dynamic form behavior  
- End-to-end UI automation  

---

## 📂 Project Structure
registration-system/
├── index.html
├── style.css
├── script.js
├── RegistrationTest.java
├── screenshots/
│ ├── screen shot1.png
│ └── screen shot2.png
└── README.md


---

## 🧩 Features Implemented

### 🔹 Registration Form Fields
- First Name (Required)  
- Last Name (Required)  
- Email (Required)  
- Phone Number (Required)  
- Age  
- Gender (Male / Female / Other)  
- Address  
- Country (Dropdown)  
- State (Dynamic Dropdown)  
- City (Dynamic Dropdown)  
- Password  
- Confirm Password  
- Terms & Conditions (Required)  

---

## ✅ Client-Side Validations
- Required fields validation  
- Inline error messages with red highlight  
- Submit button disabled until form is valid  
- Email validation (blocks disposable domains)  
- Phone number validation based on selected country  
- Password strength meter (Weak / Medium / Strong)  
- Password & Confirm Password matching validation  

---

## 🤖 Automation Testing (Selenium)

### 🔴 Automation Flow A — Negative Scenario
**Missing required Last Name field**

<p align="center">
  <img src="https://github.com/jyothir-369/Registration-Form-Automation/blob/main/screenshots/screen%20shot1.png" width="70%" />
</p>

**Validated:**
- Inline error message displayed  
- Field highlighted in red  
- Form submission blocked  

---

### 🟢 Automation Flow B — Positive Scenario
**Successful form submission with valid inputs**

<p align="center">
  <img src="https://github.com/jyothir-369/Registration-Form-Automation/blob/main/screenshots/screen%20shot2.png" width="70%" />
</p>

**Validated:**
- Success message displayed  
- Form reset after submission  

---

### 🟡 Automation Flow C — Form Logic Validation
- Country → State dropdown updates  
- State → City dropdown updates  
- Password strength validation  
- Confirm password mismatch validation  
- Submit button disabled until form is valid  

---

## ⏳ Synchronization Handling
- Explicit waits (`WebDriverWait`) instead of `Thread.sleep`  
- Stable handling of dynamic UI elements  

---

## ▶️ How to Run the Project

### 🔹 Run UI Manually
1. Open `index.html` in any modern browser  
2. Test validations and dropdown behavior  

### 🔹 Run Automation Script
1. Ensure Java is installed  
2. Open project in IntelliJ / Eclipse  
3. Run `RegistrationTest.java`  
4. Chrome launches automatically  
5. Screenshots captured during execution  

---

## 🎥 Demo Video
A recorded video demonstrating the automation execution is included in the submission.

---

## 🏁 Conclusion
This project demonstrates:
- Professional UI design  
- Strong client-side validation logic  
- Real-world Selenium automation practices  

---

## ✨ Bonus Enhancements
- Modern UI with animations  
- Glassmorphism form design  
- Responsive layout  

---

**Author:** Jyothir Raghavalu Bhogi  
**GitHub:** https://github.com/jyothir-369
