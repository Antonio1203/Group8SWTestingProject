import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class UserInteraction {
    public WebDriver driver;
    @BeforeClass
    void OpenBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\crazy\\Documents\\College Stuff\\2024\\Software Testing\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://twitter.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Username HoldurG7175
        // Password at619435
        // Click Sign-in, enter username
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[1]/div/div/div[3]/div[5]/a/div")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]/div/input")).sendKeys("HoldurG7175");
        Thread.sleep(1000);

        // Click 'Next,' enter password
        driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[6]/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div/label/div/div[2]/div[1]/input")).sendKeys("at619435");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div/div/div")).click();
        Thread.sleep(1000);
    }

    @Test
    void twitter_follow() throws InterruptedException {
        // Search 'FGCU'
        String keyword = "FGCU";
        driver.get("https://twitter.com/search?q=" + keyword + "&src=typed_query");
        Thread.sleep(4000);

        // Click the 'Follow' Button for FGCU at the top page.
        driver.findElement(By.xpath("//div[@data-testid='882934718-follow']")).click();
    }

    @Test
    void FGCU_like() throws InterruptedException {
        // Go to FGCU's Page
        driver.get("https://twitter.com/fgcu");
        Thread.sleep(1000);
        // Scroll Down
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("window.scroll(0,1000)", "");
        Thread.sleep(4000);

        // Like the first post in FGCU's profile
        List<WebElement> likes = driver.findElements(By.xpath("//div[@data-testid='like']"));
        likes.getFirst().click();
        Thread.sleep(1000);
    }

    @Test
    void FGCU_retweet() throws InterruptedException {
        // Go to FGCU's page
        driver.get("https://twitter.com/fgcu");
        JavascriptExecutor exe2 = (JavascriptExecutor) driver;
        // Scroll Down
        exe2.executeScript("window.scroll(0,1000)", "");
        Thread.sleep(4000);
        // Retweet the first post in FGCU's profile
        List<WebElement> retweet = driver.findElements(By.xpath("//div[@data-testid='retweet']"));
        retweet.getFirst().click();
        Thread.sleep(1000);
        // Click the confirm retweet button
        driver.findElement(By.xpath("//div[@data-testid='retweetConfirm']")).click();
        Thread.sleep(1000);
    }

    @Test
    void FGCU_quotetweet() throws InterruptedException {
        // Go to FGCU's page
        driver.get("https://twitter.com/fgcu");
        JavascriptExecutor exe2 = (JavascriptExecutor) driver;
        exe2.executeScript("window.scroll(0,1000)", "");
        Thread.sleep(4000);
        // Click the 'Retweet' button for the first tweet in FGCU's profile
        List<WebElement> retweet = driver.findElements(By.xpath("//div[@data-testid='retweet']"));
        retweet.getFirst().click();
        Thread.sleep(1000);
        // Click the 'Quote Tweet' button
        driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div[2]/div/div[3]/div/div/div/a/div[2]/div/span")).click();
        // Type in 'Go Eagles!' as the tweet
        driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[3]/div[2]/div[1]/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div/div/div[1]/label/div[1]/div/div/div/div/div/div[2]/div/div/div/div")).sendKeys("Go Eagles!");
        // Click 'Post'
        driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[3]/div[2]/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/span/span")).click();
    }

    @AfterClass
    void CloseBrowser() {
        driver.quit();
    }
}
