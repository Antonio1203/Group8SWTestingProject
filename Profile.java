import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Profile {
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
    void profile_tab() throws InterruptedException {
        Thread.sleep(2000);
        // Click on the profile tab
        driver.findElement(By.xpath("//a[@aria-label='Profile']")).click();
        Thread.sleep(2000);
    }

    @Test
    void view_following() throws InterruptedException {
        driver.get("https://twitter.com/HoldurG7175");
        Thread.sleep(1000);
        // Click on the 'Following' button
        driver.findElement(By.xpath("//a[@href='/HoldurG7175/following']")).click();
        Thread.sleep(2000);
    }

    @Test
    void view_followers() throws InterruptedException {
        driver.get("https://twitter.com/HoldurG7175");
        Thread.sleep(1000);
        // Click on the 'Followers' button
        driver.findElement(By.xpath("//a[@href='/HoldurG7175/verified_followers']")).click();
        Thread.sleep(2000);
    }

    @Test
    void view_pfp() throws InterruptedException {
        driver.get("https://twitter.com/HoldurG7175");
        Thread.sleep(1000);
        // Click on the Profile Picture
        driver.findElement(By.xpath("//a[@href='/HoldurG7175/photo']")).click();
        Thread.sleep(2000);
    }

    @Test
    void replies_tab() throws InterruptedException {
        driver.get("https://twitter.com/HoldurG7175");
        Thread.sleep(1000);
        // Click on the Replies tab
        driver.findElement(By.xpath("//a[@href='/HoldurG7175/with_replies']")).click();
        Thread.sleep(2000);
    }

    @Test
    void highlights_tab() throws InterruptedException {
        driver.get("https://twitter.com/HoldurG7175");
        Thread.sleep(1000);
        // Click on the Highlights Tab
        driver.findElement(By.xpath("//a[@href='/HoldurG7175/highlights']")).click();
        Thread.sleep(2000);
    }

    @Test
    void articles_tab() throws InterruptedException{
        driver.get("https://twitter.com/HoldurG7175");
        Thread.sleep(1000);
        // Click on the Articles Tab
        driver.findElement(By.xpath("//a[@href='/HoldurG7175/articles']")).click();
        Thread.sleep(2000);
    }

    @Test
    void media_tab() throws InterruptedException {
        driver.get("https://twitter.com/HoldurG7175");
        Thread.sleep(1000);
        // Click on the Media Tab
        driver.findElement(By.xpath("//a[@href='/HoldurG7175/media']")).click();
        Thread.sleep(2000);
    }

    @Test
    void likes_tab() throws InterruptedException {
        driver.get("https://twitter.com/HoldurG7175");
        Thread.sleep(1000);
        // Click on the Likes tab
        driver.findElement(By.xpath("//a[@href='/HoldurG7175/likes']")).click();
        Thread.sleep(2000);
    }

    @AfterClass
    void CloseBrowser() {
        driver.quit();
    }

}
