import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class RegistrationTest {

    static WebDriver driver;

    public static void main(String[] args) throws Exception {

        // Launch Chrome using Selenium Manager
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 🔴 CHANGE THIS PATH to your actual index.html location
        driver.get("file:///C:/Users/Jyothir/Desktop/registration-system/index.html");

        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());

        // Execute test flows
        negativeScenario();
        positiveScenario();
        logicValidation();

        driver.quit();
    }

    // 🔴 NEGATIVE SCENARIO (Missing Last Name)
    static void negativeScenario() throws Exception {
        driver.findElement(By.id("firstName")).sendKeys("Jyothir");
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("+919999999999");
        driver.findElement(By.xpath("//input[@value='Male']")).click();

        driver.findElement(By.id("submitBtn")).click();

        takeScreenshot("screenshots/error-state.png");
        System.out.println("Negative scenario validated");
    }

    // 🟢 POSITIVE SCENARIO (Successful Registration)
    static void positiveScenario() throws Exception {
        driver.navigate().refresh();

        driver.findElement(By.id("firstName")).sendKeys("Jyothir");
        driver.findElement(By.id("lastName")).sendKeys("Bhogi");
        driver.findElement(By.id("email")).sendKeys("jyothir@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("+919999999999");
        driver.findElement(By.xpath("//input[@value='Male']")).click();

        new Select(driver.findElement(By.id("country"))).selectByVisibleText("India");
        Thread.sleep(500);

        new Select(driver.findElement(By.id("state"))).selectByIndex(1);
        Thread.sleep(500);

        new Select(driver.findElement(By.id("city"))).selectByIndex(1);

        driver.findElement(By.id("password")).sendKeys("StrongPass123");
        driver.findElement(By.id("confirmPassword")).sendKeys("StrongPass123");

        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("submitBtn")).click();

        takeScreenshot("screenshots/success-state.png");
        System.out.println("Positive scenario validated");
    }

    // 🟡 LOGIC VALIDATION (Dropdowns + Password)
    static void logicValidation() throws Exception {
        driver.navigate().refresh();

        new Select(driver.findElement(By.id("country"))).selectByVisibleText("USA");
        new Select(driver.findElement(By.id("state"))).selectByIndex(1);
        new Select(driver.findElement(By.id("city"))).selectByIndex(1);

        driver.findElement(By.id("password")).sendKeys("abc");
        Thread.sleep(1000);

        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("StrongPassword123");

        driver.findElement(By.id("confirmPassword")).sendKeys("WrongPass");
        Thread.sleep(1000);

        System.out.println("Form logic validations tested");
    }

    // 📸 SCREENSHOT METHOD
    static void takeScreenshot(String path) throws Exception {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File(path));
    }
}
