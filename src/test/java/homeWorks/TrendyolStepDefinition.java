package homeWorks;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import pages.GooglePage;
import pages.TrendyolPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TrendyolStepDefinition {
    GooglePage googlePage=new GooglePage();
    TrendyolPage trendyolPage=new TrendyolPage();
    Actions action=new Actions(Driver.getDriver());

    String trendyolWindow;
    String morhipoWindow;
    int sayi;
    int sayi2;
    @Given("Google'a gidiniz")
    public void googleAGidiniz() {
        Driver.getDriver().get("https://www.google.com.tr/");
    }

    @Then("trendyol'u aratınız")
    public void trendyolUAratiniz() {
        googlePage.searchBox.sendKeys("trendyol", Keys.ENTER);

    }

    @Then("trendyol linkini bulup siteye gidiniz")
    public void trendyolLinkiniBulupSiteyeGidiniz() {
        WebElement clickList= googlePage.trendyolClick;
        action.moveToElement(clickList).perform();
        googlePage.trendyolClick.click();
       trendyolWindow= Driver.getDriver().getWindowHandle();


    }

    @And("makas aratınız")
    public void makasAratiniz() {
        trendyolPage.searchBox.sendKeys("makas",Keys.ENTER);
        ReusableMethods.waitFor(2);
    }

    @And("toplam ürün sayısını alınız")
    public void toplamUrunSayisiniAliniz() {
        System.out.println(trendyolPage.resultSearch.getText());
        String trendyolPag=trendyolPage.resultSearch.getText();
        String[] result=trendyolPag.split(" ");
        System.out.println(result[3]);
         sayi= Integer.parseInt(result[3]);
    }

    @And("yeni sekmede morhipo'ya gidiniz")
    public void yeniSekmedeMorhipoYaGidiniz() {
        //ReusableMethods.switchToWindow("New Window");
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get("https://www.morhipo.com");
        morhipoWindow=Driver.getDriver().getWindowHandle();


    }

    @And("iki sitedeki topla makas sayısını karşılaştırınız")
    public void ikiSitedekiToplaMakasSayisiniKarsilastiriniz() {
        if (sayi>sayi2) {
            System.out.println("Trendyol sonucu daha fzla : "+sayi);
        }else
            System.out.println("Morhipo sonucu daha fazla : "+sayi2);


    }

    @And("Önce ürün sayısı fazla olan siteyi kapatınız")
    public void onceUrunSayisiFazlaOlanSiteyiKapatiniz() {
        if (sayi>sayi2){
            Driver.getDriver().switchTo().window(trendyolWindow);
            Driver.closeDriver();
        }else
            Driver.getDriver().switchTo().window(morhipoWindow);
        Driver.closeDriver();


    }

    @And("Sonra diğer sayfayıda kapatınız")
    public void sonraDigerSayfayidaKapatiniz() {

        Driver.closeDriver();

    }

    @And("makas aratınız morhipo")
    public void makasAratınızMorhipo() {
        trendyolPage.morhipoSearch.sendKeys("makas",Keys.ENTER);
    }

    @And("toplam ürün sayısını alınız morhipo")
    public void toplamÜrünSayısınıAlınızMorhipo() {
        System.out.println(trendyolPage.morhipoSearchResult.getText());
        String morhipo=trendyolPage.morhipoSearchResult.getText();
        String[] result1=morhipo.split(" ");
        System.out.println(result1[0]);
        sayi2= Integer.parseInt(result1[0]);
    }
}
