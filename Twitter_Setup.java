import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.util.Iterator;
import java.util.List;

public class Twitter_Setup {
    public WebDriver driver;
    @BeforeClass
    void OpenBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\crazy\\Documents\\College Stuff\\2024\\Software Testing\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://twitter.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test
    void VerifyTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(driver.getTitle(), "X. It’s what’s happening / X");
        System.out.println("Website Title:" + title);
    }

    @Test
    void VerifyURL() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(), "https://twitter.com/");
        System.out.println("Website URL:" + url);
    }

    @Test
    void ListElements() throws InterruptedException {
        List<WebElement> link = driver.findElements(By.tagName("a"));
        Thread.sleep(4000);
        System.out.println(link.size());
        System.out.println(link.size());
        Thread.sleep(4000L);

        for (WebElement l : link) {
            System.out.println(l.getText());
        }
    }

    @Test
    void login_test() throws InterruptedException {
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

    @AfterClass
    void CloseBrowser() {
        driver.quit();
    }
}
