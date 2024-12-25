import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class CaNineConferenceRegistrationPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaconfreg.ccbp.tech/");
        WebElement nameEl = driver.findElement(By.cssSelector("input#name"));
        nameEl.sendKeys("Alice");
        WebElement butEl = driver.findElement(By.cssSelector("input[type = 'submit']"));
        butEl.click();
        Alert alertObj = driver.switchTo().alert();
        System.out.println(alertObj.getText());
        alertObj.accept();
        WebElement emailEl = driver.findElement(By.cssSelector("input#email"));
        emailEl.sendKeys("Alice@gmail.com");
        butEl.click();
        System.out.println(alertObj.getText());
        alertObj.accept();

        driver.close();
    }
}
