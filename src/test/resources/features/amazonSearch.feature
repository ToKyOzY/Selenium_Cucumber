Feature: Amazon Search

  Scenario: TC01 Kullanıcı amazonda nutella aratır

   Given Kullanici amazon sayfasina gider
    Then Kullanici Nutella icin arama yapar
    And Sonuclarin nutella icerdigini test eder
    And Sayfayi kapatir

