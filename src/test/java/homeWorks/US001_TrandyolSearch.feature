
  Feature:Google and Trendyol Search

    Scenario:TC01 Kullanici trandyolda makas aratir
      Given    Google'a gidiniz
        Then trendyol'u aratınız
             Then trendyol linkini bulup siteye gidiniz
            And makas aratınız
             And  toplam ürün sayısını alınız
             And  yeni sekmede morhipo'ya gidiniz
             And  makas aratınız morhipo
             And  toplam ürün sayısını alınız morhipo
             And  iki sitedeki topla makas sayısını karşılaştırınız
             And  Önce ürün sayısı fazla olan siteyi kapatınız
             And  Sonra diğer sayfayıda kapatınız