import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

public class Timeline {
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
    void TLFirst_like() throws InterruptedException {
        // Scroll down slightly to view the first tweet
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("window.scroll(0,-3000)", "");
        Thread.sleep(4000);
        // Like the first tweet in the timeline
        List<WebElement> likes = driver.findElements(By.xpath("//div[@data-testid='like']"));
        likes.getFirst().click();
        Thread.sleep(1000);
    }

    @Test
    void TLFirst_retweet() throws InterruptedException {
        driver.get("https://twitter.com/home");
        // Scroll down slightly to view the first tweet
        JavascriptExecutor exe2 = (JavascriptExecutor) driver;
        exe2.executeScript("window.scroll(0,-3000)", "");
        Thread.sleep(4000);
        // Retweet the first tweet in the timeline
        List<WebElement> retweet = driver.findElements(By.xpath("//div[@data-testid='retweet']"));
        retweet.getFirst().click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@data-testid='retweetConfirm']")).click();
        Thread.sleep(1000);

    }

    @Test
    void TLFirst_bookmark() throws InterruptedException {
        driver.get("https://twitter.com/home");
        JavascriptExecutor exe3 = (JavascriptExecutor) driver;
        exe3.executeScript("window.scroll(0,-3000)", "");
        Thread.sleep(4000);

        List<WebElement> bookmark = driver.findElements(By.xpath("//div[@data-testid='bookmark']"));
        bookmark.getFirst().click();
        Thread.sleep(1000);

    }

    @Test
    void tweet_view() throws InterruptedException {
        driver.get("https://twitter.com/home");
        Thread.sleep(2000);
        JavascriptExecutor exe4 = (JavascriptExecutor) driver;
        exe4.executeScript("window.scroll(0,-3000)", "");
        Thread.sleep(4000);

        List<WebElement> tweets = driver.findElements(By.xpath("//article[@role='article']"));
        tweets.getFirst().click();
        Thread.sleep(3000);
    }

    @Test
    void Trending_link() throws InterruptedException {
        driver.get("https://twitter.com/home");
        JavascriptExecutor exe5 = (JavascriptExecutor) driver;
        exe5.executeScript("window.scroll(0,-5000)", "");
        Thread.sleep(4000);
        // Click 'Show More' beneath 'What's Happening' sidebar
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div/div[2]/div/div/div/div[4]/div/section/div/div/div[8]/div/a")).click();
        Thread.sleep(2000);
    }

    @Test
    void follow_who() throws InterruptedException {
        driver.get("https://twitter.com/home");
        JavascriptExecutor exe5 = (JavascriptExecutor) driver;
        exe5.executeScript("window.scroll(0,-10000)", "");
        Thread.sleep(4000);
        // Click 'Show More' beneath 'Who to Follow' sidebar
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div/div[2]/div/div/div/div[5]/div/aside/a/div/span")).click();
        Thread.sleep(2000);
    }

    @AfterClass
    void CloseBrowser() {
        driver.quit();
    }

}
