package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CustomersPage extends Utility {
    public CustomersPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement yourNameDropDown;

    public void selectCustomer(String name){
        Reporter.log("Select the customer name "+name+"From dropdown + "+yourNameDropDown.getText()+"<br>");
        CustomListeners.node.log(Status.PASS,"Select the customer name "+name+"From dropdown + "+yourNameDropDown.getText());
        selectByVisibleTextFromDropDown(yourNameDropDown,name);
    }
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;

    public void clickOnLoginButton() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Login "+loginButton.toString()+"<br>");
        CustomListeners.node.log(Status.PASS,"Click on Login "+loginButton.toString());
        clickOnElement(loginButton);
    }
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement yourNameText;
    public String getYourNameText(){
        Reporter.log("get Your Name text"+yourNameText.toString()+"<br>");
        CustomListeners.node.log(Status.PASS,"get Your Name text"+yourNameText.toString());
        return getTextFromElement(yourNameText);
    }

}
