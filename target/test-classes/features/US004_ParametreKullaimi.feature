
  Feature: US004 parametre kullanimi

    Scenario: TC01 Parametre kullanimi
      Given kullanici "trendyol_url" ana sayfasinda
      Then kullanici 3 saniye bekler
      When url'nin "trend" icerdigini test edelim
      And Sayfayi kapatir
