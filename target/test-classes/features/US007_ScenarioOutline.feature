
@all
  Feature: US007 Scenario Outline kullanimi

    Scenario Outline: TC01 ConfigReader ile Scenario Outline Kullanimi
      Given kullanici "<arananUrl>" ana sayfasinda
      Then kullanici 3 saniye bekler
      When url'nin "<arananKelime>" icerdigini test edelim
      And Sayfayi kapatir
      Examples:
        | arananUrl | arananKelime |
        | amazon_Url | amazon |
        | face_url| facebook |
        | google_Url | google |


