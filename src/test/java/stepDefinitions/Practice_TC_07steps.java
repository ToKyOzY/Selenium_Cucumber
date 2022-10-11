package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Driver;

public class Practice_TC_07steps {

    @Given("Tarayıcıyı başlatarak {string} url'sine gidin")
    public void tarayıcıyıBaşlatarakUrlSineGidin(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }

    @And("Test Case buttonu na tıklayın")
    public void testCaseButtonuNaTıklayın() {
    }

    @Then("Ana sayfanın başarıyla görünür olduğunu doğrulayın")
    public void anaSayfanınBaşarıylaGörünürOlduğunuDoğrulayın() {
    }

    @And("Kullanıcının test case sayfasına başarıyla yönlendirildiğini doğrulayın")
    public void kullanıcınınTestCaseSayfasınaBaşarıylaYönlendirildiğiniDoğrulayın() {
    }

    @And("İlgili sayfanın ekran görüntüsünü alın")
    public void i̇lgiliSayfanınEkranGörüntüsünüAlın() {
    }
}
