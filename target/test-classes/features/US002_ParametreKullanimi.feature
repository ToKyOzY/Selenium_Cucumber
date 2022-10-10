
@parametre

Feature: US002 Parametre kullanimi
  Background: Ortak adim
    Given Kullanici amazon sayfasina gider

  Scenario: TC01 Kullanici amazonda parametreli arama yapar

    Then Kullanici "Nutella" icin arama yapar
    And Sonuclarin "Nutella" icerdigini test eder
    And Sayfayi kapatir

  Scenario: TC02 Kullanici amazonda parametreli arama yapar

    Then Kullanici "java" icin arama yapar
    And Sonuclarin "java" icerdigini test eder
    And Sayfayi kapatir

  Scenario: TC03 Kullanici amazonda parametreli arama yapar

    Then Kullanici "selenium" icin arama yapar
    And Sonuclarin "selenium" icerdigini test eder
    And Sayfayi kapatir

  Scenario: TC04 Kullanici amazonda parametreli arama yapar

    Then Kullanici "SQL" icin arama yapar
    And Sonuclarin "SQL" icerdigini test eder
    And Sayfayi kapatir

    # Feaature dosyasinda parametreli arma yaptigimizda "" icine aldigimzi string degeri stepDefinition'da
  #Bir kere parametreli method olusturur ve yeni bir arama yapmak istedigimizde
  #Tekrar method olusurmadan feature dosyasindan "" icinde belirttigimiz