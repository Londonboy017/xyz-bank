package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AccountPage extends Utility {
    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logOutButton;

    public void clickOnLogoutButton() {
        Reporter.log("Click on logout button : " + logOutButton.toString() + "<br>");
        clickOnElement(logOutButton);
        CustomListeners.node.log(Status.PASS, "Click on Logout button : " + logOutButton.getText() );
    }

    public boolean logoutButtonIsDisplayed() {
      CustomListeners.node.log(Status.PASS,"logout button is displayed"+logOutButton.getText());
        return logOutButton.isDisplayed();
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]")
    WebElement depositButton;

    public void clickOnDepositButton() {
        Reporter.log("Click On deposit button : " + depositButton.toString() + "<br>");
        CustomListeners.node.log(Status.PASS,"Click On deposit button : " + depositButton.toString());
        clickOnElement(depositButton);
    }

    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amountField;

    public void setDepositAmount(int amount) {
        Reporter.log("Send withdraw amount to withdraw field " + amountField.toString() + "<br>");
        CustomListeners.node.log(Status.PASS,"Send withdraw amount to withdraw field " + amountField.toString());
        sendTextToElement(amountField, String.valueOf(amount));
    }

    public void setWithDrawAmount(int amount) {
        Reporter.log("Send withdraw amount to withdraw field " + amountField.toString() + "<br>");
        CustomListeners.node.log(Status.PASS,"Send withdraw amount to withdraw field " + amountField.toString());
        sendTextToElement(amountField, String.valueOf(amount));
    }

    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement text;

    public String getDepositSuccessfulText() throws InterruptedException {
        CustomListeners.node.log(Status.PASS,"get Text message : " + text.toString());
                Reporter.log("get Text message : " + text.toString() + "<br>");
        return getTextFromElement(text);
    }

    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement transactionText;

    public String getWithdrawSuccessfulText() throws InterruptedException {
        CustomListeners.node.log(Status.PASS,"get Text message : " + transactionText.toString());
        Reporter.log("get Text message : " + transactionText.toString() + "<br>");

        return getTextFromElement(transactionText);
    }

    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement deposit;

    public void clickOnDeposit() {
        CustomListeners.node.log(Status.PASS,"Click on Depostit : " + deposit.toString());
        Reporter.log("Click on Depostit : " + deposit.toString() + "<br>");
        clickOnElement(deposit);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[3]")
    WebElement withDrawMenu;

    public void clickOnWithdrawMenu() {
        Reporter.log("Click on Withdrawl menu " + withDrawMenu.toString() + "<br>");
        CustomListeners.node.log(Status.PASS,"Click on Withdrawl menu " + withDrawMenu.toString());
        clickOnElement(withDrawMenu);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement withdrawButton;

    public void clickOnWithdrawButton() {
        Reporter.log("Click on withdraw button " + withdrawButton.toString() + "<br>");
        CustomListeners.node.log(Status.PASS,"Click on withdraw button " + withdrawButton.toString());
        clickOnElement(withdrawButton);
    }

}
