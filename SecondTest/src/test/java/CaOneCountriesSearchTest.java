import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class CaOneCountriesSearchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qasearchpage.ccbp.tech/");
        WebElement nameEl = driver.findElement(By.id("searchInput"));
        nameEl.sendKeys("India");
        nameEl.clear();
        nameEl.sendKeys("United States");
        driver.close();
    }
}
