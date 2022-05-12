package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {


    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    WebElement firstNameField;

    public void setFirstName(String firstName) {
        Reporter.log("Set first Name : " + firstName + " to firstname field" + firstNameField.toString() + "<br>");
        sendTextToElement(firstNameField, firstName);
    }


    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")
    WebElement lastNameField;
    public void  setLastName(String lastName){
        Reporter.log("Set last Name : " + lastName + " to lastname field" + lastNameField.toString() + "<br>");
        sendTextToElement(lastNameField, lastName);
    }
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
    WebElement postCodeField;
    public void  setPostCodeField(String postcode){
        Reporter.log("Set postcode : " + postcode + " to postcode field" + postCodeField.toString() + "<br>");
        sendTextToElement(postCodeField, postcode);
    }
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addCustomerButton;
    public void clickOnAddCustomerButton(){
        Reporter.log("click on add customer button :" +addCustomerButton.toString()+"<br>");
        clickOnElement(addCustomerButton);
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
