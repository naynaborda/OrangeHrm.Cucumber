package com.OrangeHrm;

import org.openqa.selenium.By;

public class ViewSystemUserPage  extends Utils{
    By _add=By.name("btnAdd");
    By _userName=By.id("searchSystemUser_userName");
    By _search=By.id("searchBtn");
    By _welcome=By.id("welcome");
    By _logout=By.linkText("Logout");
    public void clickOnAdd(){
        clickOnElement(_add);
    }
    public void enterUserName(String userName){
        typeText(_userName,userName);
    }
    public void clickOnSearchBtn(){
        clickOnElement(_search);
    }
    public void clickOnLogout(){
        clickOnElement(_welcome);
        clickOnElement(_logout);
    }
}
