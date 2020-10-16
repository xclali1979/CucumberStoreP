package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StorPLoginPage {

    WebDriver driver;

    public StorPLoginPage(){

     this.driver= Driver.driverSetup("chrome");
        PageFactory.initElements(driver,this);


    }

   @FindBy(xpath="//input[@id='email_create']")
   public WebElement getEmail;

    @FindBy(xpath="//form[@id='create-account_form']//span[1]")
    public WebElement submitcreate;

    @FindBy(id="uniform-id_gender1")
    public WebElement mr;

    @FindBy(id="uniform-id_gender2")
    public WebElement mrs;

    @FindBy(id="customer_firstname")
    public WebElement firtName1;

    @FindBy(id="customer_lastname")
    public WebElement lastName1;

    @FindBy(id="email")
    public WebElement emailr;

    @FindBy(id="passwd")
    public WebElement passwordr;

    @FindBy(id="days")
    public WebElement days;

    @FindBy(id="months")
    public WebElement months;

    @FindBy(id="years")
    public WebElement years;

    @FindBy(id="newsletter")
    public WebElement newsletter;

    @FindBy(id="uniform-optin")
    public WebElement receive;

    @FindBy(id="firstname")
    public WebElement firstname;

    @FindBy(id="lastname")
    public WebElement lastname;

    @FindBy(id="company")
    public WebElement company;

    @FindBy(id="address1")
    public WebElement address1;

    @FindBy(id="address2")
    public WebElement address2;

    @FindBy(id="city")
    public WebElement city;

    @FindBy(id="id_state")
    public WebElement state;

    @FindBy(id="postcode")
    public WebElement zip;

    @FindBy(id="id_country")
    public WebElement country;

    @FindBy(id="other")
    public WebElement other;

    @FindBy(id="phone")
    public WebElement hphone;


    @FindBy(id="phone_mobile")
    public WebElement mphone;

    @FindBy(id="alias")
    public WebElement assign;

    @FindBy(id="submitAccount")
    public WebElement registerButton;

    @FindBy(id="SubmitLogin")
    public WebElement signIn;

    @FindBy(xpath="//*[@id=\"center_column\"]/div[1]/p")
    public WebElement invalidMessage;

 @FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[3]")
 public WebElement myaddresses;

 @FindBy(xpath="//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[1]")
 public WebElement update;

 @FindBy(id="submitAddress")
 public WebElement save;

 @FindBy(xpath="//*[@id=\"center_column\"]/div[1]/div/div/ul/li[4]/span[1]")
 public WebElement addresstext;










}
