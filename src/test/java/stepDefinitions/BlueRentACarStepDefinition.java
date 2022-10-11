package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BlueRantaCarPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRentACarStepDefinition {
    BlueRantaCarPage blueRantaCarPage=new BlueRantaCarPage();
    Actions action= new Actions(Driver.getDriver());
    Faker faker=new Faker();

    @Given("kullanici {string} ana sayfasinda")
    public void kullaniciAnaSayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        blueRantaCarPage.login.click();

    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        blueRantaCarPage.email.sendKeys("gecersiz@gmail.com");

    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        action.sendKeys(Keys.TAB).sendKeys(faker.internet().password()).perform();
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(blueRantaCarPage.ikinciLogin.isDisplayed());
    }

    @And("kulllanici sayfayi kapatir")
    public void kulllaniciSayfayiKapatir() {
        Driver.closeDriver();
    }


}
