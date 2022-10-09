
@Background

Feature: US001 Background Kullanimi

  Background: Ortak Adimlar
    Given Kullanici amazon sayfasina gider

  Scenario: TC01 Kullanici amazonda nutella aratir


    Then Kullanici Nutella icin arama yapar
    And Sonuclarin nutella icerdigini test eder

  Scenario: TC02 kullanici amazonda Selenium aratir


    Then kullanici selenium icin arama yapar
    And Sonuclarin selenium icerdigini test eder

  Scenario: TC03 Kullanici amazonda iphone aratir


    Then Kullanici iphone icin arama yapar
    And Sonuclarin iphone icerdigini test eder
    And Sayfayi kapatir