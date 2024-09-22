package stepDefinitions;

import Pages.P02_CustomerControl;
import Pages.P04_ProviderControl;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProviderControlStepDefinitions {
    WebDriver driver;
    loginStepDefiniions validlogin;
    P02_CustomerControl customerControl;
    P04_ProviderControl providerControl;
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
        providerControl=new P04_ProviderControl(driver);
        softAssert =new SoftAssert();
    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(500);
        driver.quit();
    }
    @Test
    public void ProviderRequest() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/provider_request");
        providerControl.providerExportSelect.click();
        providerControl.providerCsv.click();
        providerControl.providerExportSelect.click();
        providerControl.providerExcel.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }
     @Test
    public void ProviderAccount() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/provider_accounts");
        providerControl.exportBtn.click();
        providerControl.accountExportdata.click();
        providerControl.exportBtn.click();
        providerControl.accountExprtOverhead.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }
    @Test
    public void providerPriceList() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/provider_accounts_price_lists_types");
        providerControl.pricelistselect.click();
        providerControl.pricelistCsv.click();
        providerControl.pricelistselect.click();
        providerControl.pricelistExcel.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        providerControl.openProviderPriceList.click();
        providerControl.openProviderPriceListSelect.click();
        providerControl.openPriceListCsv.click();
        providerControl.openProviderPriceListSelect.click();
        providerControl.openPriceListExcel.click();
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }
    @Test
    public void ProviderPricelistMapping() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/provider_price_list_mapping");
        providerControl.mappingExportBtn.click();
        providerControl.mappingExcel.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }
    @Test
    public void ProviderBranch() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/provider_branches");
        providerControl.branchExport.click();
        providerControl.branchCsv.click();
        providerControl.branchExport.click();
        providerControl.branchExcel.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }
@Test
    public void ProviderStaffManagement() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/provider_staff_managements");
        providerControl.staffSelect.click();
        providerControl.staffCsv.click();
        providerControl.staffSelect.click();
        providerControl.staffExcel.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }
@Test
    public void OrderRequest() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/orders");
        providerControl.providerExportSelect.click();
        providerControl.providerCsv.click();
        providerControl.providerExportSelect.click();
        providerControl.providerExcel.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }

}
