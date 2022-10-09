
@All
Feature: Amazon Search
 @gp1
  Scenario: TC01 Kullanıcı amazonda nutella aratır

   Given Kullanici amazon sayfasina gider
    Then Kullanici Nutella icin arama yapar
    And Sonuclarin nutella icerdigini test eder
    And Sayfayi kapatir
@gp3
    Scenario: TC02 kullanici amazonda Selenium aratir

      Given Kullanici amazon sayfasina gider
      Then kullanici selenium icin arama yapar
      And Sonuclarin selenium icerdigini test eder
      And Sayfayi kapatir
@gp2
  Scenario: TC03 Kullanıcı amazonda iphone aratır

    Given Kullanici amazon sayfasina gider
    Then Kullanici iphone icin arama yapar
    And Sonuclarin iphone icerdigini test eder
    And Sayfayi kapatir

