package com.kupujemprodajem.test;

import com.kupujemprodajem.base.BaseTest;
import com.kupujemprodajem.page.KPStranicaOglasa;
import com.kupujemprodajem.page.KupujemProdajemHomePage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KupujemProdajemTests extends BaseTest {

    KupujemProdajemHomePage kupujemProdajemHomePage;
    KPStranicaOglasa kpStranicaOglasa;

    @Before
    public void setUpKPTest(){
        kupujemProdajemHomePage = new KupujemProdajemHomePage();
        kpStranicaOglasa = new KPStranicaOglasa();
    }

    @Test
    public void proveraBrojaRezultataZaNoveIKaoNoveZenskeBluze(){
        kupujemProdajemHomePage.pretraziteDetaljnoLinkClick();
        kupujemProdajemHomePage.kategorijaPadajuciMeniClick();
        kupujemProdajemHomePage.kategorijaOdecaZenskaDugmeClick();
        kupujemProdajemHomePage.grupaPadajuciMeniClick();
        kupujemProdajemHomePage.bluzeDugmeClick();
        kupujemProdajemHomePage.cenaOdPoljeSendKeys("100");
        kupujemProdajemHomePage.samoSaCenomCheckboxClick();
        kupujemProdajemHomePage.stanjePadajuciMeniClick();
        kupujemProdajemHomePage.stanjeNovoOpcijaClick();
        kupujemProdajemHomePage.stanjeKaoNovoNekoriscenoOpcijaClick();
        kupujemProdajemHomePage.primeniFiltereDugmeClick();
        Assert.assertTrue(kupujemProdajemHomePage.brojRezultataVeciOdHiljadu());
    }

    @Test
    public void proveraPrikazaProzoraZaLogovanjeNakonKlikaNaDodajUAdresar(){
        kupujemProdajemHomePage.navigateTo("https://www.kupujemprodajem.com/nakit-satovi-i-dragocenosti/penkala-i-olovke/olovka-srebrne-boje/oglas/167567449");
        kpStranicaOglasa.prihvatamCookiesDugmeClick();
        kpStranicaOglasa.dodajUAdresarDugmeClick();
        Assert.assertEquals("Ulogujte se", kpStranicaOglasa.ulogujteSeNaslovGetText());
    }


}
