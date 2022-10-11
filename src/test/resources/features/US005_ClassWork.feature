Feature:  US1009 Ck Hotels Login

  Scenario: TC11 kullanici gecerli bilgilerle giris yapar
    Given kullanici "blrcr_Url" ana sayfasinda
    Then Login yazisina tiklar
    And kullanici 2 saniye bekler
    And gecersiz username girer
    And gecersiz password girer
    And kullanici 2 saniye bekler
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And kullanici 2 saniye bekler
    And kulllanici sayfayi kapatir
