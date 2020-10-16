package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class lindaPage {

    WebDriver driver;

    public lindaPage() {
        this.driver = Driver.driverSetup("chrome");
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@id='txtUsername']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='btnLogin']")
    public WebElement loginButton;

    @FindBy(xpath = "//b[contains(text(),'Leave')]")
    public WebElement leave;

    @FindBy(xpath = "//td[contains(text(),'10.00')]")
    public WebElement numberOfDays;

    @FindBy(xpath = "//a[contains(text(),'Mon, 19 Oct 2015 to Fri, 30 Oct 2015')]")
    public WebElement date;

    @FindBy(xpath = "//*[@class=\"table hover\"]//tr//td[4]")
    public List<WebElement> hours;




}
