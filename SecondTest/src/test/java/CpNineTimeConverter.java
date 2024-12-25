import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class CpNineTimeConverter {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qatimeconverter.ccbp.tech/");
        WebElement hourEl = driver.findElement(By.xpath("//input[@class = 'time-input'][position() = 1]"));
        hourEl.sendKeys("2");
        WebElement minEl = driver.findElement(By.xpath("//input[@class = 'time-input'][position() = 2]"));
        minEl.sendKeys("30");
        WebElement convertEl = driver.findElement(By.xpath("//button[contains(@id, 'convert')]"));
        convertEl.click();
        WebElement solEl = driver.findElement(By.cssSelector("p#timeInSeconds"));
        String curSolEl = solEl.getText();
        if(curSolEl.equals("9000s")) {
            System.out.println("Good");
        }
        else {
            System.out.println("Not Good");
        }
        hourEl.clear();
        minEl.clear();
        convertEl.click();
        WebElement errorEl = driver.findElement(By.cssSelector("p#errorMsg"));
        String curErrEl = errorEl.getText();
        if(curErrEl.equals("Please enter a valid number of hours.")) {
            System.out.println("Good");
        }
        else {
            System.out.println("Not Good");
        }
        hourEl.sendKeys("1");
        convertEl.click();
        WebElement errorEl1 = driver.findElement(By.cssSelector("p#errorMsg"));
        String curErrEl1 = errorEl1.getText();
        if(curErrEl1.equals("Please enter a valid number of minutes.")) {
            System.out.println("Good");
        }
        else {
            System.out.println("Not Good");
        }
        minEl.sendKeys("15");
        convertEl.click();
        WebElement solEl1 = driver.findElement(By.cssSelector("p#timeInSeconds"));
        String curSolEl1 = solEl1.getText();
        if(curSolEl1.equals("4500s")) {
            System.out.println("Good");
        }
        else {
            System.out.println("Not Good");
        }

        driver.quit();
    }
}