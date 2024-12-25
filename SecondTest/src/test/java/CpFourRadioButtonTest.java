import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class CpFourRadioButtonTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://qatraveldest.ccbp.tech/");
        WebElement firstEl = driver.findElement(By.tagName("input"));
        firstEl.click();
        WebElement secondEl = driver.findElement(By.id("adventure"));
        secondEl.click();
        WebElement thirdEl = driver.findElement(By.id("city"));
        thirdEl.click();
        WebElement forthEl = driver.findElement(By.id("cultural"));
        forthEl.click();

        driver.close();
    }
}
