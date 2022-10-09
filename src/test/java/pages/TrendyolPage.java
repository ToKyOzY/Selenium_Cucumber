package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrendyolPage {
    public TrendyolPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@class='vQI670rJ']")
    public WebElement searchBox;

    @FindBy (xpath = "//*[@class='dscrptn']")
    public WebElement resultSearch;

    @FindBy (xpath = "//*[@id='pw-search-input']")
    public WebElement morhipoSearch;

    @FindBy (xpath = "//*[@id='total-product-count']")
    public WebElement morhipoSearchResult;



}
