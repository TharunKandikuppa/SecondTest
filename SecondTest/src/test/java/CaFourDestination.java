import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;

public class CaFourDestination {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qadest.ccbp.tech");
        List<WebElement> listEl = driver.findElements(By.cssSelector("li.destination-item"));
        if(listEl.size() == 12) {
            System.out.println("Good");
        }
        else {
            System.out.println("Not Good");
        }
        WebElement inputEl = driver.findElement(By.cssSelector("input.search-input"));
        inputEl.sendKeys("io");
        List<WebElement> list1El = driver.findElements(By.cssSelector("li.destination-item"));
        if(list1El.size() == 4) {
            System.out.println("Good");
        }
        else {
            System.out.println("Not Good");
        }
        boolean isContaains = true;
        for(int i = 0; i < list1El.size(); i++) {
            String text1 = "io";
            WebElement value1 = list1El.get(i);
            if(!(value1.getText()).contains(text1)) {
                isContaains = false;
                break;
            }
        }
        if(isContaains) {
            System.out.println("Search Result for 'io' :");
            for(int j = 0; j < list1El.size(); j++) {
                System.out.println(list1El.get(j).getText());
            }
        }
        inputEl.clear();
        inputEl.sendKeys("ion");
        List<WebElement> list2El = driver.findElements(By.cssSelector("li.destination-item"));
        if(list2El.size() == 3) {
            System.out.println("Good");
        }
        else {
            System.out.println("Not Good");
        }
        boolean isContains1 = true;
        for(int k = 0; k < list2El.size(); k++) {
            String text2 = "ion";
            WebElement value2 = list2El.get(k);
            if(!(value2.getText().contains(text2))) {
                isContains1 = false;
                break;
            }
        }
        if(isContains1) {
            System.out.println("Search Result for 'ion' :");
            for(int l = 0; l < list2El.size(); l++) {
                System.out.println(list2El.get(l).getText());
            }
        }

        driver.quit();
    }
}
