package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.lindaPage;
import utilities.Configuration;
import utilities.Driver;

public class lindaStep {

lindaPage linda=new lindaPage();





    @Given("^launc the webpge$")
    public void launc_the_webpge() throws Throwable {
        Driver.driver.get(Configuration.getProperties("lindaUrl"));



    }

    @Then("^input  Username \"([^\"]*)\"  Password\"([^\"]*)\" and login$")
    public void input_Username_Password_and_login(String username, String password) throws Throwable {
          linda.username.sendKeys(username);
          linda.password.sendKeys(password);
          linda.loginButton.click();
          Thread.sleep(2000);
    }

    @Then("^click the leave page$")
    public void click_the_leave_page() throws Throwable {

        linda.leave.click();

    }

    @Then("^click the date and calculate duration and v$")
    public void click_the_date_and_calculate_duration_and_v() throws Throwable {
       double expected=Double.parseDouble(linda.numberOfDays.getText());

        Thread.sleep(2000);
        linda.date.click();
        double sum=0;
       for(WebElement element:linda.hours){
           if(element.getText().length()==4){
            sum=sum+Double.parseDouble(element.getText());

           }}
        double actual=sum/8;

        System.out.println("expected : "+expected);
        System.out.println("actual   : "+actual);

        Assert.assertEquals(expected,actual,1);





    }
}
