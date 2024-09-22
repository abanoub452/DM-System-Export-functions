package stepDefinitions;

import Pages.P01_login;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginStepDefiniions {
    WebDriver driver;
    P01_login login;
    public loginStepDefiniions(WebDriver driver){
        this.driver=driver;
    }
    @BeforeTest
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin.medlite.app/login");
    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(500);
        driver.quit();
    }
    @Test
    public void validLogin()
    {
        login=new P01_login(driver);
        login.email().sendKeys("anasser@gmail.com");
        login.password().sendKeys("anasser@gmail.com");
        login.loginBtn().sendKeys(Keys.ENTER);
    }
}
