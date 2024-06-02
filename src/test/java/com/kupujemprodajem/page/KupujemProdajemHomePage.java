package com.kupujemprodajem.page;

import com.kupujemprodajem.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.kupujemprodajem.utilities.CommonMethods.izvuciBrojIProveriDaLiJeVeciOdHiljadu;

public class KupujemProdajemHomePage extends BaseTest {

    public KupujemProdajemHomePage(){PageFactory.initElements(driver, this); }

    @FindBy(xpath = "//span[contains(text(),'Pretražite detaljno')]")
    WebElement pretraziteDetaljnoLink;

    @FindBy(id = "react-select-categoryId-input")
    WebElement kategorijaPadajuciMeni;

    @FindBy(xpath = "//div[@class=' css-12ypmh9-menu']//div[text()='Odeća | Ženska']")
    WebElement kategorijaOdecaZenskaDugme;

    @FindBy(id = "react-select-groupId-input")
    WebElement grupaPadajuciMeni;

    @FindBy(xpath = "//div[@class=' css-12ypmh9-menu']//div[text()='Bluze']")
    WebElement bluzeDugme;

    @FindBy(id = "priceFrom")
    WebElement cenaOdPolje;

    @FindBy(xpath = "//span[@class=\"Checkbox_label__w6n3y\"][text()='Samo sa cenom']")
    WebElement samoSaCenomCheckbox;

    @FindBy(id = "react-select-condition-input")
    WebElement stanjePadajuciMeni;

    @FindBy(xpath = "//*[@id=\"react-select-condition-option-0\"]//span[text()='Novo']")
    WebElement stanjeNovoOpcija;

    @FindBy(xpath = "//span[contains(text(),'Kao novo')]")
    WebElement stanjeKaoNovoNekoriscenoOpcija;

    @FindBy(xpath = "//button[@aria-label='Primeni filtere']")
    WebElement primeniFiltereDugme;

    @FindBy(xpath = "//a[@aria-label=\"Bluze\"][text()='Bluze']/following-sibling::span")
    WebElement brojRezultataElement;


    public void pretraziteDetaljnoLinkClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(pretraziteDetaljnoLink)).click();
    }

    public void kategorijaPadajuciMeniClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(kategorijaPadajuciMeni)).click();
    }

    public void kategorijaOdecaZenskaDugmeClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(kategorijaOdecaZenskaDugme)).click();
    }

    public void grupaPadajuciMeniClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(grupaPadajuciMeni)).click();
    }

    public void bluzeDugmeClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(bluzeDugme)).click();
    }

    public void cenaOdPoljeSendKeys(String cena){
        wdWait.until(ExpectedConditions.elementToBeClickable(cenaOdPolje)).clear();
        cenaOdPolje.sendKeys(cena);
    }

    public void samoSaCenomCheckboxClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(samoSaCenomCheckbox)).click();
    }

    public void stanjePadajuciMeniClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(stanjePadajuciMeni)).click();
    }

    public void stanjeNovoOpcijaClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(stanjeNovoOpcija)).click();
    }

    public void stanjeKaoNovoNekoriscenoOpcijaClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(stanjeKaoNovoNekoriscenoOpcija)).click();
    }

    public void primeniFiltereDugmeClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(primeniFiltereDugme)).click();
    }

    public boolean brojRezultataVeciOdHiljadu(){
        wdWait.until(ExpectedConditions.visibilityOf(brojRezultataElement));
        return izvuciBrojIProveriDaLiJeVeciOdHiljadu(brojRezultataElement.getAttribute("outerHTML"));

    }

    public void navigateTo(String url){
        driver.get(url);
    }

}
