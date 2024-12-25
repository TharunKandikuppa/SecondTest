import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;

public class CdEightBlogPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qabloglist.ccbp.tech/");
        List<WebElement> listEl = driver.findElements(By.cssSelector("li.blog-item"));
        if(listEl.size() == 5) {
            System.out.println("Good");
        }
        else {
            System.out.println("Not Good");
        }
        List<WebElement> titleEl = driver.findElements(By.cssSelector("h1.blog-title"));
        if(titleEl.size() == 5) {
            System.out.println("Good");
        }
        else {
            System.out.println("Not Good");
        }
        List<WebElement> paraEl = driver.findElements(By.cssSelector("p.blog-description"));
        if(paraEl.size() == 5) {
            System.out.println("Good");
        }
        else {
            System.out.println("Not Good");
        }

        driver.quit();
    }
}
