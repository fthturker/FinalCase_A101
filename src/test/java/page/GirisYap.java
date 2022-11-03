package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GirisYap {
    public GirisYap() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cerezKabulEt;

    @FindBy(xpath = "(//span[@class='sf-OldMyAccount-d0xCHLV38UCH5cD9mOXq'])[1]")
    public WebElement girisYapDrop;

    @FindBy(linkText = "Giriş Yap")
    public WebElement girisYapButonu;

    @FindBy(id = "txtUserName")
    public WebElement email;

    @FindBy(id = "btnLogin")
    public WebElement girisButonu;

    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement sifre;

    @FindBy(xpath = "//button[@id='btnEmailSelect']")
    public WebElement submitButon;

    @FindBy(xpath = "//span[@class='sf-OldMyAccount-d0xCHLV38UCH5cD9mOXq']")
    public WebElement hesabimText;

    @FindBy(xpath = "(//input[@class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b'])[1]")
    public WebElement search;

    @FindBy(xpath = "(//li[@id='i0'])[1]")
    public WebElement ilkUrunTelefonClick;

    @FindBy(xpath = "(//button[@id='addToCart'])[1]")
    public WebElement sepeteEkleButon;

    @FindBy(xpath = "(//span[contains(text(),'Siparişlerim')])[1]")
    public WebElement siparislerim;

    @FindBy(xpath = "(//div[@class='customerAccount-StaticMenuItem-359Tt'])[1]")
    public WebElement cikisYap;


    @FindBy(xpath = "(//li[@id='i1'])[1]")
    public WebElement ikinciUrunTelefonClick;

    @FindBy(xpath = "(//button[@id='addToCart'])[1]")
    public WebElement sepeteEkleButon2;

    @FindBy(xpath = "//span[@id='shoppingCart']")
    public WebElement sepetimButonu;

    @FindBy(xpath = "//a[normalize-space()='hepsiburada']")
    public WebElement birinciUrunText;

    @FindBy(xpath = "//a[normalize-space()='yirmidört']]")
    public WebElement ikinciUrunText;


    @FindBy(xpath = "(//span[@class='basket_itemCount_54lDX'])[1]")
    public WebElement sepetimText;


}
