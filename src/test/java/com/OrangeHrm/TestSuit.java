package com.OrangeHrm;

import org.junit.Test;

public class TestSuit extends BaseTest {
    LoginPage homePage=new LoginPage();
    DashboardPage dashboardPage=new DashboardPage();
@Test
    public void loginSuccessfully(){
    homePage.fillingLoginDetails();
   // dashboardPage.clickOnPim();


}


}
