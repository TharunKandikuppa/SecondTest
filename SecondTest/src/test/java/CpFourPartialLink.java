import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class CpFourPartialLink {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qacompany.ccbp.tech/");
        WebElement homeEl = driver.findElement(By.linkText("Home"));
        homeEl.click();
        WebElement aboutEl = driver.findElement(By.partialLinkText("About"));
        aboutEl.click();
        WebElement contactEl = driver.findElement(By.partialLinkText("Contact"));
        contactEl.click();
        driver.quit();
    }
}






































