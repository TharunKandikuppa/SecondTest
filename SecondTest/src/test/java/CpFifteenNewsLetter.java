import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.time.Duration;

public class CpFifteenNewsLetter {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qanewsltrpls.ccbp.tech/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement nameEl = driver.findElement(By.cssSelector("input#name"));
        nameEl.sendKeys("John Doe");
        WebElement butEl = driver.findElement(By.cssSelector("button#continueName"));
        butEl.click();
        WebElement numEl = driver.findElement(By.cssSelector("input#phonenum"));
        numEl.sendKeys("9876543210");
        WebElement butEl1 = driver.findElement(By.cssSelector("button#continuePhonenum"));
        butEl1.click();
        WebElement emailEl = driver.findElement(By.cssSelector("input#email"));
        emailEl.sendKeys("johndoe@gmail.com");
        WebElement butEl2 = driver.findElement(By.cssSelector("button#continueEmail"));
        butEl2.click();
        WebElement butEl3 = driver.findElement(By.cssSelector("button#submit"));
        butEl3.click();
        WebElement succEl = driver.findElement(By.cssSelector("p#successMessage"));
        System.out.println(succEl.getText());

        driver.quit();
    }
}
