import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class CpForteenStedentEnrollment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qastdenroll.ccbp.tech/");
        WebElement nameEl = driver.findElement(By.cssSelector("input#name"));
        nameEl.sendKeys("John");
        WebElement butEl = driver.findElement(By.cssSelector("button.submit-button"));
        butEl.click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        WebElement mailEl = driver.findElement(By.cssSelector("input#email"));
        mailEl.sendKeys("john@gmail.com");
        butEl.click();
        System.out.println(alert.getText());
        alert.accept();

        driver.quit();
    }
}
