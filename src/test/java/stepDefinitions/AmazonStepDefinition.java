package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.Driver;

public class AmazonStepDefinition {
    @Given("Kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get("https://www.amazon.com");
    }

    @Then("Kullanici Nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("nutella", Keys.ENTER);
    }

    @And("Sonuclarin nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {

    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
    }
}
