import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;

public class CaEightCashWithdrawal {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qawithdrawal.ccbp.tech/");
        WebElement nameEl = driver.findElement(By.cssSelector("div[class *= 'details'] > p"));
        String curName = nameEl.getText();
        String expName = "Sarah Williams";
        if(expName.equals(curName)) {
            System.out.println("1Good");
        }
        else {
            System.out.println("Not Good");
        }
        WebElement amountEl = driver.findElement(By.cssSelector("div[class *= 'details'] + div > div > p"));
        String curAmount = amountEl.getText();
        String expAmount = "2000";
        if(expAmount.equals(curAmount)) {
            System.out.println("2Good");
        }
        else {
            System.out.println("Not Good");
        }
        List<WebElement> butEl = driver.findElements(By.cssSelector("ul[class ^= denominations] li"));
        for(int i = 0; i < butEl.size(); i++) {
            WebElement a = butEl.get(i);

            WebElement amountEl1 = driver.findElement(By.cssSelector("div[class *= 'details'] + div > div > p"));
            String curAmount1 = amountEl1.getText();
            String b = a.getText();
            int c = (Integer.parseInt(curAmount1) - Integer.parseInt(b));
            String d = String.valueOf(c);
            a.click();
            if(d.equals(amountEl1.getText())) {
                System.out.println("T");
            }
            else {
                System.out.println("J");
            }
        }

        driver.quit();
    }
}
