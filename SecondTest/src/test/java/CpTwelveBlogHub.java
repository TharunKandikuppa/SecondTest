import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;
import java.util.ArrayList;

public class CpTwelveBlogHub {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kandi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qabloghub.ccbp.tech/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul.blogs-list > li.blog-item")));
        List<WebElement> itemsList = driver.findElements(By.cssSelector("ul.blogs-list > li.blog-item"));
        if(itemsList.size() == 10) {
            System.out.println("1Good");
        }
        else {
            System.out.println("1Not Good");
        }
        List<WebElement> headEl = driver.findElements(By.cssSelector("img.blog-item-image + div > h1"));
        ArrayList<String> curhead = new ArrayList<String>();
        for(WebElement i : headEl) {
            String a = i.getText();
            curhead.add(a);
        }
        String[] expHead = {"React v16.9.0 and the Roadmap Update", "React v16.7: No, This Is Not the One With Hooks", "Building Great User Experiences with Concurrent Mode and Suspense", "Introducing The Problem Solver React v17.0", "What about the React v16.13.0 That we Developed", "React v16.4.2: Server-side vulnerability fix", "Introducing Zero-Bundle-Size React Server Components", "Introducing the New JSX Transform", "Introducing the New React DevTools", "Sneak Peek: Beyond React 16"};
        int j;
        for(j = 0; j < headEl.size(); j++) {
            if(!(expHead[j].equals(curhead.get(j)))) {
                break;
            }
        }
        if(j == 10) {
            System.out.println("2Good");
        }
        else {
            System.out.println("2Not Good");
        }
        List<WebElement> navbarEl = driver.findElements(By.cssSelector("ul.nav-items-list > li > a"));
        WebElement aboutEl = navbarEl.get(1);
        aboutEl.click();
        String expUrl1 = "https://qabloghub.ccbp.tech/about";
        String curUrl1 = driver.getCurrentUrl();
        if(curUrl1.equals(expUrl1)) {
            System.out.println("3Good");
        }
        else {
            System.out.println("3Not Good");
        }
        WebElement contEl = navbarEl.get(2);
        contEl.click();
        String expUrl2 = "https://qabloghub.ccbp.tech/contact";
        String curUrl2 = driver.getCurrentUrl();
        if(curUrl2.equals(expUrl2)) {
            System.out.println("4Good");
        }
        else {
            System.out.println("4Not Good");
        }
        WebElement homeEl = navbarEl.get(0);
        homeEl.click();
        String expUrl3 = "https://qabloghub.ccbp.tech/";
        String curUrl3 = driver.getCurrentUrl();
        if(curUrl3.equals(expUrl3)) {
            System.out.println("5Good");
        }
        else {
            System.out.println("5Not Good");
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul.blogs-list > li.blog-item")));
        WebElement headingEl;
        for(j = 0; j < 10; j++) {
            WebElement linkEl = driver.findElement(By.cssSelector("a[href = '/blogs/" + (j + 1) + "']"));
            linkEl.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img.blog-image")));
            headingEl = driver.findElement(By.cssSelector("div.app-body h1"));
            if(!(expHead[j].equals(headingEl.getText()))) {
                break;
            }
            homeEl.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul.blogs-list > li.blog-item")));
        }
        if(j == 10) {
            System.out.println("6Good");
        }
        else {
            System.out.println("6Not Good");
        }

        driver.quit();
    }
}
