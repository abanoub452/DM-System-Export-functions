package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P07_Financial {
    WebDriver driver;
    public P07_Financial(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //Subscription
    @FindBy(xpath = "//div[3]/div[2]/button")
    public WebElement subSelectType ;
    @FindBy(xpath = "//div[3]/div[2]/div/a[1]")
    public WebElement subSelectCsv ;
    @FindBy(xpath = "//div[3]/div[2]/div/a[2]")
    public WebElement subSelectExport ;
    @FindBy(xpath = "//div[3]/div[2]/div/a[3]")
    public WebElement subSelectPdf ;
    //PayOff
    @FindBy(xpath = "//div[3]/div/button")
    public WebElement paySelectType ;
    @FindBy(xpath = "//div[3]/div/div/a[1]")
    public WebElement paySelectCsv ;
    @FindBy(xpath = "//div[3]/div/div/a[2]")
    public WebElement paySelectExcel ;

}
