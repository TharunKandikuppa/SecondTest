import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Tharun {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.fitpeo.com/home");
        driver.manage().window().maximize();
        WebElement valueObj = driver.findElement(By.xpath("//div[text() = 'Revenue Calculator']"));
        valueObj.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(100, 300)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.MuiSlider-thumb")));
        WebElement valueObj1 = driver.findElement(By.cssSelector("input.MuiInputBase-input"));
//        valueObj1.clear();
//        valueObj1.sendKeys("560");
//        driver.close();
    }
}
