import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class CpFourteenSecureFileDownloaderTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qasecdwnld.ccbp.tech/");
        WebElement emailEl = driver.findElement(By.cssSelector("input#email"));
        emailEl.sendKeys("example");
        WebElement butEl = driver.findElement(By.cssSelector("button#otpButton"));
        butEl.click();
        Alert alertObj = driver.switchTo().alert();
        alertObj.accept();
        emailEl.sendKeys("@gmail.com");
        butEl.click();
        System.out.println(alertObj.getText());
        alertObj.accept();
        WebElement otpEl = driver.findElement(By.cssSelector("input#otp"));
        otpEl.sendKeys("123456");
        WebElement butEl1 = driver.findElement(By.cssSelector("button#submitBtn"));
        butEl1.click();
        System.out.println(alertObj.getText());
        alertObj.accept();
        System.out.println(alertObj.getText());
        alertObj.accept();
        WebElement downEl = driver.findElement(By.id("downloadBtn"));
        downEl.click();
        System.out.println(alertObj.getText());
        alertObj.sendKeys("password123");
        alertObj.accept();
        System.out.println("Download Successful");
    }
}
