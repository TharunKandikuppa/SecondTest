import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;

public class CpTenFeatures {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qafeaturesect.ccbp.tech/");
        WebElement spamEl = driver.findElement(By.cssSelector("span.interaction"));
        System.out.println(spamEl.getText());
        WebElement para1El = driver.findElement(By.xpath("//span[@class = 'interaction']/parent :: p"));
        System.out.println(para1El.getText());
        WebElement head1El = driver.findElement(By.xpath("//span[@class = 'interaction']/parent :: p/preceding-sibling :: h1"));
        System.out.println(head1El.getText());
        List<WebElement> para2El = driver.findElements(By.xpath("//span[@class = 'interaction']/ancestor :: div[2]/following-sibling :: div/descendant :: p"));
        for(int i = 0; i < para2El.size(); i++) {
            WebElement a = para2El.get(i);
            System.out.println(a.getText());
        }
        List<WebElement> para3El = driver.findElements(By.xpath("//span[@class = 'interaction']/ancestor :: div[2]/preceding-sibling :: div/descendant :: p"));
        for(int i = 0; i < para3El.size(); i++) {
            WebElement b = para3El.get(i);
            System.out.println(b.getText());
        }

        driver.quit();
    }
}