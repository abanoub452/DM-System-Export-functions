package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class P03_ProviderSetting {
    WebDriver driver;

    public P03_ProviderSetting(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[3]/div[2]/button")
    public WebElement providerExportSelect ;
    @FindBy(xpath = "//div[3]/div[2]/div/a[1]")
    public WebElement providerCsv;
    @FindBy(xpath = "//div[3]/div[2]/div/a[2]")
    public WebElement providerExcel;
}


