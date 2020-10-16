package stepDefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.StorPLoginPage;
import utilities.BrowserUtils;
import utilities.Configuration;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class StoreRegisterAndSigIn {


    StorPLoginPage login=new StorPLoginPage();

    @Given("^launch web browser$")
    public void launch_web_browser() throws Throwable {
        Driver.driver.get(Configuration.getProperties("browserUrl"));
    }

    @Then("^create and account$")
    public void create_and_account(DataTable dataTable) throws Throwable {
        List<Map<String,Object>> list=dataTable.asMaps(String.class,Object.class);


        login.getEmail.sendKeys(list.get(0).get("email").toString());
        Thread.sleep(1000);
        login.submitcreate.click();
        Thread.sleep(2000);
        login.mr.click();
        Thread.sleep(1000);
        login.firtName1.sendKeys(list.get(0).get("name").toString());
        Thread.sleep(1000);
        login.lastName1.sendKeys(list.get(0).get("lastname").toString());
        Thread.sleep(1000);
        login.passwordr.sendKeys(list.get(0).get("password").toString());
        Thread.sleep(1000);
        BrowserUtils.selectMethod(login.days,list.get(0).get("day").toString());
        Thread.sleep(1000);
        BrowserUtils.selectMethod(login.months,list.get(0).get("month").toString());
        Thread.sleep(1000);
        BrowserUtils.selectMethod(login.years,list.get(0).get("year").toString());
        Thread.sleep(1000);
        login.newsletter.click();
        Thread.sleep(1000);
        login.receive.click();
        Thread.sleep(1000);
        login.firstname.clear();
        Thread.sleep(1000);
        login.firstname.sendKeys(list.get(0).get("name").toString());
        Thread.sleep(1000);
        login.lastname.clear();
        Thread.sleep(1000);
        login.lastname.sendKeys(list.get(0).get("lastname").toString());
        Thread.sleep(1000);
        login.company.sendKeys(list.get(0).get("company").toString());
        Thread.sleep(1000);
        login.address1.sendKeys(list.get(0).get("adres").toString());
        Thread.sleep(1000);
        login.address2.sendKeys(list.get(0).get("adres2").toString());
        Thread.sleep(1000);
        login.city.sendKeys(list.get(0).get("city").toString());
        Thread.sleep(1000);
        BrowserUtils.selectMethod(login.state,list.get(0).get("state").toString());
        Thread.sleep(1000);
        login.zip.sendKeys(list.get(0).get("zip").toString());
        Thread.sleep(1000);
        login.other.sendKeys(list.get(0).get("info").toString());
        Thread.sleep(1000);
        login.hphone.sendKeys(list.get(0).get("hphone").toString());
        Thread.sleep(1000);
        login.mphone.sendKeys(list.get(0).get("cphone").toString());
        Thread.sleep(1000);
        login.assign.clear();
        login.assign.sendKeys(list.get(0).get("assign").toString());
        Thread.sleep(1000);
        login.registerButton.click();
    }
    @Then("^verify it is created$")
    public void verify_it_is_created() throws Throwable {
        String expected="My account - My Store";
        String actual =Driver.driver.getTitle();
        Assert.assertEquals(expected,actual);
    }

    @Then("^sign in with valid username\"([^\"]*)\" passworrd\"([^\"]*)\"$")
    public void sign_in_with_valid_username_passworrd(String username, String password) throws Throwable {
        Thread.sleep(1000);
     login.emailr.sendKeys (username);
        Thread.sleep(1000);
     login.passwordr.sendKeys (password);
        Thread.sleep(1000);
     login.signIn.click ();
        Thread.sleep(1000);

    }

    @Then("^verify sign in page$")
    public void verify_sign_in_page() throws Throwable {
        String expected="My account - My Store";
        String actual =Driver.driver.getTitle();
        Assert.assertEquals(expected,actual);

    }

    @Then("^sign in with ivalid username\"([^\"]*)\" passworrd\"([^\"]*)\"$")
    public void sign_in_with_ivalid_username_passworrd(String username, String password) throws Throwable {
        Thread.sleep(1000);
        login.emailr.sendKeys (username);
        Thread.sleep(1000);
        login.passwordr.sendKeys (password);
        Thread.sleep(1000);
        login.signIn.click ();
        Thread.sleep(1000);
    }

    @Then("^verify it is not sign in\\.$")
    public void verify_it_is_not_sign_in() throws Throwable {
        String expected="There is 1 error";
        String actual =login.invalidMessage.getText ();
        Assert.assertEquals(expected,actual);

    }


}
