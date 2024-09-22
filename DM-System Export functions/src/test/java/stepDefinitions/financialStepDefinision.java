package stepDefinitions;

import Pages.P06_Tutorial;
import Pages.P07_Financial;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class financialStepDefinision {
    WebDriver driver ;
    loginStepDefiniions validlogin;
    P07_Financial sub;
    SoftAssert softAssert;

    @BeforeTest
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin.medlite.app/login");
        validlogin =new loginStepDefiniions(driver);
        validlogin.validLogin();
        sub=new P07_Financial(driver);
        softAssert =new SoftAssert();
    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(500);
        driver.quit();
    }
    @Test (priority = 1)
    public void subscriptionTransaction() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/subscription_transaction");
        sub.subSelectType.click();
        sub.subSelectCsv.click();
        sub.subSelectType.click();
        sub.subSelectExport.click();
        sub.subSelectType.click();
        sub.subSelectPdf.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Financial Transaction Export Export");
        softAssert.assertAll();
    }
    @Test (priority = 2)
    public void serviceTransaction() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/transactions");
        sub.subSelectType.click();
        sub.subSelectCsv.click();
        sub.subSelectType.click();
        sub.subSelectExport.click();
        sub.subSelectType.click();
        sub.subSelectPdf.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Financial Transaction Export Export");
        softAssert.assertAll();
    }
 @Test
    public void chargeWallet() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/charge_wallet_transaction");
        sub.subSelectType.click();
        sub.subSelectCsv.click();
        sub.subSelectType.click();
        sub.subSelectExport.click();
        Thread.sleep(2000);
     System.out.println(driver.getTitle());
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Financial Transaction Export Export");
        softAssert.assertAll();
    }
 @Test
    public void refundReport() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/transaction_report");
        sub.subSelectType.click();
        sub.subSelectCsv.click();
        sub.subSelectType.click();
        sub.subSelectExport.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Financial Transaction Export Export");
        softAssert.assertAll();
    }
 @Test
    public void payOff() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/provider_pay_off");
        sub.paySelectType.click();
        sub.paySelectCsv.click();
        sub.paySelectType.click();
        sub.paySelectExcel.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Financial Transaction Export Export");
        softAssert.assertAll();
    }
@Test
    public void WithdrawalPaymentMethods() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/withdrawal_payment_method");
        sub.subSelectType.click();
        sub.subSelectCsv.click();
        sub.subSelectType.click();
        sub.subSelectExport.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Financial Transaction Export Export");
        softAssert.assertAll();
    }
@Test
    public void taxType() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/tax_type");
        sub.subSelectType.click();
        sub.subSelectCsv.click();
        sub.subSelectType.click();
        sub.subSelectExport.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Financial Transaction Export Export");
        softAssert.assertAll();
    }
@Test
    public void tax() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/tax");
        sub.subSelectType.click();
        sub.subSelectCsv.click();
        sub.subSelectType.click();
        sub.subSelectExport.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Financial Transaction Export Export");
        softAssert.assertAll();
    }

}
