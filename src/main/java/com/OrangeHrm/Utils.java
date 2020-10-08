package com.OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utils  extends BasePage{
    //reusable method for click on web element
    public void clickOnElement(By by){
        driver.findElement(by).click();

    }
    //reusable method for send keys
    public  void typeText(By by,String textValue){
        driver.findElement(by).sendKeys(textValue);
    }
    //reusable method for mouse hover over
    public void hoverOverOnElement(By by){
        //Instantiate Action Class
        Actions actions = new Actions(driver);
        //find WebElement  to perform mouse hover
        WebElement target = driver.findElement(by);
        //Mouse hover
        actions.moveToElement(target).build().perform();



    }
    //Reusable method for Select
    public static void selectValueFromDropDown(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(value);}

    //Reusable method for get text
    public static String getText(By by) {
        return driver.findElement(by).getText();
    }
    //Reusable method for clear field
    public static void clearField(By by) {
        driver.findElement(by).clear();
    }


}
