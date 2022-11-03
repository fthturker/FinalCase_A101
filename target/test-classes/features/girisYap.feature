@tumu
Feature: Hepsi Burada alisveris yapma

  @GirisYap
  Scenario Outline: Login sayfasindan giris yaparak sepete urun eklenir
    Given kullanici hepsiburada adresine gider
    And kullanici cerezi kabul eder
    And kullanici girisyap butonunu uzerine gelir
    And kullanici giris yap butonu tiklar
    And kullanici "<email>" adresini girer
    And kullanici girisyap butonu tiklar
    And kullanici "<sifre>" girer
    And kullanici submit butonu tiklar
    And kullanici anasayfada Hesabım yazisini gorur
    When kullanici telefon aramasi yapar
    And kullanici iki urunu tiklar
    And kullanici urunleri sepete ekle tiklar
    And kullanici dogru eklendigini dogrular
    And kullanici siparislerim tiklar
    And kullanici cikis yap tiklar
    And kullanici sayfayi kapatir


    Examples:
      | email                 | sifre        |
      | fthturker80@gmail.com | Fthturker80@ |

  @GirissizYap
  Scenario: Login sayfasindan girissiz sepete urun eklenir
    Given kullanici hepsiburada adresine gider
    And kullanici cerezi kabul eder
    When kullanici telefon aramasi yapar
    And kullanici iki urunu tiklar
    And kullanici urunleri sepete ekle tiklar
    And kullanici dogru eklendigini dogrular
    And kullanici sayfayi kapatir