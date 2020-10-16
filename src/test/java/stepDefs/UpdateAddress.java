package stepDefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.StorPLoginPage;
import utilities.BrowserUtils;

import java.util.List;
import java.util.Map;

public class UpdateAddress {
    StorPLoginPage login=new StorPLoginPage();
    @Then("^update your address$")
    public void update_your_address(DataTable dataTable) throws Throwable {
        List<Map<String,Object>> list=dataTable.asMaps(String.class,Object.class);
        login.myaddresses.click ();
        Thread.sleep(1000);
        login.update.click ();
        Thread.sleep(1000);
        login.address1.clear ();
        Thread.sleep(1000);
        login.address1.sendKeys(list.get(0).get("adres").toString());
        Thread.sleep(1000);
        login.address2.clear ();
        Thread.sleep(1000);
        login.address2.sendKeys(list.get(0).get("adres2").toString());
        Thread.sleep(1000);
        login.city.clear ();
        Thread.sleep(1000);
        login.city.sendKeys(list.get(0).get("city").toString());
        Thread.sleep(1000);
        login.save.click ();
        Thread.sleep(5000);

    }

    @Then("^verify it is updated$")
    public void verify_it_is_updated() throws Throwable {
      String expected="1225 basswood";
      String actual=login.addresstext.getText ();
        Assert.assertEquals (expected,actual);
    }


}
