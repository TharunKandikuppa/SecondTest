import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class CaTenProductReviewPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaproductrvw.ccbp.tech/product/");
        WebElement titleEl = driver.findElement(By.cssSelector("h1.product-name"));
        System.out.println(titleEl.getText());
        WebElement but1El = driver.findElement(By.cssSelector("a.nav-link"));
        but1El.click();
        String expUrl1 = "https://qaproductrvw.ccbp.tech/review";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expUrl1));
        String curUrl1 = driver.getCurrentUrl();
        if(expUrl1.equals(curUrl1)) {
            System.out.println("Good1");
        }
        else {
            System.out.println("Not Good1");
        }
        WebElement selEl = driver.findElement(By.cssSelector("select#ratingSelect"));
        Select dropEl = new Select(selEl);
        dropEl.selectByValue("5");
        WebElement textEl = driver.findElement(By.cssSelector("textarea#reviewTextArea"));
        textEl.sendKeys("Great quality, reasonable price, and high rating. Highly recommended!");
        WebElement butEl = driver.findElement(By.cssSelector("button#submitReviewBtn"));
        wait.until(ExpectedConditions.elementToBeClickable(butEl));
        butEl.click();
        String expUrl2 = "https://qaproductrvw.ccbp.tech/product";
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
