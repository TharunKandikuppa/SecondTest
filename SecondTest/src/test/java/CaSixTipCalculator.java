import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class CaSixTipCalculator {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qatipcalc.ccbp.tech/");
        WebElement billEl = driver.findElement(By.cssSelector("input[id ^= 'bill']"));
        billEl.sendKeys("1000");
        WebElement perceEl = driver.findElement(By.cssSelector("input[id ^= 'percentage']"));
        perceEl.sendKeys("12");
        WebElement calcEl = driver.findElement(By.cssSelector("button[id *= 'calculate']"));
        calcEl.click();
        WebElement tipEl = driver.findElement(By.cssSelector("p[id ^= 'tip']"));
        String curTip = tipEl.getText();
        String expTip = "120.00";
        if(curTip.equals(expTip)) {
            System.out.println("1Good");
        }
        else {
            System.out.println("1Not Good");
        }
        WebElement totalEl = driver.findElement(By.cssSelector("p[id ^= 'total']"));
        String curTotal = totalEl.getText();
        String expTotal = "1120.00";
        if(curTotal.equals(expTotal)) {
            System.out.println("2Good");
        }
        else {
            System.out.println("2Not Good");
        }
        perceEl.clear();
        calcEl.click();
        WebElement errorEl = driver.findElement(By.cssSelector("p#errorMessage"));
        String curError = errorEl.getText();
        String expError = "Please Enter a Valid Input.";
        if(curError.equals(expError)) {
            System.out.println("3Good");
        }
        else {
            System.out.println("3Not Good");
        }

        driver.quit();
    }
}