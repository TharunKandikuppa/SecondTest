import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CpThreeOtpLogin {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaotploginpage.ccbp.tech");
        WebElement emailEnter = driver.findElement(By.cssSelector("input#email"));
        emailEnter.sendKeys("example@gmail.com");
        WebElement sendOtp = driver.findElement(By.cssSelector("button.send-otp-btn"));
        sendOtp.click();
        String curpageTitle = driver.getTitle();
        String exppageTitle = "OTP Verification";
        if (curpageTitle.equals(exppageTitle)) {
            System.out.println("Good");
        }
        else {
            System.out.println("Not Good");
        }
        WebElement otpEnter = driver.findElement(By.cssSelector("input#otp"));
        otpEnter.sendKeys("123456");
        WebElement verifyBut = driver.findElement(By.cssSelector("button#verifyOtpBtn"));
        verifyBut.click();
        String expUrl = "https://qaotploginpage.ccbp.tech/home";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expUrl));
        String curUrl = driver.getCurrentUrl();
        if (expUrl.equals(curUrl)) {
            System.out.println("Good");
        }
        else {
            System.out.println("Not Good");
        }

        driver.quit();
    }
}
