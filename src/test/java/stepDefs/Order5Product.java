package stepDefs;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.Order5;
import utilities.BrowserUtils;
import utilities.Driver;

public class Order5Product {
Order5 order=new Order5();

    @Then("^navigate to main page$")
    public void navigate_to_main_page() throws Throwable {
       order.home.click ();
    }

    @Then("^add to cart (\\d+) orders$")
    public void add_to_cart_orders(int arg1) throws Throwable {
        Thread.sleep (1000);
        BrowserUtils.hover (order.order1, Driver.driver);
        Thread.sleep (1000);
        order.addtocard.click ();
        Thread.sleep (1000);
        order.continueshopping.click ();
        Thread.sleep (3000);
        BrowserUtils.hover (order.order2, Driver.driver);
        Thread.sleep (1000);
        order.addtocard2.click ();
        Thread.sleep (1000);
        order.continueshopping.click ();
        Thread.sleep (3000);
        BrowserUtils.hover (order.order3, Driver.driver);
        Thread.sleep (1000);
        order.addtocard3.click ();
        Thread.sleep (1000);
        order.continueshopping.click ();
        Thread.sleep (3000);
        BrowserUtils.hover (order.order4, Driver.driver);
        Thread.sleep (1000);
        order.addtocard4.click ();
        Thread.sleep (1000);
        order.continueshopping.click ();
        Thread.sleep (3000);
        BrowserUtils.hover (order.order5, Driver.driver);
        Thread.sleep (1000);
        order.addtocard5.click ();
        Thread.sleep (1000);
        order.Proceedtocheckout.click ();
        Thread.sleep (1000);


    }

    @Then("^verify total price$")
    public void verify_total_price() throws Throwable {
        String expected="$151.48";
        String actual=order.totalPrice.getText ();
        Assert.assertEquals (expected,actual);

    }

}
