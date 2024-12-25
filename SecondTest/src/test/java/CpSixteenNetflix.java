import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class CpSixteenNetflix {
    @Test
    public void netflixPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/in/");
        String curUrl = driver.getCurrentUrl();
        String expUrl = "https://www.netflix.com/in/";
        Assert.assertEquals(expUrl, curUrl, "Not Good");
        String curTitle = driver.getTitle();
        String expTitle = "Netflix India – Watch TV Shows Online, Watch Movies Online";
        Assert.assertEquals(expTitle, curTitle, "Not Good");

        driver.quit();
    }
}
