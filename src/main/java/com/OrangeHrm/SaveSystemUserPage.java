package com.OrangeHrm;

import org.openqa.selenium.By;

public class SaveSystemUserPage extends Utils {
    By _userRoles = By.id("systemUser_userType");
    By _employeeName = By.id("systemUser_employeeName_empName");
    By _userName = By.id("systemUser_userName");
    By _password = By.id("systemUser_password");
    By _confirmPassword = By.id("systemUser_confirmPassword");
    By _save = By.id("btnSave");

    public void selectUseRoles() {
        selectValueFromDropDown(_userRoles, "Admin");
    }

    public void enterEmployeeName(String employeeName) {
        typeText(_employeeName, employeeName);
    }

    public void enterUserName(String userName) {
        typeText(_userName, userName);
    }

    public void enterPassword(String password) {
        typeText(_password, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        typeText(_confirmPassword, confirmPassword);
    }
}
