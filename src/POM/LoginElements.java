package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.print.attribute.standard.Fidelity;

public class LoginElements {

    public LoginElements(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href='/login']")
    public WebElement loginButton;

    @FindBy(id = "Email")
    public WebElement emailInput;

    @FindBy(id = "Password")
    public WebElement passwordInput;

    @FindBy(css = "input[class='button-1 login-button']")
    public WebElement clickLoginButton;


    @FindBy(css = "div[class='validation-summary-errors']")
    public WebElement errorMessage;

}
