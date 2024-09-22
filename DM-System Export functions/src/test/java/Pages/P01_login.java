package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01_login {
    WebDriver driver;
    public P01_login(WebDriver driver)
    {
        this.driver=driver;
    }
    public WebElement email(){return driver.findElement(By.id("email"));}
    public WebElement password(){return driver.findElement(By.id("password"));}
    public WebElement loginBtn(){return driver.findElement(By.xpath("//button[contains(text(),'Login')]"));}

}
