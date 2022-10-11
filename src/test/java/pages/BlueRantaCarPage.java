package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRantaCarPage {

    public BlueRantaCarPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement login;

    @FindBy (xpath = "//*[@id='formBasicEmail']")
    public WebElement email;

    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement ikinciLogin;

}