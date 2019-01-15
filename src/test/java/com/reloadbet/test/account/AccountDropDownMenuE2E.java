package com.reloadbet.test.account;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.reloadbet.base.BaseClass;
import com.reloadbet.elements.DropDownAccMenu;
import com.reloadbet.pages.BetsHistoryPage;
import com.reloadbet.pages.ReloadHome;
import com.reloadbet.testdata.TestAccount;
import com.reloadbet.testdata.Url;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.dismiss;

public class AccountDropDownMenuE2E extends BaseClass {
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
    public void dropDownMenu() {
        DropDownAccMenu dropDownAccMenu = new DropDownAccMenu();

        //Test
        $(dropDownAccMenu.accDropMenuButton).shouldBe(Condition.visible).click();
        $(dropDownAccMenu.betsHistoryLink).shouldBe(Condition.visible);
        $(dropDownAccMenu.myTransactionsLink).shouldBe(Condition.visible);
        $(dropDownAccMenu.bonusesLink).shouldBe(Condition.visible);
        $(dropDownAccMenu.withdrawMoneyLink).shouldBe(Condition.visible);
        $(dropDownAccMenu.pendingWithdrawalsLink).shouldBe(Condition.visible);
        $(dropDownAccMenu.personalDetailsLink).shouldBe(Condition.visible);
        $(dropDownAccMenu.logoutLink).shouldBe(Condition.visible);
        $(dropDownAccMenu.nameAccAndNum).shouldBe(Condition.visible);
        $(dropDownAccMenu.balanceTitleMoneyHomepage).shouldBe(Condition.visible);
        $(dropDownAccMenu.moneySum).shouldBe(Condition.visible);
    }
}
