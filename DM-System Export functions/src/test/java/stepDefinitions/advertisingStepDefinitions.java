package stepDefinitions;

import Pages.P02_CustomerControl;
import Pages.P05_Advertising;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class advertisingStepDefinitions {
    WebDriver driver ;
    loginStepDefiniions validlogin;
    P05_Advertising advertising;
    SoftAssert softAssert;

    @BeforeTest
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin.medlite.app/login");
        validlogin =new loginStepDefiniions(driver);
        validlogin.validLogin();
        advertising=new P05_Advertising(driver);
        softAssert =new SoftAssert();
    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(500);
        driver.quit();
    }
    @Test
    public void promtions() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/promotions");
        advertising.advSelect.click();
        advertising.advCsv.click();
        advertising.advSelect.click();
        advertising.advExport.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }
    @Test
    public void banners() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/advertising");
        advertising.advSelect.click();
        advertising.advCsv.click();
        advertising.advSelect.click();
        advertising.advExport.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }
        @Test
        public void sponsorCategory() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/sponsor_categories");
        advertising.advSelect.click();
        advertising.advCsv.click();
        advertising.advSelect.click();
        advertising.advExport.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }
        @Test
        public void sponsorsList() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/sponsor_lists");
        advertising.advSelect.click();
        advertising.advCsv.click();
        advertising.advSelect.click();
        advertising.advExport.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }

}
