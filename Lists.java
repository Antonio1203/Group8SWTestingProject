import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Lists {
    public WebDriver driver;

    @BeforeClass
    void OpenBrowser() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\crazy\\Documents\\College Stuff\\2024\\Software Testing\\chromedriver-win64\\chromedriver.exe");
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
    public void lists_tab () throws InterruptedException {
        driver.get("https://twitter.com/home");
        Thread.sleep(2000);
        // Click on the Lists Tab from the home page.
        driver.findElement(By.xpath("//a[@aria-label='Lists']")).click();
        Thread.sleep(2000);
    }

    @Test
    public void followFirstList() throws InterruptedException {
        driver.get("https://twitter.com/HoldurG7175/lists");
        Thread.sleep(2000);
        // Clicks the 'Follow' button next to the first list option.
        List<WebElement> lists = driver.findElements(By.xpath("//div[@aria-label='Follow']"));
        lists.getFirst().click();
        Thread.sleep(1000);
    }

    @Test
    public void viewFirstList() throws InterruptedException {
        driver.get("https://twitter.com/HoldurG7175/lists");
        Thread.sleep(2000);
        // Views the details of the first list option.
        List<WebElement> lists = driver.findElements(By.xpath("//div[@data-testid='listCell']"));
        lists.getFirst().click();
        Thread.sleep(1000);
    }

    @Test
    public void showLists() throws InterruptedException {
        driver.get("https://twitter.com/HoldurG7175/lists");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/i/lists/suggested']")).click();
        Thread.sleep(3000);
        // Clicks the 'Show More' button under the first three lists
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");//scroll up
        Thread.sleep(4000);
    }

    @Test
    public void createList() throws InterruptedException {
        driver.get("https://twitter.com/HoldurG7175/lists");
        Thread.sleep(2000);
        // Clicks the 'Create List' button in the top right
        driver.findElement(By.xpath("//a[@href='/i/lists/create']")).click();
        Thread.sleep(3000);
        // Enters 'Holdur's List' as the title for the new list
        driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/label")).sendKeys("Holdur's List");
        Thread.sleep(2000);
        // Checks the 'Private' checkbox
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        Thread.sleep(1000);
        // Clicks the 'Next' button to create the list
        driver.findElement(By.xpath("//div[@aria-label='Next']")).click();
        Thread.sleep(2000);
    }

    @AfterClass
    void CloseBrowser() {
        driver.quit();
    }

}