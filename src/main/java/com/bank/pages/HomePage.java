package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLogin;

    public void clickOnBankManagerLogin() {
        Reporter.log("Click on bank manager login " + bankManagerLogin.toString() + "<br>");
        CustomListeners.node.log(Status.PASS,"Click on bank manager login " + bankManagerLogin.toString());
                clickOnElement(bankManagerLogin);
    }
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLogin;

    public void clickOnCustomerManagerLogin() {
        Reporter.log("Click on customer login " + customerLogin.toString() + "<br>");
        CustomListeners.node.log(Status.PASS,"Click on customer login " + customerLogin.toString());
                clickOnElement(customerLogin);
    }



}
