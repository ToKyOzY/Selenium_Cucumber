
  Feature: US002 Tutorial
    Scenario: TC02 kullanici Phpnes a tiklamali
      Given http://tutorialsninja.com/demo/index.php?route=common/home sayfasina gidiniz
      Then Phones & PDAs'a tiklayiniz
      Then Telefonlarin markalarini aliniz
      And Tüm öğeleri sepete ekleyiniz
      And Sepete tıklayiniz
      And Sepetteki isimleri aliniz
      And Sepetteki ve sayfadaki ürünlerin doğru olduğunu karşilaştiriniz