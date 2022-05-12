package com.bank.testsuite;


import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

import java.util.Currency;

public class BankTest extends TestBase {
    HomePage homePage;
    AccountPage accountPage;
    BankManagerLoginPage bankManagerLoginPage;
    CustomersPage customersPage;
    OpenAccountPage openAccountPage;
    AddCustomerPage addCustomerPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        accountPage = new AccountPage();
        bankManagerLoginPage = new BankManagerLoginPage();
        customersPage=new CustomersPage();
        openAccountPage = new OpenAccountPage();
        addCustomerPage = new AddCustomerPage();

            }

    @Test(groups = {"sanity", "regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnAddCustomerLogin();
        addCustomerPage.setFirstName("Rama");
        addCustomerPage.setLastName("Sharma");
        addCustomerPage.setPostCodeField("BN4RT3");
        addCustomerPage.clickOnAddCustomerButton();
        String actual=addCustomerPage.getAlertText();
        Assert.assertTrue(actual.contains("Customer added successfully"));
        addCustomerPage.acceptAlertMessage();
    }
    @Test(groups = {"smoke","sanity", "regression"})
    public void bankManagerShouldOpenAccountSuccessfully(){
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnOpenAccountLogin();
        openAccountPage.selectCustomer("Ron Weasly");
        openAccountPage.selectCurrency("Pound");
        openAccountPage.clickOnProcessButton();
        String actual=addCustomerPage.getAlertText();
        Assert.assertTrue(actual.contains("Account created successfully"));
        addCustomerPage.acceptAlertMessage();
    }

    @Test(groups = {"smoke", "regression"})
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        homePage.clickOnCustomerManagerLogin();
        customersPage.selectCustomer("Ron Weasly");
        customersPage.clickOnLoginButton();
        accountPage.clickOnLogoutButton();
        Assert.assertTrue(customersPage.getYourNameText().contains("Your Name"));

    }
    @Test(groups = {"smoke","regression"})
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        homePage.clickOnCustomerManagerLogin();
        customersPage.selectCustomer("Hermoine Granger");
        customersPage.clickOnLoginButton();
        accountPage.clickOnDepositButton();
        accountPage.setDepositAmount(100);
        accountPage.clickOnDeposit();
        String actual =accountPage.getDepositSuccessfulText();
        String expected= "Deposit Successful";
        Assert.assertEquals(actual,expected);
    }
    @Test(groups = {"regression"})
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
        homePage.clickOnCustomerManagerLogin();
        customersPage.selectCustomer("Hermoine Granger");
        customersPage.clickOnLoginButton();
        accountPage.clickOnWithdrawMenu();
        accountPage.setWithDrawAmount(50);
        accountPage.clickOnWithdrawButton();
        String actual = accountPage.getWithdrawSuccessfulText();
        String expected = "Transaction successful";
        Assert.assertEquals(actual,expected);

    }


}