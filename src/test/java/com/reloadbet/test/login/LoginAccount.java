package com.reloadbet.test.login;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.reloadbet.base.BaseClass;
import com.reloadbet.pages.ReloadHome;
import com.reloadbet.testdata.TestAccount;
import com.reloadbet.testdata.Url;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;


public class LoginAccount {

    @Test

    public void loginUser() {
        Url url = new Url();
        ReloadHome reloadHome = new ReloadHome();
        TestAccount testAccount = new TestAccount();
        Selenide.open(url.stageReloadHomePageUrl,
                "",
                "stage",
                "stagetest");
        //Test
        $(reloadHome.loginName).setValue(testAccount.reloadLog1);
        $(reloadHome.password).setValue(testAccount.reloadPass1);
        $(reloadHome.login).click();
        $(reloadHome.DepositButton).shouldBe(Condition.visible);
    }

}

