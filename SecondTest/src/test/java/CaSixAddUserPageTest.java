import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class CaSixAddUserPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qausersignup.ccbp.tech/");
        WebElement nameEl = driver.findElement(By.cssSelector("input#name"));
        nameEl.sendKeys("rahul");
        WebElement emailEl = driver.findElement(By.cssSelector("input#email"));
        emailEl.sendKeys("rahul@example.com");
        WebElement butEl = driver.findElement(By.cssSelector("button#submit-button"));
        butEl.click();
        WebElement mesEl = driver.findElement(By.cssSelector("p#successMessage"));
        if((mesEl.getText()).equals("New user added successfully!")) {
            System.out.println("Good1");
        }
        else {
            System.out.println("Not Good1");
        }
        butEl.click();
        WebElement mesEl1 = driver.findElement(By.cssSelector("p#emailErrMsg"));
        if((mesEl1.getText()).equals("Required*")) {
            System.out.println("Good2");
        }
        else {
            System.out.println("Not Good2");
        }

        driver.close();
    }
}
