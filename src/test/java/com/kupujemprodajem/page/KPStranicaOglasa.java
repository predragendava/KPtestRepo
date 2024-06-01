package com.kupujemprodajem.page;

import com.kupujemprodajem.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class KPStranicaOglasa extends BaseTest {

    public KPStranicaOglasa(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[aria-label=\"Prihvatam\"]")
    WebElement prihvatamCookiesDugme;

    @FindBy(xpath = "//span[text()='Dodaj u adresar']")
    WebElement dodajUAdresarDugme;

    @FindBy(xpath = "//h1[text()='Ulogujte se']")
    WebElement ulogujteSeNaslov;

    public void prihvatamCookiesDugmeClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(prihvatamCookiesDugme)).click();
    }

    public void dodajUAdresarDugmeClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(dodajUAdresarDugme)).click();
    }

    public String ulogujteSeNaslovGetText(){
        wdWait.until(ExpectedConditions.elementToBeClickable(ulogujteSeNaslov));
        return ulogujteSeNaslov.getText();
    }


}
