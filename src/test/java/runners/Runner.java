package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@practiceClick", //2 tagi ayni anda çalistirmak istersek "@gp1 or @gp2" gibi..
        dryRun = true

        /*
        Runner class: Cucumber ın olmazsa olmazlarındandır.
Runwith olmazsa olmazdır
CucumberOptions: Junitten geliyor, testlerimizi bu anatotion ile resources-feature da bulunan
Glue kısmı  ile birbirine yapıştırıyoruz, yani feauture fileım ile stepDefinition umu
birbirine yapıştırıyorum
Daha sonra tag kısmında feature içinde olusturdugum isimlendirme  kısmını burada çağırıyorum.
dryRun(prova anlamında)= true ile calıstırdığımızda  eksik stepDefinitionları bulmak için kullanıyoruz,
browser ı açmadan toolumuza getirir.
 =false: varsayılan olarak false gelir. Browser calısır.
 Normal test case lerimizi koşacağımız zaman kullanıyoruz
         */


)

public class Runner {
    /*
    Runner class'i testng'deki xml mantigi ile calisir.
    Calistirmak istedigimiz senaryolara tag belirtiriz ve belirttigimiz tag'lari calistirir.
    XML'deki gibi istedigmiz testleri calistirmak icin kullaniriz.
    Runner class body'si bostur ve runner class'ini ekleyecegimiz notasyonlar active eder.
    Bu class'da kullanacagimiz 2 adet notasyon vardir.
    1.@RunWith(Cucumber.class) notasyonu Runner class'ina calisma özelligi ekler.
    bu notasyon oldugu icin Cucumber Framework'umuzde Junit kullanmayi tercih ederiz
    2. @CucumberOptions notasyonu içinde features : runner dosyasinin feature dosyasina nereden alacagini
    tarif eder.
    glue : stepDefinitions yolunu belirtiriz
    tags : hangi tag'i calistirmak istiyorsak onu belli eder

    dryRun : iki secenek vardir
    dryRun=true dersek testimizi calistirmadan eksik adimlari bize verir
    dryRun=false dersek testlerimizi river ile calistirir

     */
}
