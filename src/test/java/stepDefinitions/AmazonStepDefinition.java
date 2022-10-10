package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonPage=new AmazonPage();
    @Given("Kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_Url"));
    }

    @Then("Kullanici Nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {
      amazonPage.searchBox.sendKeys("nutella",Keys.ENTER);
    }

    @And("Sonuclarin nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
      Assert.assertTrue(amazonPage.resultSearch.getText().contains("nutella"));

    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici selenium icin arama yapar")
    public void kullaniciSeleniumIcinAramaYapar() {

        amazonPage.searchBox.sendKeys("selenium",Keys.ENTER);
    }

    @And("Sonuclarin selenium icerdigini test eder")
    public void sonuclarinSeleniumIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.resultSearch.getText().contains("selenium"));
    }

    @Then("Kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.searchBox.sendKeys("iphone",Keys.ENTER);
    }

    @And("Sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.resultSearch.getText().contains("iphone"));
    }

    @Then("Kullanici {string} icin arama  yapar")
    public void kullaniciIcinAramaYapar(String searchingword) {
        amazonPage.searchBox.sendKeys(searchingword,Keys.ENTER);
    }

    @And("Sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String searchingWord) {
        Assert.assertTrue(amazonPage.resultSearch.getText().contains(searchingWord));
    }


}
