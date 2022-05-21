package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
    @Given("User go to login page")
    public void user_go_to_login_page() {
        System.out.println("User go to login page _ Test pull request 10:20");
    }
    @When("User enter valid information")
    public void user_enter_valid_information() {
        System.out.println("User enter valid information _ Test pull request 10:20");
    }
    @When("User click to submit")
    public void user_click_to_submit() {
        System.out.println("User click to submit _ Test pull request 10:20");
    }
    @Then("User should be logged in to web successfully")
    public void user_should_be_logged_in_to_web_successfully() {
        System.out.println("User should be logged in to web successfully");
    }

    @When("User enter invalid information")
    public void user_enter_invalid_information() {
        System.out.println("User enter invalid information");
    }
    @Then("User can not log in to web successfully")
    public void user_can_not_log_in_to_web_successfully() {
        System.out.println("User can not log in to web successfully");
    }
    @Given("User go to homepage")
    public void user_go_to_homepage() {
        System.out.println("User go to homepage");
    }
    @When("User click to buy button to add product to cart")
    public void user_click_to_buy_button_to_add_product_to_cart() {
        System.out.println("User click to buy button to add product to cart");
    }
    @Then("User can add product to cart successfully")
    public void user_can_add_product_to_cart_successfully() {
        System.out.println("User can add product to cart successfully");
    }
    @When("User go to cart page")
    public void user_go_to_cart_page() {
        System.out.println("User go to cart page");
    }
    @When("User click to payment")
    public void user_click_to_payment() {
        System.out.println("User click to payment");
    }
    @When("User add address")
    public void user_add_address() {
        System.out.println("User add address");
    }
    @When("User checkout")
    public void user_checkout() {
        System.out.println("User checkout");
    }
}
