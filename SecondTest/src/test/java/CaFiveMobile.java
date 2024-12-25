import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;
import java.util.ArrayList;

public class CaFiveMobile {
    public static void main(String[] arsg) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qamobilespecs.ccbp.tech/");
        List<WebElement> para1El = driver.findElements(By.xpath("//li[text() = '3 GB RAM']/following-sibling::*"));
        ArrayList<String> curPara = new ArrayList<String>();
        for(WebElement i : para1El) {
            String a = i.getText();
            curPara.add(a);
        }
        String[] expPara = {"5.80 Super Retina HD OLED Display", "Front Camera 7MP", "Rear Camera 12MP + 12MP", "Apple A11 Bionic Processor", "Battery Capacity 2716mAH"};
        int j;
        for(j = 0; j < 5; j++) {
            if(!(expPara[j].equals(curPara.get(j)))) {
                break;
            }
        }
        if(j == 5) {
            System.out.println("Good");
        }
        else {
            System.out.println("Not Good");
        }

        driver.quit();
    }
}
