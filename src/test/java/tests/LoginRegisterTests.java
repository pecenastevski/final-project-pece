package tests;

import data.LoginRegisterData;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginRegisterTests extends BaseTest{
    @Test
    public void newUserReg() {
        loginRegisterPage.clickSignIn();
        loginRegisterPage.enterEmail(LoginRegisterData.email);
        loginRegisterPage.createAccount();
        loginRegisterPage.checkTitle();
        Assert.assertEquals(loginRegisterPage.ReturnTitle(0),"checked");
        loginRegisterPage.sendFirstName(LoginRegisterData.firstname);
        loginRegisterPage.sendLastName(LoginRegisterData.lastname);
        loginRegisterPage.sendPassword(LoginRegisterData.password);
        Assert.assertEquals(loginRegisterPage.ReturnPersonalInfo(0),"Pece");
        Assert.assertEquals(loginRegisterPage.ReturnPersonalInfo(1),"Nastevski");
        Assert.assertEquals(loginRegisterPage.ReturnPersonalInfo(2),"1112988a");
        js.executeScript("window.scrollBy(0,100)");
        loginRegisterPage.selectDay(11);
        loginRegisterPage.selectMonth(12);
        loginRegisterPage.selectYear(34);
        loginRegisterPage.checkNewsBox();
        js.executeScript("window.scrollBy(0,100)");
        loginRegisterPage.sendCompanyName(LoginRegisterData.company);
        loginRegisterPage.sendAddress(LoginRegisterData.address);
        loginRegisterPage.sendAddress2(LoginRegisterData.address2);
        loginRegisterPage.sendCity(LoginRegisterData.city);
        loginRegisterPage.selectState(1);
        loginRegisterPage.sendZipCode(LoginRegisterData.zipcode);
        js.executeScript("window.scrollBy(0,100)");
        loginRegisterPage.sendPlusInfo("Hello");
        loginRegisterPage.sendHomePhone(LoginRegisterData.homephone);
        loginRegisterPage.sendMobilePhone(LoginRegisterData.mobilephone);
        loginRegisterPage.sendAddressAlias("DG");
        loginRegisterPage.clickRegisterButton();
        sleep(2000);

    }}

