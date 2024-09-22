package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P05_Advertising {
    WebDriver driver;
    public P05_Advertising(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[3]/div[2]/button")
    public WebElement advSelect;
    @FindBy(xpath = "//div[3]/div[2]/div/a[1]")
    public WebElement advCsv;
    @FindBy(xpath = "//div[3]/div[2]/div/a[2]")
    public WebElement advExport;


}
