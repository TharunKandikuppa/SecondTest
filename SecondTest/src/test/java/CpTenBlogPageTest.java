import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;

public class CpTenBlogPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qabloglist.ccbp.tech/");
        List<WebElement> headEl = driver.findElements(By.xpath("//h1[text() = 'My fifth post']/preceding::h1[@class = 'blog-title']"));
        for(WebElement i : headEl) {
            System.out.println(i.getText());
        }
        List<WebElement> linkEl = driver.findElements(By.xpath("//a[text() = 'Home']/following::a"));
        linkEl.get(0).click();
        String expUrl1 = "https://qabloglist.ccbp.tech/about";
        String curUrl1 = driver.getCurrentUrl();
        if(expUrl1.equals(curUrl1)) {
            System.out.println("Good1");
        }
        else {
            System.out.println("Not Good1");
        }
        linkEl.get(1).click();
        String expUrl2 = "https://qabloglist.ccbp.tech/contact";
        String curUrl2 = driver.getCurrentUrl();
        if(expUrl2.equals(curUrl2)) {
            System.out.println("Good2");
        }
        else {
            System.out.println("Not Good2");
        }

        driver.close();
    }
}
