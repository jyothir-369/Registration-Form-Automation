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
├── index.html # Registration form UI
├── style.css # Styling & responsive design
├── script.js # Client-side validation & logic
├── RegistrationTest.java # Selenium automation script
├── screenshots/
│ ├── screen shot1.png
│ └── screen shot2.png
└── README.md # Project documentation


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

## 🎯 User Feedback
- Inline error messages for invalid fields  
- Top-level error feedback  
- Success message on successful registration:  
  - **"Registration Successful!"**  
- Form resets after successful submission  

---

## 🔄 Dynamic Dropdown Logic
- Country selection updates State options  
- State selection updates City options  
- JavaScript event-based DOM updates  

---

## 🤖 Automation Testing (Selenium)

### 🛠 Tools & Technologies
- Selenium WebDriver  
- Java  
- Chrome Browser  
- Selenium Manager (no manual driver setup)  

---

## 🔁 Automated Test Scenarios

### 🔴 Automation Flow A — Negative Scenario
1. Launch the web page  
2. Print Page URL and Page Title  
3. Fill the form with missing Last Name  
4. Submit the form  
5. Validate:  
   - Error message for missing Last Name  
   - Error field highlighting  
6. Capture screenshot: `screen shot1.png`  

---

### 🟢 Automation Flow B — Positive Scenario
1. Fill the form with all valid data  
2. Ensure Password & Confirm Password match  
3. Accept Terms & Conditions  
4. Submit the form  
5. Validate:  
   - Success message appears  
   - Form fields are reset  
6. Capture screenshot: `screen shot2.png`  

---

### 🟡 Automation Flow C — Form Logic Validation
1. Change Country → verify State dropdown updates  
2. Change State → verify City dropdown updates  
3. Validate password strength behavior  
4. Test incorrect Confirm Password error  
5. Verify submit button is disabled until form is valid  

---

## ⏳ Synchronization Handling
- Explicit waits (`WebDriverWait`) are used instead of `Thread.sleep`  
- Ensures stable automation for dynamic dropdown updates  

---

## ▶️ How to Run the Project

### 🔹 Run UI Manually
1. Open `index.html` in any modern browser  
2. Fill the form and test validations  

### 🔹 Run Automation Script
1. Ensure Java is installed  
2. Open the project in an IDE (IntelliJ / Eclipse)  
3. Run `RegistrationTest.java`  
4. Chrome browser will launch automatically  
5. Screenshots will be captured during execution  

---

## 📸 Screenshots
- `screenshots/screen shot1.png` (Error State)  
- `screenshots/screen shot2.png` (Success State)  

---

## 🎥 Demo Video
A screen recording demonstrating the automation execution is included with the submission.

---

## 🏁 Conclusion
This project demonstrates:
- Clean UI design  
- Robust client-side validation  
- Dynamic form logic  
- Reliable Selenium automation  

It closely follows real-world QA and UI automation practices.

---

## ✨ Bonus Enhancements
- Modern UI with animations  
- Glassmorphism form design  
- Responsive layout for mobile devices  

---

**Author:** Jyothir Raghavalu Bhogi  
**GitHub:** https://github.com/jyothir-369
