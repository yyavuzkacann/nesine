package Pages;

import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.By;

import static Pages.DriverManager.driver;
import static io.restassured.RestAssured.given;

public class MainMethods {
    public Response response;

    public void callService(String serviceUrl) {
        response = given()
                .when()
                .get(serviceUrl);
    }

    public String readParameterFromResponse(String parameter) {
        return response.then().extract().path(parameter);
    }

    public void sendKeys(By element, String key) {
        driver.findElement(element).sendKeys(key);
    }

    public void clickElement(By element) {
        driver.findElement(element).click();
    }

    public void checkPageIsCorrect(String expectedURL) {
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
    }

    public String readValue(By element) {
        return driver.findElement(element).getText();
    }

    public void compareParameters(String expected, String actual) {
        Assert.assertEquals("Servisten dönen değer ile ekrandaki değer eşit değil!!"
                , expected, actual);
    }
}
