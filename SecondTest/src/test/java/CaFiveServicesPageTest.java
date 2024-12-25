import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;

public class CaFiveServicesPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaservicesect.ccbp.tech/");
        List<WebElement> headEl = driver.findElements(By.xpath("//h1[text() = 'Online Support 24/7']/ancestor::div[2]/preceding::h1[@class = 'services-card-title']"));
        String[] expHead = {"Fast and Free Delivery", "100% Money back guarantee"};
        int j = 0;
        for(WebElement i : headEl) {
            if((i.getText()).equals(expHead[j]));
            j += 1;
        }
        if(j == 2) {
            System.out.println("Good1");
        }
        else {
            System.out.println("Not Good1");
        }
        List<WebElement> paraEl = driver.findElements(By.xpath("//h1[text() = 'Online Support 24/7']/ancestor::div[2]/preceding::p[@class = 'services-card-description']"));
        String[] expPara = {"Fast, free, and convenient delivery choices on millions of items.", "This is probably the most popular guarantee in the world."};
        int k = 0;
        for(WebElement m : paraEl) {
            if((m.getText()).equals(expPara[k]));
            k += 1;
        }
        if(k == 2) {
            System.out.println("Good2");
        }
        else {
            System.out.println("Not Good2");
        }
        WebElement mainHeadEl = driver.findElement(By.xpath("//h1[text() = 'Online Support 24/7']/ancestor::div[2]/preceding::div[5]/child::h1"));
        if((mainHeadEl.getText()).equals("Our Services")) {
            System.out.println("Good3");
        }
        else {
            System.out.println("Not Good3");
        }
        WebElement mainParaEl = driver.findElement(By.xpath("//h1[text() = 'Online Support 24/7']/ancestor::div[2]/preceding::div[5]/child::p"));
        if((mainParaEl.getText()).equals("Most online stores offer lower prices. Online shopping makes price comparison simpler and quicker. It is very convenient to shop from where you are located. It saves you the cost of driving to stores, as well as parking fees.")) {
            System.out.println("Good4");
        }
        else {
            System.out.println("Not Good4");
        }

        driver.close();
    }
}
