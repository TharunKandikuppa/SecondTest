import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;

public class CaFourAppStoreApplicationTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaappstore.ccbp.tech");
        WebElement catEl1 = driver.findElement(By.xpath("//button[text() = 'Social']"));
        catEl1.click();
        List<WebElement> itemEl1 = driver.findElements(By.xpath("//li[@class= 'app-item']"));
        if(itemEl1.size() == 10) {
            System.out.println("Good1");
        }
        else {
            System.out.println("Not Good1");
        }
        WebElement catEl2 = driver.findElement(By.xpath("//button[text() = 'Games']"));
        catEl2.click();
        itemEl1 = driver.findElements(By.xpath("//li[@class= 'app-item']"));
        if(itemEl1.size() == 10) {
            System.out.println("Good2");
        }
        else {
            System.out.println("Not Good2");
        }
        WebElement catEl3 = driver.findElement(By.xpath("//button[text() = 'News']"));
        catEl3.click();
        itemEl1 = driver.findElements(By.xpath("//li[@class= 'app-item']"));
        if(itemEl1.size() == 10) {
            System.out.println("Good3");
        }
        else {
            System.out.println("Not Good3");
        }
        WebElement catEl4 = driver.findElement(By.xpath("//button[text() = 'Food']"));
        catEl4.click();
        itemEl1 = driver.findElements(By.xpath("//li[@class= 'app-item']"));
        if(itemEl1.size() == 10) {
            System.out.println("Good4");
        }
        else {
            System.out.println("Not Good4");
        }
        catEl3.click();
        WebElement serEl = driver.findElement(By.xpath("//input[@class = 'search-input']"));
        serEl.sendKeys("News");
        itemEl1 = driver.findElements(By.xpath("//li[@class= 'app-item']"));
        if(itemEl1.size() == 7) {
            System.out.println("Good5");
        }
        else {
            System.out.println("Not Good5");
        }

        driver.close();
    }
}
