import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CaTwoMeetUp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qameetup.ccbp.tech/");
        WebElement regEl = driver.findElement(By.cssSelector("button#registerButton"));
        regEl.click();
        String expUrl1 = "https://qameetup.ccbp.tech/register";
        String curUrl1 = driver.getCurrentUrl();
        if(expUrl1.equals(curUrl1)) {
            System.out.println("Good");
        }
        else {
            System.out.println("Not Good");
        }
        WebElement nameEl = driver.findElement(By.cssSelector("input#name"));
        nameEl.sendKeys("Tharun");
        WebElement selectEl = driver.findElement(By.cssSelector("select#topic"));
        Select select = new Select(selectEl);
        select.selectByVisibleText("Games");
        WebElement subEl = driver.findElement(By.cssSelector("button.RegisterButton-sc-sr3jcr-12"));
        subEl.click();
        String expUrl2 = "https://qameetup.ccbp.tech/";
        String curUrl2 = driver.getCurrentUrl();
        if(expUrl2.equals(curUrl2)) {
            System.out.println("Good");
        }
        else {
            System.out.println("Not Good");
        }
        driver.get("https://qameetup.ccbp.tech/random-text");
        String expUrl3 = "https://qameetup.ccbp.tech/not-found";
        String curUrl3 = driver.getCurrentUrl();
        if(expUrl3.equals(curUrl3)) {
            System.out.println("Good");
        }
        else {
            System.out.println("Not Good");
        }

        driver.quit();
    }
}
