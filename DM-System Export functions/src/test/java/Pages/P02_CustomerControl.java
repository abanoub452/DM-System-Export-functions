package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

public class P02_CustomerControl {
    WebDriver driver ;
    public P02_CustomerControl(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Customer Type <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public WebElement selectExport(){return driver.findElement(By.xpath("//div[3]/div[2]/button[1]"));}
    public WebElement typeCsvExport(){return driver.findElement(By.xpath("//div[3]/div[2]/div/a[1]"));}
    public WebElement typeExcelExport(){return driver.findElement(By.xpath("//div[3]/div[2]/div[1]/a[2]"));}
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Customer Package <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public WebElement selectExportPackage(){return driver.findElement(By.xpath("//div[3]/div[2]/button[1]"));}
    public WebElement typeCsvExportPackage(){return driver.findElement(By.xpath("//div[3]/div[2]/div[1]/a[1]"));}
    public WebElement typeExcelExportPackage(){return driver.findElement(By.xpath("//div[3]/div[2]/div[1]/a[2]"));}
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Customer List <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public WebElement customerListSelectExport(){return driver.findElement(By.xpath("//div[3]/div[2]/button[1]"));}
    public WebElement customerListCsvExport(){return driver.findElement(By.xpath("//div[3]/div[2]/div[1]/a[1]"));}
    public WebElement customerListExcelExport(){return driver.findElement(By.xpath("//div[3]/div[2]/div[1]/a[2]"));}
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Customer Request<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public WebElement customerRequestSelect(){return driver.findElement(By.xpath("//div[3]/div[2]/button"));}
    public WebElement customerRequestCsv(){return driver.findElement(By.xpath("//div[3]/div[2]/div/a[1]"));}
    public WebElement customerRequestExcel(){return driver.findElement(By.xpath("//div[3]/div[2]/div/a[2]"));}
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Inpatient<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public WebElement inpatientSelect(){return driver.findElement(By.xpath("//div[3]/div[2]/button"));}
    public WebElement inpatientCsv(){return driver.findElement(By.xpath("//div[3]/div[2]/div/a[1]"));}
    public WebElement inpatientExcel(){return driver.findElement(By.xpath("//div[3]/div[2]/div/a[2]"));}

}
