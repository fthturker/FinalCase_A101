package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import page.GirisYap;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Log;

import java.util.ArrayList;
import java.util.List;

public class GirisYapStepdefinitions {
    GirisYap girisYap = new GirisYap();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici hepsiburada adresine gider")
    public void kullanici_hepsiburada_adresine_gider() {
        Log.startTestCase("");
        Driver.getDriver().get(ConfigReader.getProperty("hepsiBuradaUrl"));
        Driver.wait(1);

        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("hepsiburada"));

        Log.info("kullanici hepsi burada adresine gitti");
        Log.info("kullanici siteye gittigini gorur");
    }

    @Given("kullanici cerezi kabul eder")
    public void kullanici_cerezi_kabul_eder() {
        Driver.waitAndClick(girisYap.cerezKabulEt, 1);
        Driver.wait(1);
        Log.info("kullanici cerezi kabul eti");
    }

    @Given("kullanici girisyap butonunu uzerine gelir")
    public void kullanici_girisyap_butonunu_uzerine_gelir() {
        actions.moveToElement(girisYap.girisYapDrop).perform();
        Driver.wait(1);
        Log.info("kullanici giris yap butonunun uzerine geldi");
    }

    @And("kullanici giris yap butonu tiklar")
    public void kullaniciGirisYapButonuTiklar() {
        Driver.waitAndClick(girisYap.girisYapButonu, 1);
        Driver.wait(1);
        Log.info("kullanici giris yap butonuna tikladi");
    }

    @And("kullanici {string} adresini girer")
    public void kullaniciAdresiniGirer(String email) {
        Driver.waitAndSendText(girisYap.email, email);
        Driver.wait(1);
        Log.info("kullanici email adresini girdi");
    }

    @And("kullanici girisyap butonu tiklar")
    public void kullaniciGirisyapButonuTiklar() {
        Driver.waitAndClick(girisYap.girisButonu, 1);
        Driver.wait(1);
        Log.info("kullanici giris yap butonunu tikladi");
    }

    @And("kullanici {string} girer")
    public void kullaniciGirer(String sifre) {
        Driver.waitAndSendText(girisYap.sifre, sifre);
        Driver.wait(1);
        Log.info("kullanici sifresini girdi");
    }

    @And("kullanici submit butonu tiklar")
    public void kullaniciSubmitButonuTiklar() {
        Driver.waitAndClick(girisYap.submitButon, 2);
        Driver.wait(1);
        Log.info("kullanici giris butonunu tikladi");
    }

    @And("kullanici anasayfada Hesabım yazisini gorur")
    public void kullaniciAnasayfadaHesabımYazisiniGorur() {
        girisYap.hesabimText.isDisplayed();
        Driver.wait(1);
        Log.info("kullanici anasayfa da Hesabim yazisini gordu");
    }

    @When("kullanici telefon aramasi yapar")
    public void kullaniciTelefonAramasiYapar() {
        actions.
                click(girisYap.search).
                sendKeys("telefon", Keys.ENTER).
                perform();
        Log.info("kullanici telefon aramasi yapar");
    }

    @When("kullanici iki urunu tiklar")
    public void kullaniciIkiUrunuTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).
                moveToElement(girisYap.ilkUrunTelefonClick).click().perform();
        Driver.wait(2);
        Log.info("kullanici ilk urune tikladi");
    }

    @And("kullanici urunleri sepete ekle tiklar")
    public void kullaniciUrunleriSepeteEkleTiklar() {
        List<String> tabs = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(tabs.get(1));
        Driver.wait(2);
        Driver.waitAndClick(girisYap.sepeteEkleButon, 2);
        Log.info("kullanici ilk urunu sepete ekledi");
        Driver.wait(2);
        Driver.getDriver().switchTo().window(tabs.get(0)); // ilk sayfaya donuyor

        // 2. urun islemleri
        Driver.wait(2);
        Driver.waitAndClick(girisYap.ikinciUrunTelefonClick, 1);
        Log.info("kullanici ikinci urune tikladi");
        Driver.wait(1);
        List<String> tabs2 = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(tabs2.get(2));
        Driver.wait(1);
        Driver.waitAndClick(girisYap.sepeteEkleButon2, 2);
        Log.info("kullanici ikinci urunu sepete ekledi");

        Driver.getDriver().switchTo().window(tabs.get(0)); // ilk sayfaya donuyor
        Driver.waitAndClick(girisYap.sepetimButonu, 2);
        Driver.wait(1);
        Log.info("kullanici urunleri sepetim tikladi");
    }

    @And("kullanici dogru eklendigini dogrular")
    public void kullaniciDogruEklendiginiDogrular() {
        //girisYap.birinciUrunText.isDisplayed();
        //Driver.wait(2);
        girisYap.sepetimText.isDisplayed();
        Driver.wait(2);
        Log.info("kullanici urunun dogru eklendigini gordu");
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.wait(2);
        Driver.closeDriver();
        Log.info("kullanici sayfayi kapatti");
        Log.endTestCase("");
    }

    @And("kullanici siparislerim tiklar")
    public void kullaniciSiparislerimTiklar() {
        Driver.waitAndClick(girisYap.siparislerim, 2);
        Driver.wait(2);
        Log.info("kullanici siparislerimi tikladi");
    }

    @And("kullanici cikis yap tiklar")
    public void kullaniciCikisYapTiklar() {
        Driver.waitAndClick(girisYap.cikisYap, 2);
        Driver.wait(2);
        Log.info("kullanici cikis yapti");
    }
}
