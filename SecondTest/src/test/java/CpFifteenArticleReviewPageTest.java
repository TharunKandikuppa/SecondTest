import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class CpFifteenArticleReviewPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaarticlervw.ccbp.tech/article/");
        WebElement titleEl = driver.findElement(By.cssSelector("h1.article-details-title"));
        System.out.println(titleEl.getText());
        WebElement butEl = driver.findElement(By.cssSelector("a.nav-link"));
        butEl.click();
        String expUrl = "https://qaarticlervw.ccbp.tech/review";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe(expUrl));
        String curUrl = driver.getCurrentUrl();
        if(expUrl.equals(curUrl)) {
            System.out.println("Good1");
        }
        else {
            System.out.println("Not Good1");
        }
        WebElement textEl = driver.findElement(By.cssSelector("textarea#reviewTextArea"));
        textEl.sendKeys("Clear and thoughtful explanation of React's versioning approach.");
        WebElement butEl1 = driver.findElement(By.cssSelector("button#submitReviewBtn"));
        wait.until(ExpectedConditions.elementToBeClickable(butEl1));
        butEl1.click();
        String expUrl1 = "https://qaarticlervw.ccbp.tech/article";
        wait.until(ExpectedConditions.urlToBe(expUrl1));
        String curUrl1 = driver.getCurrentUrl();
        if(expUrl1.equals(curUrl1)) {
            System.out.println("Good2");
        }
        else {
            System.out.println("Not Good2");
        }

        driver.close();
    }
}
