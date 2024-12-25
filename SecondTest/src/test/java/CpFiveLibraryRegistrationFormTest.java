import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CpFiveLibraryRegistrationFormTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://libraryregtest.ccbp.tech/");
        WebElement nameEl = driver.findElement(By.name("fullName"));
        nameEl.sendKeys("Tharun");
        WebElement maleEl = driver.findElement(By.id("male"));
        maleEl.click();
        WebElement numEl = driver.findElement(By.id("contactNumber"));
        numEl.sendKeys("1852212089");
        WebElement emailEl = driver.findElement(By.id("email"));
        emailEl.sendKeys("tharunchampions@gmail.com");
        WebElement selEl = driver.findElement(By.tagName("select"));
        Select dropEl = new Select(selEl);
        dropEl.selectByIndex(2);
        WebElement ficEl = driver.findElement(By.id("fiction"));
        ficEl.click();
        WebElement nonFicEl = driver.findElement(By.id("nonFiction"));
        nonFicEl.click();
        WebElement agreeEl = driver.findElement(By.id("agreement"));
        agreeEl.click();
        WebElement subEl = driver.findElement(By.className("submit-btn"));
        subEl.submit();

        driver.close();
    }
}
