import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class CpNineArrayIndexAppTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qanumberindex.ccbp.tech/");
        WebElement arrEl = driver.findElement(By.xpath("//p[contains(@class, 'default-array')]"));
        String curText = arrEl.getText();
        String expText = "[ 17, 31, 77, 20, 63 ]";
        if(curText.equals(expText)) {
            System.out.println("Good1");
        }
        else {
            System.out.println("Not Good1");
        }
        WebElement inpEl = driver.findElement(By.xpath("//input[contains(@class, 'user-input')]"));
        inpEl.sendKeys("48");
        WebElement butEl = driver.findElement(By.xpath("//button[contains(@class, 'btn')]"));
        butEl.click();
        WebElement resEl = driver.findElement(By.xpath("//span[contains(@class, 'index')]"));
        String num = resEl.getText();
        if(num.equals("-1")) {
            System.out.println("Good2");
        }
        else {
            System.out.println("Not Good2");
        }
        inpEl.clear();

        inpEl.sendKeys("17");
        butEl.click();
        resEl = driver.findElement(By.xpath("//span[contains(@class, 'index')]"));
        num = resEl.getText();
        if(num.equals("0")) {
            System.out.println("Good3");
        }
        else {
            System.out.println("Not Good3");
        }
        inpEl.clear();

        inpEl.sendKeys("77");
        butEl.click();
        resEl = driver.findElement(By.xpath("//span[contains(@class, 'index')]"));
        num = resEl.getText();
        if(num.equals("2")) {
            System.out.println("Good4");
        }
        else {
            System.out.println("Not Good4");
        }
        inpEl.clear();

        inpEl.sendKeys("63");
        butEl.click();
        resEl = driver.findElement(By.xpath("//span[contains(@class, 'index')]"));
        num = resEl.getText();
        if(num.equals("4")) {
            System.out.println("Good5");
        }
        else {
            System.out.println("Not Good5");
        }
        inpEl.clear();

        driver.close();
    }
}
