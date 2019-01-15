package com.reloadbet.test.account;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.reloadbet.base.BaseClass;
import com.reloadbet.elements.DropDownAccMenu;
import com.reloadbet.pages.BetsHistoryPage;
import com.reloadbet.pages.ReloadHome;
import com.reloadbet.testdata.TestAccount;
import com.reloadbet.testdata.Url;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class AccountMenuPageE2ECheck extends BaseClass{

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

    @Test
    public void betsHistoryPage() {
        DropDownAccMenu dropDownAccMenu = new DropDownAccMenu();
        BetsHistoryPage betsHistoryPage = new BetsHistoryPage();

        $(dropDownAccMenu.accDropMenuButton).shouldBe(Condition.visible).click();
        System.out.printf("ok");
        $(dropDownAccMenu.betsHistoryLink).shouldBe(Condition.visible);
        $(betsHistoryPage.calendarForm).shouldBe(Condition.visible);
        $(dropDownAccMenu.myTransactionsLink).click();

       /* $(betsHistoryPage.byDateTitle).shouldBe(Condition.visible);
        $(betsHistoryPage.byDateCalendarFrom).shouldBe(Condition.visible).click();
        $(betsHistoryPage.calendarForm).shouldBe(Condition.visible);*/
        System.out.println("OK");
    }
}
