import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class CdElevenArrayIndex {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qanumberindex.ccbp.tech/");
        WebElement paraEl = driver.findElement(By.cssSelector("p[class *= 'default-array']"));
        String curPara = paraEl.getText();
        String expPara = "[ 17, 31, 77, 20, 63 ]";
        if(curPara.equals(expPara)) {
            System.out.println("1Good");
        }
        else {
            System.out.println("1Not Good");
        }
        WebElement inputEl = driver.findElement(By.cssSelector("input[class *= 'user-input']"));
        inputEl.sendKeys("48");
        WebElement butEl = driver.findElement(By.cssSelector("button[class *= 'btn']"));
        butEl.click();
        WebElement spanEl = driver.findElement(By.cssSelector("span[class *= 'number']"));
        String curSpan = spanEl.getText();
        String expSpan = "-1";
        if(curSpan.equals(expSpan)) {
            System.out.println("2Good");
        }
        else {
            System.out.println("2Not Good");
        }
        inputEl.clear();
        inputEl.sendKeys("17");
        butEl.click();
        String curSpan1 = spanEl.getText();
        String expSpan1 = "0";
        if(curSpan1.equals(expSpan1)) {
            System.out.println("3Good");
        }
        else {
            System.out.println("3Not Good");
        }
        inputEl.clear();
        inputEl.sendKeys("63");
        butEl.click();
        String curSpan2 = spanEl.getText();
        String expSpan2 = "4";
        if(curSpan2.equals(expSpan2)) {
            System.out.println("4Good");
        }
        else {
            System.out.println("4Not Good");
        }

        driver.quit();
    }
}