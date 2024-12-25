import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;

public class CaEightMyProjects {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qamyprojects.ccbp.tech/");
        WebElement imageEl1 = driver.findElement(By.cssSelector("div.my-projects-home-page :nth-child(4) :first-child"));
        imageEl1.click();
        WebElement headEl1 = driver.findElement(By.cssSelector("div.advanced-technologies-card :first-child"));
        System.out.println(headEl1.getText());
        WebElement paraEl1 = driver.findElement(By.cssSelector("div.advanced-technologies-card :nth-child(2)"));
        System.out.println(paraEl1.getText());
        WebElement butEl1 = driver.findElement(By.cssSelector("button.btn-primary"));
        butEl1.click();
        WebElement imageEl2 = driver.findElement(By.cssSelector("div.my-projects-home-page :nth-child(4) :last-child"));
        imageEl2.click();
        List<WebElement> headEl2 = driver.findElements(By.cssSelector("div.diwali-bottom-section h1"));
        for(int i = 0; i < headEl2.size(); i++) {
            WebElement a = headEl2.get(i);
            String a1 = a.getText();
            System.out.println(a1);
        }
        List<WebElement> paraEl2 = driver.findElements(By.cssSelector("div.diwali-bottom-section p"));
        for(int j = 0; j < paraEl2.size(); j++) {
            WebElement b = headEl2.get(j);
            String b1 = b.getText();
            System.out.println(b1);
        }
        WebElement butEl2 = driver.findElement(By.cssSelector("div.diwali-bottom-section button"));
        butEl2.click();
        WebElement imageEl3 = driver.findElement(By.cssSelector("div.my-projects-home-page :nth-child(5) :first-child"));
        imageEl3.click();
        WebElement headEl3 = driver.findElement(By.cssSelector("div.order-card :first-child"));
        System.out.println(headEl3.getText());
        WebElement paraEl3 = driver.findElement(By.cssSelector("div.order-card :nth-child(2)"));
        System.out.println(paraEl3.getText());
        WebElement butEl3 = driver.findElement(By.cssSelector("div.order-card :nth-child(4)"));
        butEl3.click();
        WebElement imageEl4 = driver.findElement(By.cssSelector("div.my-projects-home-page :nth-child(5) :last-child"));
        imageEl4.click();
        WebElement paraEl4 = driver.findElement(By.cssSelector("div.news-card :first-child"));
        System.out.println(paraEl4.getText());
        WebElement headEl4 = driver.findElement(By.cssSelector("div.news-card :nth-child(2)"));
        System.out.println(headEl4.getText());
        WebElement paraEl5 = driver.findElement(By.cssSelector("div.news-card :nth-child(3)"));
        System.out.println(paraEl5.getText());
        WebElement butEl4 = driver.findElement(By.cssSelector("div.news-card :nth-child(5)"));
        butEl4.click();

        driver.quit();
    }
}
