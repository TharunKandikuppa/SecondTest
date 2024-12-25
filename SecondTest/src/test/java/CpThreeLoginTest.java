import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class CpThreeLoginTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaloginpage.ccbp.tech/");
        WebElement nameEL = driver.findElement(By.id("username"));
        nameEL.sendKeys("rahul");
        WebElement passEL = driver.findElement(By.id("password"));
        passEL.sendKeys("rahul@2023");
        WebElement butEL = driver.findElement(By.className("login-button"));
        butEL.click();
        String expUrl1 = "https://qaloginpage.ccbp.tech/home";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expUrl1));
        String curUrl1 = driver.getCurrentUrl();
        if(expUrl1.equals(curUrl1)) {
            System.out.println("Good1");
        }
        else{
            System.out.println("Not Good1");
        }


        driver.close();
    }
}
