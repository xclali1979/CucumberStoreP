package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Order5 {

    WebDriver driver;

    public Order5(){

        this.driver= Driver.driverSetup("chrome");
        PageFactory.initElements(driver,this);


    }
    @FindBy(xpath="//*[@id=\"center_column\"]/ul/li/a")
    public WebElement home;

    @FindBy(xpath="//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img")
    public WebElement order1;

    @FindBy(xpath="//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]")
    public WebElement addtocard;
    @FindBy(xpath="//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]")
    public WebElement addtocard2;
    @FindBy(xpath="//*[@id=\"homefeatured\"]/li[3]/div/div[2]/div[2]/a[1]")
    public WebElement addtocard3;
    @FindBy(xpath="//*[@id=\"homefeatured\"]/li[4]/div/div[2]/div[2]/a[1]")
    public WebElement addtocard4;
    @FindBy(xpath="//*[@id=\"homefeatured\"]/li[5]/div/div[2]/div[2]/a[1]")
    public WebElement addtocard5;
    @FindBy(xpath="//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img")
    public WebElement order2;

    @FindBy(xpath="//*[@id=\"homefeatured\"]/li[3]/div/div[1]/div/a[1]/img")
    public WebElement order3;
    @FindBy(xpath="//*[@id=\"homefeatured\"]/li[4]/div/div[1]/div/a[1]/img")
    public WebElement order4;
    @FindBy(xpath="//*[@id=\"homefeatured\"]/li[5]/div/div[1]/div/a[1]/img")
    public WebElement order5;

    @FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    public WebElement Proceedtocheckout;

    @FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")
    public WebElement continueshopping;

    @FindBy(id="total_price")
    public WebElement totalPrice;

    @FindBy(id="uniform-id_gender1")
    public WebElement mr;

    @FindBy(id="uniform-id_gender2")
    public WebElement mrs;

    @FindBy(id="customer_firstname")
    public WebElement firtName1;

    @FindBy(id="customer_lastname")
    public WebElement lastName1;
}
