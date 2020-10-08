package com.OrangeHrm;

import org.openqa.selenium.By;

public class AddEmployeePage  extends Utils{
    By _firstName=By.id("firstName");
    By _lastName=By.id("lastName");
    By _createLoginDetails=By.id("chkLogin");
    By _userName=By.id("user_name");
    By _password=By.id("user_password");
    By _confirmPassword=By.id("re_password");
    By _save =By.id("btnSave");
    By _admin=By.xpath("//b[contains(text(),'Admin')]");
    By _photo=By.xpath("//input[@id='photofile']");
    By _editBtn=By.id("btnSave");
    By _licenseExpiry=By.id("personal_txtLicExpDate");
    By _lcMonth=By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]");
    By _lcYear=By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]");
    By _lcDay=By.xpath("//a[contains(text(),'21')]");
    By _maritalStatus=By.id("personal_cmbMarital");
    By _dob=By.id("personal_DOB");
    By _dobMonth=By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]");
    By _dobYear=By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]");
    By _dobDay=By.xpath("//a[contains(text(),'27')]");
    By _savedMessage=By.xpath("");
    By _employeeList=By.id("menu_pim_viewEmployeeList");
    By _employeeID=By.id("empsearch_id");
    By _searchBtn=By.id("searchBtn");
    By _employeeName=By.xpath("//a[contains(text(),'Honda')]");


    public void enterFirstNameAndLastName(String firstName,String lastName){
        typeText(_firstName,firstName);
        typeText(_lastName,lastName);
    }
    public void uploadPhoto(){
        typeText(_photo,"C:\\Users\\Chandresh\\Desktop\\RadhaKrishna1.jpg");
    }

    public void clickOnCreateLoginDetails(){
        clickOnElement(_createLoginDetails);
    }
    public void enterUserName(String userName){
        typeText(_userName,userName);
    }
    public void enterPassword(String password){
        typeText(_password,password);

    }
    public void enterConfirmPassword(String confirmPassword){
        typeText(_confirmPassword,confirmPassword);
    }
    public void clickOnSaveBtn(){
        clickOnElement(_save);
    }
    public void clickOnAdminTab(){
        clickOnElement(_admin);
    }
    public void fillAllCompulsoryFields(){
        typeText(_firstName,"Honda");
        typeText(_lastName,"Jazz");
        typeText(_photo,"C:\\Users\\Chandresh\\Desktop\\IMG-20190430-WA0013.jpg");

    }
    public void clickOnEditButton(){
        clickOnElement(_editBtn);
    }
public void editPersonalDetails(){
        clickOnElement(_licenseExpiry);
        clickOnElement(_lcMonth);
        selectValueFromDropDown(_lcMonth,"May");
        clickOnElement(_lcYear);
        selectValueFromDropDown(_lcYear,"2023");
        clickOnElement(_lcDay);
        selectValueFromDropDown(_maritalStatus,"Married");
        clickOnElement(_dob);
        clickOnElement(_dobMonth);
        selectValueFromDropDown(_dobMonth,"Mar");
        clickOnElement(_dobYear);
        selectValueFromDropDown(_dobYear,"1995");
        clickOnElement(_dobDay);

    }

//    public String savedSuccessfullyText(){
//       return getText(_savedMessage);
//    }
    public void clickOnEmployeeList(){
        clickOnElement(_employeeList);
    }
    public void searchEmployeeById(){
        typeText(_employeeID,"0085");
        clickOnElement(_searchBtn);

    }
    public String getEmployeeName(){
       return getText(_employeeName);
    }
}
