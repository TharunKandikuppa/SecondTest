import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class CpElevenTimeConverterTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qatimeconverter.ccbp.tech/");
        WebElement hourEl = driver.findElement(By.cssSelector("input[id $= 'Hours']"));
        hourEl.sendKeys("2");
        WebElement minEl = driver.findElement(By.cssSelector("input[id $= 'Minutes']"));
        minEl.sendKeys("30");
        WebElement butEl = driver.findElement(By.cssSelector("button[id = 'convertBtn']"));
        butEl.click();
        WebElement conEl = driver.findElement(By.cssSelector("p[class ^= 'converted']"));
        if((conEl.getText()).equals("9000s")) {
            System.out.println("Good1");
        }
        else {
            System.out.println("Not Good1");
        }
        hourEl.clear();
        minEl.clear();
        butEl.click();
        WebElement errEl1 = driver.findElement(By.cssSelector("p[class ^= 'error']"));
        if((errEl1.getText()).equals("Please enter a valid number of hours.")) {
            System.out.println("Good2");
        }
        else {
            System.out.println("Not Good2");
        }
        hourEl.sendKeys("1");
        butEl.click();
        WebElement errEl2 = driver.findElement(By.cssSelector("p[class ^= 'error']"));
        if((errEl2.getText()).equals("Please enter a valid number of minutes.")) {
            System.out.println("Good3");
        }
        else {
            System.out.println("Not Good3");
        }
        minEl.sendKeys("15");
        butEl.click();
        WebElement conEl2 = driver.findElement(By.cssSelector("p[class ^= 'converted']"));
        if((conEl2.getText()).equals("4500s")) {
            System.out.println("Good4");
        }
        else {
            System.out.println("Not Good4");
        }

        driver.close();
    }
}
