import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;
import java.util.ArrayList;

public class CaFiveServices {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaservicesect.ccbp.tech/");
        List<WebElement> headEl = driver.findElements(By.xpath("//h1[text() = 'Online Support 24/7']/ancestor :: div[2]/preceding-sibling :: div/descendant :: img/following-sibling :: h1"));
        ArrayList<String> curHead = new ArrayList<String>();
        for(WebElement i : headEl) {
            String a = i.getText();
            curHead.add(a);
        }
        String[] expHead = {"Fast and Free Delivery", "100% Money back guarantee"};
        int j;
        for(j = 0; j < headEl.size(); j++) {
            if(!(expHead[j].equals(curHead.get(j)))) {
                break;
            }
        }
        if(j == 2) {
            System.out.println("1Good");
        }
        else {
            System.out.println("1Not Good");
        }
        List<WebElement> paraEl = driver.findElements(By.xpath("//h1[text() = 'Online Support 24/7']/ancestor :: div[2]/preceding-sibling :: div/descendant :: img/following-sibling :: p"));
        ArrayList<String> curPara = new ArrayList<String>();
        for(WebElement k : paraEl) {
            String a = k.getText();
            curPara.add(a);
        }
        String[] expPara = {"Fast, free, and convenient delivery choices on millions of items.", "This is probably the most popular guarantee in the world."};
        int l;
        for(l = 0; l < headEl.size(); l++) {
            if(!(expPara[l].equals(curPara.get(l)))) {
                break;
            }
        }
        if(l == 2) {
            System.out.println("2Good");
        }
        else {
            System.out.println("2Not Good");
        }
        WebElement head1El = driver.findElement(By.xpath("//h1[text() = 'Online Support 24/7']/ancestor :: div[2]/preceding :: div[5]/child :: h1"));
        String curHead1 = head1El.getText();
        String expHead1 = "Our Services";
        if(curHead1.equals(expHead1)) {
            System.out.println("3Good");
        }
        else {
            System.out.println("3Not Good");
        }
        WebElement para1El = driver.findElement(By.xpath("//h1[text() = 'Online Support 24/7']/ancestor :: div[2]/preceding :: div[5]/child :: p"));
        String curPara1 = para1El.getText();
        String expPara1 = "Most online stores offer lower prices. Online shopping makes price comparison simpler and quicker. It is very convenient to shop from where you are located. It saves you the cost of driving to stores, as well as parking fees.";
        if(curPara1.equals(expPara1)) {
            System.out.println("4Good");
        }
        else {
            System.out.println("4Not Good");
        }

        driver.quit();
    }
}
