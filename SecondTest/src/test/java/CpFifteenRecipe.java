import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.List;

public class CpFifteenRecipe {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qarecipepage.ccbp.tech/");
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(500));
        List<WebElement> listEl = driver.findElements(By.cssSelector("li"));
        System.out.println(listEl.size());
        for(WebElement i : listEl) {
            i.click();
            System.out.println(i.getText());
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#recipeList li")));
            List<WebElement> listEl1 = driver.findElements(By.cssSelector("div#recipeList li"));
            for(WebElement j : listEl1) {
                j.click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#recipe > h3")));
                WebElement hearEl = driver.findElement(By.cssSelector("div#recipe > h3"));
                System.out.println(hearEl.getText());
                List<WebElement> ingrEl = driver.findElements(By.cssSelector("div#recipe > ul li"));
                for(WebElement k : ingrEl) {
                    System.out.println(k.getText());
                }
            }
        }

        driver.quit();
    }
}
