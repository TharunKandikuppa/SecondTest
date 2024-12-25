import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CaTwoAddUserTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaadduser.ccbp.tech/");
        WebElement nameEl = driver.findElement(By.name("name"));
        nameEl.sendKeys("Tharun");
        WebElement emailEl = driver.findElement(By.name("email"));
        emailEl.sendKeys("tharunchampions@gmail.com");
        WebElement dropEl = driver.findElement(By.id("status"));
        Select selEl = new Select(dropEl);
        selEl.selectByValue("Active");
        WebElement genEl = driver.findElement(By.id("genderFemale"));
        genEl.click();
        WebElement butEl = driver.findElement(By.tagName("button"));
        butEl.submit();
    }
}
