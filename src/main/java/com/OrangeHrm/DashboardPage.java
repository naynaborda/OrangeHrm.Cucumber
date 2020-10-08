package com.OrangeHrm;

import org.openqa.selenium.By;

public class DashboardPage extends Utils{
    By _pim=By.xpath("//b[contains(text(),'PIM')]");
    By _addEmployee=By.xpath("//*[@id=\"menu_pim_addEmployee\"]");
    By _loinSuccessfully=By.id("welcome");


    public void hoverOverOnPim(){
        hoverOverOnElement(_pim);
    }
    public void clickOnAddEmployee(){
        clickOnElement(_addEmployee);
    }
    public String LoginSuccessfullyConfirmationText(){
       return getText(_loinSuccessfully);

    }
//    public void clickOnPim(){
//        clickOnElement(_addEmployee);
//    }
}
