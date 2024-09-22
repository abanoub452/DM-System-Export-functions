package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P04_ProviderControl {
    WebDriver driver;
    public P04_ProviderControl(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[3]/div[2]/button")
    public WebElement providerExportSelect ;
    @FindBy(xpath = "//div[3]/div[2]/div/a[1]")
    public WebElement providerCsv;
    @FindBy(xpath = "//div[3]/div[2]/div/a[2]")
    public WebElement providerExcel;
    //>>>>>>>>>>>>>>>>>Provider Account<<<<<<<<<<<<<<<<<<<<<
    @FindBy(xpath = "//div[2]/div/div[1]/div[1]/div/div[1]/button")
    public WebElement exportBtn ;
    @FindBy(xpath = "//div[2]/div/div[1]/div[1]/div/div[1]/div/a[1]")
    public WebElement accountExportdata ;

    @FindBy(xpath = "//div[2]/div/div[1]/div[1]/div/div[1]/div/a[2]")
    public WebElement accountExprtOverhead ;
    //>>>>>>>>>>>>>>>price List <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    @FindBy(xpath = "//div[2]/div[2]/button")
    public WebElement pricelistselect ;
    @FindBy(xpath = "//div[2]/div[2]/div/a[1]")
    public WebElement pricelistCsv ;
    @FindBy(xpath = "//div[2]/div[2]/div/a[2]")
    public WebElement pricelistExcel;
    @FindBy(xpath = "//*[@id=\"612\"]/td[10]/div/a")
    public WebElement openProviderPriceList;
    @FindBy(xpath = "//div[2]/div/div[1]/div[3]/div[3]/button")
        public WebElement openProviderPriceListSelect;

    @FindBy(xpath = "//div[2]/div/div[1]/div[3]/div[3]/div/a[1]")
        public WebElement openPriceListCsv;
    @FindBy(xpath = "//div[2]/div/div[1]/div[3]/div[3]/div/a[2]")
        public WebElement openPriceListExcel;
    //>>>>>>>>>>>>>>>>>>>>>Provider Pricelist Mapping<<<<<<<<<<<<<<<<<<
    @FindBy(xpath = "//div[2]/div/div[1]/div[3]/div[3]/button")
    public WebElement mappingExportBtn;
    @FindBy(xpath = "//div[3]/div[3]/div/a")
    public WebElement mappingExcel;
//>>>>>>>>>>>>>>>>>>>>>Provider Branches<<<<<<<<<<<<<<<<<<
    @FindBy(xpath = "//div[2]/div/div[1]/div[1]/div[2]/button")
    public WebElement branchExport;
    @FindBy(xpath = "//div[1]/div[2]/div/a[1]")
    public WebElement branchCsv;
    @FindBy(xpath = "//div[1]/div[2]/div/a[2]")
    public WebElement branchExcel;
    //>>>>>>>>>>>>>>>>Provider Staff Management <<<<<<<<<<<<<<<<<<
    @FindBy(xpath = "//div[1]/div[3]/div[2]/button")
    public WebElement staffSelect;
    @FindBy(xpath = "//div[3]/div[2]/div/a[1]")
    public WebElement staffCsv;
    @FindBy(xpath = "//div[3]/div[2]/div/a[2]")
    public WebElement staffExcel;




}
