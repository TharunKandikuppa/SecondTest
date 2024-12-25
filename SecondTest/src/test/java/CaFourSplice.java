import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaFourSplice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaspliceplygr.ccbp.tech/");
        WebElement startEl = driver.findElement(By.cssSelector("input#startIndexInput"));
        startEl.sendKeys("2");
        WebElement deleteEl = driver.findElement(By.cssSelector("input#deleteCountInput"));
        deleteEl.sendKeys("0");
        WebElement itemEl = driver.findElement(By.cssSelector("input#itemToAddInput"));
        itemEl.sendKeys("pen");
        WebElement butEL = driver.findElement(By.cssSelector("button#spliceBtn"));
        butEL.click();
        WebElement arrEl = driver.findElement(By.cssSelector("span#updatedArray"));
        String curArr = arrEl.getText();
        String expArr = "[1,7,\"pen\",3,1,0,20,77]";
        if(curArr.equals(expArr)) {
            System.out.println("Good");
        }
        else {
            System.out.println("Not Good");
        }

        driver.quit();
    }
}
