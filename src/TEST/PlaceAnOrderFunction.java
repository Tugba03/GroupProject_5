package TEST;

import POM.LoginElements;
import POM.PlaceAnOrderElements;
import Utils.BaseDrivers;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PlaceAnOrderFunction extends BaseDrivers {

    LoginElements loginElements;
    PlaceAnOrderElements placeAnOrderElements;


    @Test(priority = 1)
    @Parameters({"emailInput", "passwordInput"})
    public void PositiveLoginTest(String userInput, String password) {

        loginElements = new LoginElements(driver);
        placeAnOrderElements = new PlaceAnOrderElements(driver);

        wait.until(ExpectedConditions.elementToBeClickable(loginElements.loginButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(loginElements.emailInput)).sendKeys(userInput);
        wait.until(ExpectedConditions.elementToBeClickable(loginElements.passwordInput)).sendKeys(password);
        loginElements.clickLoginButton.click();


        wait.until(ExpectedConditions.elementToBeClickable(placeAnOrderElements.laptopSelectButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(placeAnOrderElements.clickShoppingCart)).click();
      //  wait.until(ExpectedConditions.elementToBeClickable( placeAnOrderElements.addToCart)).click();


        Select country = new Select(placeAnOrderElements.ddCountry);
        country.selectByVisibleText("United States");
        Select state = new Select(placeAnOrderElements.ddState);
        state.selectByVisibleText("Florida");

        wait.until(ExpectedConditions.elementToBeClickable(placeAnOrderElements.zipCodeInput)).sendKeys("12345");
        wait.until(ExpectedConditions.elementToBeClickable(placeAnOrderElements.clickRadioButton)).click();
        placeAnOrderElements.clickCheckOut.click();

        Select select = new Select(placeAnOrderElements.selectAddressDropDown);
        select.selectByVisibleText("New Address");

        Select country2 = new Select(placeAnOrderElements.ddCountry2);
        country2.selectByVisibleText("United States");
        Select state2 = new Select(placeAnOrderElements.ddState2);
        state2.selectByVisibleText("Florida");



        placeAnOrderElements.cityInput.sendKeys("Miami");
        placeAnOrderElements.addressInput.sendKeys("123 ave");
        placeAnOrderElements.zipCodeInput2.sendKeys("12345");
        placeAnOrderElements.phoneNumberInput.sendKeys("1234567890");
        placeAnOrderElements.clickContinueButton.click();
        placeAnOrderElements.clickContinueButton2.click();
        placeAnOrderElements.getClickContinueButton3.click();
        placeAnOrderElements.checkRadioButton.click();
        placeAnOrderElements.getClickContinueButton4.click();
        placeAnOrderElements.getClickContinueButton5.click();
        placeAnOrderElements.clickConfirmButton.click();



        String actualMessage = placeAnOrderElements.successMessage.getText();
        String expectedMessage = "Your order has been successfully processed!";

        Assert.assertEquals(actualMessage, expectedMessage);

    }
}