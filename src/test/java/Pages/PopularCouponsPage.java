package Pages;

import org.openqa.selenium.By;

public class PopularCouponsPage {
    public static By hemenOynaButton = By.xpath("(//button[text()='Hemen Oyna'])[1]");
    public static By tumuButton = By.xpath("//button[text()='Tümü']");
    public static By macAdedi = By.xpath("(//span[text()='Maç'])[1]/parent::div//b");
    public static By toplamOran = By.xpath("(//span[text()='Oran'])[1]/parent::div//b");
}
