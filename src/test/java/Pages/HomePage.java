package Pages;

import org.openqa.selenium.By;

public class HomePage {
    public static By usernameInput = By.xpath("//input[@data-test-id='header-username-input']");
    public static By passwordInput = By.xpath("//input[@data-test-id='header-password-input']");
    public static By loginButton = By.xpath("//button[@data-test-id='header-login-btn']");
    public static By popularCoupons = By.xpath("//span[text()='Popüler Kuponlar']");
}
