import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CpTowLoginTest {

    public static void main(String[] args) {

        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");

        // Launch Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("https://qaebank.ccbp.tech/ebank/login");

        // Find the username input element
        WebElement usernameEl = driver.findElement(By.id("userIdInput"));

        // Enter the username
        usernameEl.sendKeys("142420");
        System.out.println("Username entered");

        // Find the password input element
        WebElement passwordEl = driver.findElement(By.id("pinInput"));

        // Enter the password
        passwordEl.sendKeys("231225");
        System.out.println("Password entered");

        //  Find the submit button element
        WebElement submitButtonEl = driver.findElement(By.className("login-button"));

        // Submit the login form
        submitButtonEl.submit();
        System.out.println("Submitted login details");

        // Define the expected URL of the home page
        String expectedUrl = "https://qaebank.ccbp.tech/";

        // Wait for the expected URL to be loaded
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedUrl));

        // Get the current URL after login
        String currentUrl = driver.getCurrentUrl();

        // Verify the successful login
        if (currentUrl.equals(expectedUrl)) {
            System.out.println("Logged in successfully");
            System.out.println(driver.getTitle());
        }

        // Find the Logout button element
        WebElement logoutButtonEl = driver.findElement(By.className("logout-button"));

        // Click the logout button
        logoutButtonEl.click();

        // Define the expected URL of the login page
        String expectedUrl2 = "https://qaebank.ccbp.tech/ebank/login";

        // Wait for the expected URL to be loaded
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait2.until(ExpectedConditions.urlToBe(expectedUrl2));

        // Get the current url after logout
        String currentUrl2 = driver.getCurrentUrl();

        // Verify the successful logout
        if (currentUrl2.equals(expectedUrl2)) {
            System.out.println("Logged out successfully");
        }

        // Quit the WebDriver instance
        driver.quit();

    }
}