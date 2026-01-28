const submitBtn = document.getElementById("submitBtn");

const country = document.getElementById("country");
const state = document.getElementById("state");
const city = document.getElementById("city");

const countryStateCity = {
    India: {
        Telangana: ["Hyderabad", "Warangal"],
        Karnataka: ["Bangalore", "Mysore"]
    },
    USA: {
        Texas: ["Dallas", "Austin"],
        California: ["LA", "San Diego"]
    }
};

// ===== Country → State =====
country.addEventListener("change", function () {
    state.innerHTML = "<option value=''>Select State</option>";
    city.innerHTML = "<option value=''>Select City</option>";

    if (!this.value) return;

    const states = countryStateCity[this.value];
    for (let s in states) {
        state.innerHTML += `<option value="${s}">${s}</option>`;
    }
});

// ===== State → City =====
state.addEventListener("change", function () {
    city.innerHTML = "<option value=''>Select City</option>";

    if (!this.value) return;

    const cities = countryStateCity[country.value][this.value];
    cities.forEach(c => {
        city.innerHTML += `<option value="${c}">${c}</option>`;
    });
});

// ===== Password strength =====
document.getElementById("password").addEventListener("input", function () {
    const strength = document.getElementById("strength");

    if (this.value.length < 6) {
        strength.style.background = "red";
    } else if (this.value.length < 10) {
        strength.style.background = "orange";
    } else {
        strength.style.background = "green";
    }
});

// ===== Validation =====
document.getElementById("registrationForm").addEventListener("input", validate);

function validate() {
    let valid = true;

    if (!firstName.value) {
        firstNameError.innerText = "First name required";
        valid = false;
    } else firstNameError.innerText = "";

    if (!lastName.value) {
        lastNameError.innerText = "Last name required";
        valid = false;
    } else lastNameError.innerText = "";

    if (password.value !== confirmPassword.value) {
        confirmError.innerText = "Passwords do not match";
        valid = false;
    } else confirmError.innerText = "";

    if (!terms.checked) {
        termsError.innerText = "Accept terms";
        valid = false;
    } else termsError.innerText = "";

    submitBtn.disabled = !valid;
}

// ===== Submit =====
document.getElementById("registrationForm").addEventListener("submit", function (e) {
    e.preventDefault();
    successMsg.innerText = "Registration Successful!";
    this.reset();
    submitBtn.disabled = true;
});
