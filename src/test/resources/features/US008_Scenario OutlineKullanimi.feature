

Feature: US008 Scenario Outline Kullanimi

  Scenario Outline: : TC11 kullanici gecersiz bilgilerle giris yapar
    Given kullanici "blrcr_Url" ana sayfasinda
    Then Login yazisina tiklar
    And "<gecersizEmail>" username girer
    And "<gecersizPass>" password girer
    And brc Login butonuna basar
    Then brc sayfasina giris yapilamadigini kontrol eder
    And kullanici 3 saniye bekler
    And  Sayfayi kapatir

    Examples: :
  | gecersizEmail   | gecersizPass |
  |a@gmail.com      |    12346|
  |b@gmail.com      |    13246|
  |c@gmail.com      |    78974|
  |d@gmail.com      |    78564|
  |e@gmail.com      |    41454|