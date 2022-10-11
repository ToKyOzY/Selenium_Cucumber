Feature: US006 kullanici amazonda istedigi kelimeleri aratir

  Scenario Outline: TC01 Kullanici istedigi kelimeleri aratir

    Given kullanici "amazon_Url" ana sayfasinda
    Then Kullanici "<istenenKelime>" icin arama yapar
    And Sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And Sayfayi kapatir
    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | nutella       | nutella              |
      | selenium      | selenium             |
      | sql           | sql                  |


