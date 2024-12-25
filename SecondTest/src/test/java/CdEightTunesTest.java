import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;

public class CdEightTunesTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qatunes.ccbp.tech/");
        WebElement selectEl = driver.findElement(By.cssSelector("select#genre"));
        Select selectObj = new Select(selectEl);
        selectObj.selectByVisibleText("Pop");
        WebElement butEl = driver.findElement(By.cssSelector("button#getButton"));
        butEl.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.song-title")));
        List<WebElement> songEl = driver.findElements(By.cssSelector("li.song-title"));
        System.out.println(songEl.size());
        selectObj.selectByVisibleText("Rock");
        butEl.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.song-title")));
        List<WebElement> song1El = driver.findElements(By.cssSelector("li.song-title"));
        System.out.println(song1El.size());

        driver.quit();
    }
}
