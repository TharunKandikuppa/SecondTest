import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class CaNineTreasureHunt {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qatreasurehunt.ccbp.tech/");
        WebElement keyEl = driver.findElement(By.cssSelector("a#secretKey"));
        keyEl.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Expecto Patronum");
        alert.accept();
        String a = alert.getText();
        System.out.println(a);
        alert.accept();
        alert.sendKeys("Expelliarmus");
        alert.accept();
    }
}