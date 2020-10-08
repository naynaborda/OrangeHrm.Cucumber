package com.OrangeHrm;

import org.openqa.selenium.By;

public class LoginPage extends Utils {
    By _userName=By.id("txtUsername");
    By _password=By.id("txtPassword");
    By _loginBtn=By.id("btnLogin");

    public void enterUserName(String userName){
        typeText(_userName,userName);

    }
    public void enterPassword(String password){
        typeText(_password,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(_loginBtn);
    }
    //this is for testSuit
    public void fillingLoginDetails(){
        typeText(_userName,"Admin");
        typeText(_password,"admin123");
        clickOnElement(_loginBtn);
    }
}
