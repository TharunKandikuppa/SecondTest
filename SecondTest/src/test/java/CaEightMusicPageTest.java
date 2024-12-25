import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class CaEightMusicPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qamusicpage.ccbp.tech/");
        WebElement headEl1 = driver.findElement(By.cssSelector("div.music-header-bg-container :first-child"));
        System.out.println(headEl1.getText());
        WebElement paraEl1 = driver.findElement(By.cssSelector("div.music-header-bg-container p:first-of-type"));
        System.out.println(paraEl1.getText());
        WebElement paraEl2 = driver.findElement(By.cssSelector("div.music-header-bg-container p:last-of-type"));
        System.out.println(paraEl2.getText());
        WebElement headEl2 = driver.findElement(By.cssSelector("div.night-island-card :first-child"));
        System.out.println(headEl2.getText());
        WebElement paraEl3 = driver.findElement(By.cssSelector("div.night-island-card p:first-of-type"));
        System.out.println(paraEl3.getText());
        WebElement paraEl4 = driver.findElement(By.cssSelector("div.night-island-card p:last-of-type"));
        System.out.println(paraEl4.getText());
        WebElement headEl3 = driver.findElement(By.cssSelector("div.music-header-bg-container :first-child"));
        System.out.println(headEl3.getText());
        WebElement paraEl5 = driver.findElement(By.cssSelector("div.music-header-bg-container :first-child"));
        System.out.println(paraEl5.getText());
        WebElement paraEl6 = driver.findElement(By.cssSelector("div.music-header-bg-container :first-child"));
        System.out.println(paraEl6.getText());

    }
}
