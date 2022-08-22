package TEST;

import POM.LoginElements;
import Utils.BaseDrivers;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginFunction extends BaseDrivers {

    LoginElements loginElements;

    String ExpectedUrl = "http://demowebshop.tricentis.com/";



    @Test(priority = 1)
    @Parameters({"emailInput", "passwordInput"})
    public void PositiveLoginTest(String userInput, String password) {

        loginElements = new LoginElements(driver);
        wait.until(ExpectedConditions.elementToBeClickable(loginElements.loginButton)).click();

        wait.until(ExpectedConditions.elementToBeClickable(loginElements.emailInput)).sendKeys(userInput);
        wait.until(ExpectedConditions.elementToBeClickable(loginElements.passwordInput)).sendKeys(password);
        loginElements.clickLoginButton.click();

        Assert.assertEquals(ExpectedUrl, "http://demowebshop.tricentis.com/");
        System.out.println(ExpectedUrl);

    }

    @Test(priority = 2)
    @Parameters({"invalidEmail", "invalidPassword"})
    public void NegativeLoginTest(String invalidUserInput, String invalidPassword) {

        loginElements = new LoginElements(driver);
        wait.until(ExpectedConditions.elementToBeClickable(loginElements.loginButton)).click();

        wait.until(ExpectedConditions.elementToBeClickable(loginElements.emailInput)).sendKeys(invalidUserInput);
        wait.until(ExpectedConditions.elementToBeClickable(loginElements.passwordInput)).sendKeys(invalidPassword);
        loginElements.clickLoginButton.click();

        Assert.assertTrue(loginElements.errorMessage.isDisplayed());

    }
}