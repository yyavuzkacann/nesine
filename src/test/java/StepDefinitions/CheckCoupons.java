package StepDefinitions;

import Pages.MainMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Pages.HomePage.*;
import static Pages.PopularCouponsPage.*;

public class CheckCoupons {
    MainMethods mainMethods = new MainMethods();

    String username;
    String password;
    String mac;
    String oran;

    @Given("get credentials from service")
    public void get_credentials_from_service() {
        mainMethods.callService("http://localhost:3000/getCredentials");
        username = mainMethods.readParameterFromResponse("data.username");
        password = mainMethods.readParameterFromResponse("data.password");
    }

    @When("login")
    public void login() {
        mainMethods.sendKeys(usernameInput, username);
        mainMethods.sendKeys(passwordInput, password);
        mainMethods.clickElement(loginButton);
    }

    @When("go to popular coupons page")
    public void go_to_popular_coupons_page() {
        mainMethods.clickElement(popularCoupons);
    }

    @Then("check page url")
    public void check_page_url() {
        mainMethods.checkPageIsCorrect("https://www.nesine.com/iddaa/populer-kuponlar");
        mainMethods.clickElement(hemenOynaButton);
        mainMethods.clickElement(tumuButton);
    }

    @When("read coupons from service")
    public void read_coupons_from_service() {
        mainMethods.callService("https://pc.nesine.com/v1/PopularCoupons?eventCount=0");
        mac = mainMethods.readParameterFromResponse("d[0].eventCount");
        oran = mainMethods.readParameterFromResponse("d[0].totalOdd");
    }

    @Then("assert the numbers")
    public void assert_the_numbers() {
        mainMethods.compareParameters(mainMethods.readValue(macAdedi), mac);
        mainMethods.compareParameters(mainMethods.readValue(toplamOran), oran);
    }
}