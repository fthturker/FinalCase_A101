![Ekran görüntüsü 2022-11-03 215350](https://user-images.githubusercontent.com/98288587/199809871-319dd0da-69d9-4909-b4a6-db6390c3da03.png)

Hepsiburada.com Test Automation Cases
Hepsiburada.com sistemine Selenium altyapısını kullanarak Java programlama dilinde yazılmıştır.
webdriver ile login, arama, sepete ekleme gibi fonksiyonların testlerinin otomasyonunun sağlandı


Test senaryoları, burada bulunan özellik dosyalarında Gherkin formatında açıklanmıştır ./src\test\resources\features

Installation
[Java 8 JDK] sahibi olmanız gerekir

Testleri Chrome ile olarak çalıştırmak
Tüm bağımlılıkları yüklemek için derleyin

testler nasıl çalıştırılır
Test senaryolarını çalıştırmak için CTRL+F10 tuşlarına basın veya Execute Gradle Task Testlerine "gradle cucumber" komutunu yazın Chrome'da çalışacaktır. Steps Java Class'ta OpenBrowser fonksiyonuna istediğiniz tarayıcının tanımını ekleyerek testleri farklı tarayıcılarda çalıştırabilirsiniz.

Dependencies
-selenium
-webdrivermanager
-cucumber

Senaryo1
    kullanici hepsiburada adresine gider
    kullanici cerezi kabul eder
    kullanici girisyap butonunu uzerine gelir
    kullanici giris yap butonu tiklar
    kullanici "<email>" adresini girer
    kullanici girisyap butonu tiklar
    kullanici "<sifre>" girer
    kullanici submit butonu tiklar
    kullanici anasayfada Hesabım yazisini gorur
    kullanici telefon aramasi yapar
    kullanici iki urunu tiklar
    kullanici urunleri sepete ekle tiklar
    kullanici dogru eklendigini dogrular
    kullanici siparislerim tiklar
    kullanici cikis yap tiklar
    kullanici sayfayi kapatir

 Senaryo2
    kullanici hepsiburada adresine gider
    kullanici cerezi kabul eder
    kullanici telefon aramasi yapar
    kullanici iki urunu tiklar
    kullanici urunleri sepete ekle tiklar
    kullanici dogru eklendigini dogrular
    kullanici sayfayi kapatir


