

  Feature: Parametre Kullanimi
    Scenario: Parametre kullaniminda ConfigReader Kullanimi
      Given kullanici "amazon_Url" sayfasina gider
      Then kullanici 3 saniye bekler
      When url'nin "amazon" icerdigini test edelim
      And Sayfayi kapatir

