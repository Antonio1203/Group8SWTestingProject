import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

public class Explore {
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
    void open_explore_tab() throws InterruptedException {
        driver.get("https://twitter.com/HoldurG7175");
        Thread.sleep(2000);
        // Click on the profile tab
        driver.findElement(By.xpath("//a[@aria-label='Search and explore']")).click();
        Thread.sleep(2000);
    }

    @Test
    void trending_tab() throws InterruptedException {
        driver.get("https://twitter.com/explore");
        Thread.sleep(2000);
        // Click on Trending tab
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[1]/div[1]/div[2]/nav/div/div[2]/div/div[2]/a")).click();
        Thread.sleep(4000);

    }

    @Test
    void news_tab() throws InterruptedException {
        driver.get("https://twitter.com/explore");
        Thread.sleep(2000);
        // Click on News Tab
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div/div/div[1]/div[1]/div[2]/nav/div/div[2]/div/div[3]/a")).click();
        Thread.sleep(3000);
    }

    @Test
    void sports_tab() throws InterruptedException {
        driver.get("https://twitter.com/explore");
        Thread.sleep(2000);
        // Click on Sports Tab
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div/div/div[1]/div[1]/div[2]/nav/div/div[2]/div/div[4]/a")).click();
        Thread.sleep(3000);
    }

    @Test
    void entertainment_tab() throws InterruptedException {
        driver.get("https://twitter.com/explore");
        Thread.sleep(2000);
        // Click on Entertainment Tab
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div/div/div[1]/div[1]/div[2]/nav/div/div[2]/div/div[5]/a/div/div")).click();
        Thread.sleep(2000);
    }

    @Test
    void nba_link() throws InterruptedException {
        driver.get("https://twitter.com/explore");
        Thread.sleep(2000);
        // Click on the NBA header below the search bar.
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div/div/div[3]/div/section/div/div/div[2]/div/div/a")).click();
        Thread.sleep(2000);
    }

    @Test
    void scroll_bottom() throws InterruptedException {
        driver.get("https://twitter.com/explore");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        // Scrolls to the bottom of the currently viewable page
        exe.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
        Thread.sleep(3000);
    }

    @AfterClass
    void CloseBrowser() {
        driver.quit();
    }

}
