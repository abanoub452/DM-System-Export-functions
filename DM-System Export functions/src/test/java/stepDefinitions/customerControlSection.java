package stepDefinitions;

import Pages.P02_CustomerControl;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class customerControlSection {
    WebDriver driver ;
    loginStepDefiniions validlogin;
    P02_CustomerControl customerControl;
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
        softAssert =new SoftAssert();
    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(500);
        driver.quit();
    }
    @Test
    public void customerType() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/customer_types");
        customerControl.selectExport().click();
        customerControl.typeCsvExport().click();
        customerControl.selectExport().click();
        customerControl.typeExcelExport().click();
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }
    @Test
    public void customerPackage(){
        driver.navigate().to("https://admin.medlite.app/dashboard/customer_packages");
        customerControl.selectExportPackage().click();
        customerControl.typeCsvExportPackage().click();
        customerControl.selectExportPackage().click();
        customerControl.typeExcelExport().click();
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }
    @Test
    public void customerList(){
        driver.navigate().to("https://admin.medlite.app/dashboard/customer_lists");
        customerControl.customerListSelectExport().click();
        customerControl.customerListCsvExport().click();
        customerControl.customerListSelectExport().click();
        customerControl.customerListExcelExport().click();
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }
    @Test
    public void customerRequest(){
        driver.navigate().to("https://admin.medlite.app/dashboard/customer_request");
        customerControl.customerRequestSelect().click();
        customerControl.customerRequestCsv().click();
        customerControl.customerRequestSelect().click();
        customerControl.customerRequestExcel().click();
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }
    @Test
    public void inpatient(){
        driver.navigate().to("https://admin.medlite.app/dashboard/inpatient");
        customerControl.inpatientSelect().click();
        customerControl.inpatientCsv().click();
        customerControl.inpatientSelect().click();
        customerControl.inpatientExcel().click();
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }

}
