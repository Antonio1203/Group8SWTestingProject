import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Notifications {

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
    void clickVerifiedButton() throws InterruptedException {
        driver.get("https://twitter.com/notifications");
        // Wait for the page to load
        Thread.sleep(2000);

        // looks for the verified button
        WebElement verifiedButton = driver.findElement(By.xpath("//a[@href='/notifications/verified']"));

        // Click the verified button
        verifiedButton.click();

        // Wait for the page to load
        Thread.sleep(2000);
    }

    @Test
    void clickMentionButton() throws InterruptedException {
        driver.get("https://twitter.com/notifications");
        // Wait for the page to load
        Thread.sleep(2000);

        //Looks for the mention Button
        WebElement mentionButton = driver.findElement(By.xpath("//a[@href='/notifications/mentions']"));

        //Clicks the all button
        mentionButton.click();

        // Wait for the page to load
        Thread.sleep(2000);
    }

    @Test
    void settingFilters() throws InterruptedException {
        driver.get("https://twitter.com/notifications");
        Thread.sleep(2000);
        // clicks on the setting icon
        WebElement settingsIcon = driver.findElement(By.xpath("//a[@href='/settings/notifications']"));
        settingsIcon.click();
        Thread.sleep(2000);

        // Clicks on filter option/html/head
        WebElement filtersOption = driver.findElement(By.xpath("//a[@href='/settings/notifications/filters']"));
        filtersOption.click();
        Thread.sleep(2000);

        // Click on the "Muted Notifications" option
        WebElement muteNotificationsOption = driver.findElement(By.xpath("//a[@href='/settings/notifications/advanced_filters']")); // Adjust this XPath based on the actual label or attribute of the "Mute Notifications" option
        muteNotificationsOption.click();
        Thread.sleep(2000);

        // Click on the 'With New Account' Option
        WebElement muteNewAccounts = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/section[2]/div[2]/div/div[4]/div/label/div/div[2]/input")); // Adjust this XPath based on the actual label or attribute of the "Mute Notifications" option
        muteNewAccounts.click();
        Thread.sleep(2000);
    }


    @Test
    void settingPreferences() throws InterruptedException {
        driver.get("https://twitter.com/notifications");
        Thread.sleep(2000);
        // clicks on the setting icon
        // clicks on the setting icon
        WebElement settingsIcon = driver.findElement(By.xpath("//a[@href='/settings/notifications']"));
        settingsIcon.click();
        Thread.sleep(2000);

        //Click on the preferences OPtion
        WebElement preferencesOption = driver.findElement(By.xpath("//a[@href='/settings/notifications/preferences']"));
        preferencesOption.click();
        Thread.sleep(2000);


        //Click on Email Notifications
        WebElement emailNotificationsOption = driver.findElement(By.xpath("//a[@href='/settings/email_notifications']"));
        emailNotificationsOption.click();
        Thread.sleep(2000);

        //Scrolls Down to view the preferences
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("window.scroll(0,2000)","");
        Thread.sleep(2000);
    }

    @AfterClass
    void CloseBrowser() {
        driver.quit();
    }


}
