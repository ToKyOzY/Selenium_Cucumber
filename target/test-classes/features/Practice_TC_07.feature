

@PracticeTC07

Feature: TC Verify Test Cases

  Scenario: TC_07_Test_Cases

 Given Tarayıcıyı başlatarak "http://automationexercise.com" url'sine gidin
 Then Ana sayfanın başarıyla görünür olduğunu doğrulayın
 And Test Case buttonu na tıklayın
 And Kullanıcının test case sayfasına başarıyla yönlendirildiğini doğrulayın
 And İlgili sayfanın ekran görüntüsünü alın

    #Given, giris kısmında, -verilen, gidilen vs  anlamında kullanılıyor,
    # Then assertion yani doğrulamalarda kullanıyoruz, and tekrarlayanlarda kullanılıyor.
    # When zaman anlamında givenden sonra bu -dığında, -dığı zaman anlamında.