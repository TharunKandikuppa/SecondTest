import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;

public class CpEightKeyCodeTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qakeycode.ccbp.tech/");
        WebElement nameEl = driver.findElement(By.xpath("//input[@id = 'userInput']"));
        nameEl.sendKeys("hello");
        List<WebElement> codeEl = driver.findElements(By.xpath("//li[@class = 'mt-1 keycode-item']"));
        if(codeEl.size() == 5) {
            System.out.println("Good1");
        }
        else {
            System.out.println("Not Good1");
        }
        nameEl.sendKeys("world");
        codeEl = driver.findElements(By.xpath("//li[@class = 'mt-1 keycode-item']"));
        if(codeEl.size() == 10) {
            System.out.println("Good2");
        }
        else {
            System.out.println("Not Good2");
        }

        driver.close();
    }
}
