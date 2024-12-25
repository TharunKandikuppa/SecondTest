import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CpFiveDietPlan {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://libraryregtest.ccbp.tech/");
        WebElement nameEl = driver.findElement(By.name("fullName"));
        nameEl.sendKeys("Tharun");
        WebElement maleEl = driver.findElement(By.id("male"));
        maleEl.click();
        WebElement contactEl = driver.findElement(By.id("contactNumber"));
        contactEl.sendKeys("9848022338");
        WebElement emailEl = driver.findElement(By.id("email"));
        emailEl.sendKeys("123@gmail.com");
        WebElement selectEl = driver.findElement(By.id("membershipType"));
        Select select = new Select(selectEl);
        select.selectByVisibleText("Individual");
        WebElement fictionEl = driver.findElement(By.id("fiction"));
        fictionEl.click();
        WebElement scienceEl = driver.findElement(By.id("science"));
        scienceEl.click();
        WebElement agreementEl = driver.findElement(By.id("agreement"));
        agreementEl.click();
        WebElement submitEl = driver.findElement(By.className("submit-btn"));
        submitEl.submit();
    }
}
