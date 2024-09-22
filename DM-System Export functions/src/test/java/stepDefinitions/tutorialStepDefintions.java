package stepDefinitions;

import Pages.P06_Tutorial;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class tutorialStepDefintions {
    WebDriver driver ;
    loginStepDefiniions validlogin;
    P06_Tutorial tutorial;
    SoftAssert softAssert;

    @BeforeTest
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin.medlite.app/login");
        validlogin =new loginStepDefiniions(driver);
        validlogin.validLogin();
        tutorial=new P06_Tutorial(driver);
        softAssert =new SoftAssert();
    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(500);
        driver.quit();
    }
    @Test
    public void tutorialList() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/tutorial");
        tutorial.tutorialSelect.click();
        tutorial.tutorialCsv.click();
        tutorial.tutorialSelect.click();
        tutorial.tutorialExport.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }
    @Test
    public void tutorialCategory() throws InterruptedException {
        driver.navigate().to("https://admin.medlite.app/dashboard/tutorial_category");
        tutorial.tutorialSelect.click();
        tutorial.tutorialCsv.click();
        tutorial.tutorialSelect.click();
        tutorial.tutorialExport.click();
        Thread.sleep(2000);
        softAssert.assertEquals(driver.getTitle(),"DMSystem","Error Message in Customer Type Export");
        softAssert.assertAll();
    }

}
