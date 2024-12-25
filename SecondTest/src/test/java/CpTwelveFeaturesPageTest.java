import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;

public class CpTwelveFeaturesPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qafeaturesect.ccbp.tech/");
        List<WebElement> headEl = driver.findElements(By.cssSelector("div.feature-card > h1"));
        String[] expHead = {"Easy to connect", "VR Capability", "Video games", "Interaction", "Easy to play", "Awesome Experience"};
        int i = 0;
        for(WebElement j : headEl) {
            if((j.getText()).equals(expHead[i])) {
                i += 1;
            }
        }
        if(i == 6) {
            System.out.println("Good1");
        }
        else {
            System.out.println("Not Good1");
        }
        List<WebElement> paraEl = driver.findElements(By.cssSelector("div.feature-card > p"));
        String[] expPara = {"Instead of viewing a screen in front of them, users are immersed and able to interact with 3D worlds.", "Virtual reality (VR) can create an environment similar to or completely different from the real world.", "Ability to recognize hand motion, evolving interactions and gameplay in VR.", "Interaction refers to the natural interaction between the user and the virtual scene.", "In 360-degree video, the locations of viewers are fixed, viewers are limited to the angles captured by the cameras.", "Virtual reality (VR) is a simulated experience that can be similar to or completely different from the real world."};
        int k = 0;
        for(WebElement l : paraEl) {
            if((l.getText()).equals(expPara[k])) {
                k += 1;
            }
        }
        if(k == 6) {
            System.out.println("Good2");
        }
        else {
            System.out.println("Not Good2");
        }
        WebElement spanEl = driver.findElement(By.cssSelector("img[src *= 'interaction'] ~ p > span"));
        if((spanEl.getText()).equals("natural interaction")) {
            System.out.println("Good3");
        }
        else {
            System.out.println("Not Good3");
        }

        driver.close();
    }
}
