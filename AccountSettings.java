import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class AccountSettings {

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
    void clickAccount() throws InterruptedException {
        driver.get("https://twitter.com");

        Thread.sleep(2000);
        // Find and click the "More" button
        WebElement moreButton = driver.findElement(By.xpath("//div[@aria-label='More menu items']"));
        moreButton.click();
        Thread.sleep(2000);

        // Wait for the menu to expand (adjust the wait time as needed)
        Thread.sleep(2000);

        // Find and click the "Settings and privacy" option
        WebElement settingsAndPrivacyOption = driver.findElement(By.xpath("//a[@href='/settings']"));
        settingsAndPrivacyOption.click();

        Thread.sleep(2000);

        // Find and click the "Your Account" option
        WebElement yourAccountOption = driver.findElement(By.xpath("//a[@href='/settings/account']"));
        yourAccountOption.click();
        Thread.sleep(2000);

        // Find and click the "Account Information" option
        WebElement accountInformationOption = driver.findElement(By.xpath("//a[@href='/settings/your_twitter_data/account']"));
        accountInformationOption.click();
        Thread.sleep(2000);

        // Enters the password
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/section[2]/div[2]/div[3]/label/div/div[2]/div/input")).sendKeys("at619435");
        Thread.sleep(1000);

        //Clicks comfirm
        WebElement confirmButton = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/section[2]/div[2]/div[4]/div/div/span/span"));
        confirmButton.click();
        Thread.sleep(2000);

    }
    @Test
    void privacySafety() throws InterruptedException {
        driver.get("https://twitter.com");

        Thread.sleep(2000);

        // Find and click the "More" button
        WebElement moreButton = driver.findElement(By.xpath("//div[@aria-label='More menu items']"));
        moreButton.click();

        // Wait for the menu to expand (adjust the wait time as needed)
        Thread.sleep(2000);

        // Find and click the "Settings and privacy" option
        WebElement settingsAndPrivacyOption = driver.findElement(By.xpath("//a[@href='/settings']"));
        settingsAndPrivacyOption.click();

        Thread.sleep(2000);

        // Find and click the "Privacy and safety" option
        WebElement privacyAndSafetyOption = driver.findElement(By.xpath("//a[@href='/settings/privacy_and_safety']"));
        privacyAndSafetyOption.click();

        Thread.sleep(2000);

        // Find and click the "Content you see" option
        WebElement contentYouSeeOption = driver.findElement(By.xpath("//a[@href='/settings/content_you_see']"));
        contentYouSeeOption.click();

        Thread.sleep(2000);

        WebElement topicsOption = driver.findElement(By.xpath("//a[@href='/HoldurG7175/topics']"));
        topicsOption.click();

        Thread.sleep(2000);
    }

    @Test
    void displayLanguage() throws InterruptedException {
        driver.get("https://twitter.com");

        Thread.sleep(2000);
        // Find and click the "More" button
        WebElement moreButton = driver.findElement(By.xpath("//div[@aria-label='More menu items']"));
        moreButton.click();
        Thread.sleep(2000);

        // Find and click the "Settings and privacy" option
        WebElement settingsAndPrivacyOption = driver.findElement(By.xpath("//a[@href='/settings']"));
        settingsAndPrivacyOption.click();
        Thread.sleep(2000);

        // Find and click the "Accessibility, display, and languages" option
        WebElement accessibilityDisplayLanguagesOption = driver.findElement(By.xpath("//a[@href='/settings/accessibility_display_and_languages']"));
        accessibilityDisplayLanguagesOption.click();
        Thread.sleep(2000);

        // Find and click the "languages" option
        WebElement languagesOption = driver.findElement(By.xpath("//a[@href='/settings/languages']"));
        languagesOption.click();
        Thread.sleep(2000);

        // Find and click the "Display Language" option
        WebElement displayLanguageOption = driver.findElement(By.xpath("//a[@href='/settings/language']"));
        displayLanguageOption.click();
        Thread.sleep(2000);

        //Find and click the language dropdown
        WebElement languageDropdown = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/section[2]/div[2]/div[1]/div[1]"));
        languageDropdown.click();
        Thread.sleep(2000);

    }

    @AfterClass
    void CloseBrowser() {
        driver.quit();
    }
}
