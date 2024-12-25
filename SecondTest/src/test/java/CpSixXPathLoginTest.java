import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class CpSixXPathLoginTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaebank.ccbp.tech/ebank/login");
        WebElement nameEl = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form/div[1]/input"));
        nameEl.sendKeys("142420");
        WebElement passEl = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form/div[2]/input"));
        passEl.sendKeys("231225");
        WebElement subBut = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form/button"));
        subBut.submit();
        String expUrl1 = "https://qaebank.ccbp.tech/";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expUrl1));
        String curUrl1 = driver.getCurrentUrl();
        if(expUrl1.equals(curUrl1)) {
            System.out.println("Good1");
        }
        else {
            System.out.println("Not Good1");
        }
        WebElement logOutBut = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/button"));
        logOutBut.click();
        String expUrl2 = "https://qaebank.ccbp.tech/ebank/login";
        wait.until(ExpectedConditions.urlToBe(expUrl2));
        String curUrl2 = driver.getCurrentUrl();
        if(expUrl2.equals(curUrl2)) {
            System.out.println("Good2");
        }
        else {
            System.out.println("Not Good2");
        }

        driver.close();
    }
}
