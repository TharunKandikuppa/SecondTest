import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CaOneNxtWatch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qanxtwatch.ccbp.tech/login");
        WebElement nameEL = driver.findElement(By.cssSelector("input#userNameInput"));
        nameEL.sendKeys("rahul");
        WebElement passEL = driver.findElement(By.cssSelector("input#passwordInput"));
        passEL.sendKeys("rahul@2021");
        WebElement loginEL = driver.findElement(By.cssSelector("button#loginButton"));
        loginEL.submit();
        String expUrl = "https://qanxtwatch.ccbp.tech/";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expUrl));
        String curUrl = driver.getCurrentUrl();
        if(expUrl.equals(curUrl)) {
            System.out.println("Good");
        }
        else {
            System.out.println("Not Good");
        }
        WebElement logoutEl = driver.findElement(By.cssSelector("button#desktopLogoutButton"));
        logoutEl.click();
        WebElement logoutConEl = driver.findElement(By.cssSelector("button#desktopConfirmButton"));
        logoutConEl.click();
        String exp1Url = "https://qanxtwatch.ccbp.tech/login";
        wait.until(ExpectedConditions.urlToBe(exp1Url));
        String cur1Url = driver.getCurrentUrl();
        if(exp1Url.equals(cur1Url)) {
            System.out.println("Good");
        }
        else {
            System.out.println("Not Good");
        }

        driver.quit();
    }
}
