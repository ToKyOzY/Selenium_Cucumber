Feature: US002 Parametre kullanimi
  @parametre
  Scenario: TC01 Kullanici amazonda parametreli arama yapar
    Given Kullanici amazon sayfasina gider
    Then Kullanici "selenium" icin arama  yapar
    And Sonuclarin "selenium" icerdigini test eder
    And Sayfayi kapatir


