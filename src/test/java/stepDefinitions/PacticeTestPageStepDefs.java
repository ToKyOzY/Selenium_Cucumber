package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.PracticeTestPage;
import utilities.Driver;

public class PacticeTestPageStepDefs {
    PracticeTestPage practiceTestPage=new PracticeTestPage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("{string} adresine gidin")
    public void adresineGidin(String url) {
        Driver.getDriver().get(url);
    }

    @And("{int} defa click me ye tiklayin")
    public void defaClickMeYeTiklayin(int int1) {
        for (int i = 0; i <int1 ; i++) {
            practiceTestPage.clickButton.click();

        }
    }

    @And("{int} defa Space dugmesine basin")
    public void defaSpaceDugmesineBasin(int int1) {
        for (int i = 0; i <int1 ; i++) {
            actions.sendKeys(Keys.SPACE).perform();
        }
    }

    @And("Down yazisindaki iki basamakli sayilarin hepsini toplayin")
    public void downYazisindakiIkiBasamakliSayilarinHepsiniToplayin() {

    }

    @And("Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin")
    public void tumClickMetinlerininUzunlugununToplaminiOncekiToplamdanCikarin() {
    }

    @Then("sonucun {int} oldugunu dogrulayin")
    public void sonucunOldugunuDogrulayin(int arg0) {
    }
}
