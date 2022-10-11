

  Feature: US007 Scenario Outline kullanimi

    Scenario: TC01 ConfigReader ile Scenario Outline Kullanimi
      Given kullanici "face_Url" ana sayfasinda
      Then kullanici 3 saniye bekler
      When url'nin "facebook" icerdigini test edelim
      And Sayfayi kapatir
