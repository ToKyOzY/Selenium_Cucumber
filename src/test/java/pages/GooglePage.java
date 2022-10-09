package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {
    public GooglePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@class='gLFyf gsfi']")
    public WebElement searchBox;

    @FindBy (xpath = "//*[@class='LC20lb MBeuO DKV0Md'][1]")
    public WebElement trendyolClick;



}
