import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;

public class CaSevenCashWithdrawalPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qawithdrawal.ccbp.tech/");
        WebElement nameEl = driver.findElement(By.cssSelector("div[class *= container] p.name"));
        if((nameEl.getText()).equals("Sarah Williams")) {
            System.out.println("Good1");
        }
        else {
            System.out.println("Not Good1");
        }
        WebElement balEl = driver.findElement(By.cssSelector("div[class *= container] p.balance"));
        if((balEl.getText()).equals("2000")) {
            System.out.println("Good2");
        }
        else {
            System.out.println("Not Good2");
        }
        List<WebElement> amoEl = driver.findElements(By.cssSelector("ul[class ^= denominations] li"));
        int a = 2000;
        for(WebElement i : amoEl) {
            i.click();
            if((a - Integer.parseInt(i.getText())) == (Integer.parseInt(balEl.getText()))) {
                System.out.println(i.getText());
            }
            a -= Integer.parseInt(i.getText());
            i.click();
            if((a - Integer.parseInt(i.getText())) == (Integer.parseInt(balEl.getText()))) {
                System.out.println(i.getText());
            }
            a -= Integer.parseInt(i.getText());
        }

        driver.close();
    }
}
