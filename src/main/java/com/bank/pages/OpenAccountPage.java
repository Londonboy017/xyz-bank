package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {
    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerDropDown;

    public void selectCustomer(String customerName){
        Reporter.log("Select Customer name "+customerName+"from the dropdown : "+customerDropDown.toString()+"<br>");
        CustomListeners.node.log(Status.PASS,"Select Customer name "+customerName+"from the dropdown : "+customerDropDown.toString());
        selectByVisibleTextFromDropDown(customerDropDown,customerName);
    }
    @FindBy(xpath = "//select[@id='currency']")
    WebElement currencyDropDown;
    public void selectCurrency(String currencyName){
        Reporter.log("Select Currency "+currencyName+"from the dropdown : "+currencyDropDown.toString()+"<br>");
        CustomListeners.node.log(Status.PASS,"Select Currency "+currencyName+"from the dropdown : "+currencyDropDown.toString());
        selectByVisibleTextFromDropDown(currencyDropDown, currencyName);
    }

    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement processButton;
    public void clickOnProcessButton(){
        Reporter.log("Click on Process Button : "+processButton.toString()+"<br>");
        CustomListeners.node.log(Status.PASS,"Click on Process Button : "+processButton.toString());
        clickOnElement(processButton);
    }
    public String getAlertText(){
        Reporter.log("Get alert text message :");
        CustomListeners.node.log(Status.PASS,"Get alert text message :");
        return getTextFromAlert();
    }
    public void acceptAlertMessage(){
        acceptAlert();
    }

}

