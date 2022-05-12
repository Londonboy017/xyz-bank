package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {
    public BankManagerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addCustomer;
    public void clickOnAddCustomerLogin() {
        CustomListeners.node.log(Status.PASS,"Click on add customer " + addCustomer.toString());
                Reporter.log("Click on add customer " + addCustomer.toString() + "<br>");
        clickOnElement( addCustomer);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement openAccount;
    public void clickOnOpenAccountLogin() {
        CustomListeners.node.log(Status.PASS,"Click on open account " + openAccount.toString());
        Reporter.log("Click on open account " + openAccount.toString() + "<br>");
        clickOnElement( openAccount);
    }

}
