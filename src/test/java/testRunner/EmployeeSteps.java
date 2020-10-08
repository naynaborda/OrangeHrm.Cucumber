package testRunner;

import com.OrangeHrm.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class EmployeeSteps {
    LoginPage loginPage=new LoginPage();
    DashboardPage dashboardPage=new DashboardPage();
    AddEmployeePage addEmployeePage=new AddEmployeePage();
    ViewSystemUserPage viewSystemUserPage=new ViewSystemUserPage();
    SaveSystemUserPage saveSystemUserPage=new SaveSystemUserPage();
    @Given("^user is on the homepage$")
    public void user_is_on_the_homepage()  {

    }

    @When("^user enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_enter_username_as_and_password_as(String userName, String password)  {
        loginPage.enterUserName(userName);
        loginPage.enterPassword(password);


    }

    @When("^user click on login button$")
    public void user_click_on_login_button() {
        loginPage.clickOnLoginButton();

    }

    @And("^Hover over on PIM$")
    public void hoverOverOnPIM() {
        dashboardPage.hoverOverOnPim();
    }


    @And("^user click on Add Employee$")
    public void userClickOnAddEmployee() throws InterruptedException {
        Thread.sleep(1000);
        dashboardPage.clickOnAddEmployee();
    }

    @And("^user enter firstName as \"([^\"]*)\" and lastName as \"([^\"]*)\"$")
    public void userEnterFirstNameAsAndLastNameAs(String firstName, String lastName)  {
        addEmployeePage.enterFirstNameAndLastName(firstName,lastName);


    }

    @And("^user upload Photo$")
    public void userUploadPhoto() {
        addEmployeePage.uploadPhoto();
    }

    @And("^user click on create login details$")
    public void userClickOnCreateLoginDetails() {
        addEmployeePage.clickOnCreateLoginDetails();
    }

    @And("^user enter username as \"([^\"]*)\",password as \"([^\"]*)\" and confirmPassword as \"([^\"]*)\"$")
    public void userEnterUsernameAsPasswordAsAndConfirmPasswordAs(String userName, String password, String confirmPassword)  {
        addEmployeePage.enterUserName(userName);
        addEmployeePage.enterPassword(password);
        addEmployeePage.enterConfirmPassword(confirmPassword);

    }

    @And("^user click on save button$")
    public void userClickOnSaveButton() throws InterruptedException {
        Thread.sleep(1000);
        addEmployeePage.clickOnSaveBtn();
        Thread.sleep(1000);
    }

    @And("^click on admin tab$")
    public void clickOnAdminTab() {
        addEmployeePage.clickOnAdminTab();
    }

    @And("^click on add$")
    public void clickOnAdd() {
        viewSystemUserPage.clickOnAdd();

    }

    @And("^user select User roles$")
    public void userSelectUserRoles() {
        saveSystemUserPage.selectUseRoles();
    }

    @And("^user enter employeeName as\"([^\"]*)\",username as\"([^\"]*)\" ,password as \"([^\"]*)\" and confirmPassword as \"([^\"]*)\"$")
    public void userEnterEmployeeNameAsUsernameAsPasswordAsAndConfirmPasswordAs(String employeeName, String userName, String password, String confirmPassword)  {
        saveSystemUserPage.enterEmployeeName(employeeName);
        saveSystemUserPage.enterUserName(userName);
        saveSystemUserPage.enterPassword(password);
        saveSystemUserPage.enterConfirmPassword(confirmPassword);

    }

@Then("^user verify by entering username as \"([^\"]*)\" to search in the database$")
public void userVerifyByEnteringUsernameAsToSearchInTheDatabase(String userName)  {
    viewSystemUserPage.enterUserName(userName);

}

    @And("^user click on search button$")
    public void userClickOnSearchButton() {
        viewSystemUserPage.clickOnSearchBtn();
    }


    @And("^click on Logout$")
    public void clickOnLogout() throws InterruptedException {
        Thread.sleep(1000);
        viewSystemUserPage.clickOnLogout();
    }

    @Then("^verify user is able to login successfully with message \"([^\"]*)\"$")
    public void verifyUserIsAbleToLoginSuccessfullyWithMessage(String loginSuccessFullyConfirmationMessage)  {
        Assert.assertEquals(loginSuccessFullyConfirmationMessage,dashboardPage.LoginSuccessfullyConfirmationText());


    }

//    @And("^click on PIM$")
//    public void clickOnPIM() throws InterruptedException {
//        Thread.sleep(1000);
//        dashboardPage.clickOnPim();

    //from here Scenario two's step
    @And("^user fill all the compulsory fields$")
    public void userFillAllTheCompulsoryFields() {
        addEmployeePage.fillAllCompulsoryFields();

    }




    @And("^User edit personal details and fill License Expiry ,Marital Status and DOB$")
    public void userEditPersonalDetailsAndFillLicenseExpiryMaritalStatusAndDOB() {
        addEmployeePage.clickOnEditButton();
        addEmployeePage.editPersonalDetails();
    }



//    @Then("^user verify \"([^\"]*)\" message displayed$")
//    public void userVerifyMessageDisplayed(String savedConfirmationMessage)  {
//        Assert.assertEquals(savedConfirmationMessage,addEmployeePage.savedSuccessfullyText());
//
//    }
   @And("^user click on Employee list$")
    public void userClickOnEmployeeList() {
        addEmployeePage.clickOnEmployeeList();
      }

    @And("^user search  Employee by ID$")
    public void userSearchEmployeeByID() {
        addEmployeePage.searchEmployeeById();
    }


    @Then("^verify same employee is present in data base at bottom$")
    public void verifySameEmployeeIsPresentInDataBaseAtBottom() {
        Assert.assertEquals("Honda",addEmployeePage.getEmployeeName());

    }

}
