import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class CpThirteenOurCompanyPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qacompany.ccbp.tech/");
        WebElement headEl1 = driver.findElement(By.cssSelector("h3:first-of-type"));
        System.out.println(headEl1.getText());
        WebElement headEl2 = driver.findElement(By.cssSelector("div.services-container :nth-child(4)"));
        System.out.println(headEl2.getText());
        WebElement headEl3 = driver.findElement(By.cssSelector("h3:last-of-type"));
        System.out.println(headEl3.getText());
        WebElement paraEl1 = driver.findElement(By.cssSelector("div.services-container p:first-of-type"));
        System.out.println(paraEl1.getText());
        WebElement paraEl2 = driver.findElement(By.cssSelector("div.services-container :nth-child(5)"));
        System.out.println(paraEl2.getText());
        WebElement paraEl3 = driver.findElement(By.cssSelector("div.services-container p:last-of-type"));
        System.out.println(paraEl3.getText());

        driver.close();
    }
}
