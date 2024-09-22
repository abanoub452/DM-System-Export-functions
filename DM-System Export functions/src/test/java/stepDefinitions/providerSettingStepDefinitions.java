package stepDefinitions;

import Pages.P02_CustomerControl;
import Pages.P03_ProviderSetting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class providerSettingStepDefinitions {
    WebDriver driver;
    loginStepDefiniions validlogin;
    P02_CustomerControl customerControl;
    P03_ProviderSetting providerSetting;
    SoftAssert softAssert;
    @BeforeTest
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin.medlite.app/login");
        validlogin =new loginStepDefiniions(driver);
        validlogin.validLogin();
        customerControl=new P02_CustomerControl(driver);
        providerSetting=new P03_ProviderSetting(driver);
        softAssert =new SoftAssert();
    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(500);
        driver.quit();
    }
    @Test
    public void ProviderLevel() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/provider_levels");
        providerSetting.providerExportSelect.click();
        providerSetting.providerCsv.click();
        providerSetting.providerExportSelect.click();
        providerSetting.providerExcel.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }
    @Test
    public void servicesType() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/service_types");
        providerSetting.providerExportSelect.click();
        providerSetting.providerCsv.click();
        providerSetting.providerExportSelect.click();
        providerSetting.providerExcel.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }
    @Test
    public void providerTypes() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/provider_types");
        providerSetting.providerExportSelect.click();
        providerSetting.providerCsv.click();
        providerSetting.providerExportSelect.click();
        providerSetting.providerExcel.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }
     @Test
    public void providerSpecialities() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/provider_specialities");
        providerSetting.providerExportSelect.click();
        providerSetting.providerCsv.click();
        providerSetting.providerExportSelect.click();
        providerSetting.providerExcel.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }
 @Test
    public void providerServices() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/provider_services");
        providerSetting.providerExportSelect.click();
        providerSetting.providerCsv.click();
        providerSetting.providerExportSelect.click();
        providerSetting.providerExcel.click();
        Thread.sleep(2000);
     softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }

}

