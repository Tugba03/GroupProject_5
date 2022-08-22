package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceAnOrderElements {
    public PlaceAnOrderElements(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div[data-productid='31']")
    public WebElement laptopSelectButton;

    @FindBy(xpath= "//span[text()='Shopping cart']")
    public WebElement clickShoppingCart;

    @FindBy(id = "add-to-cart-button-31")
    public WebElement addToCart;

    @FindBy(id = "CountryId")
    public WebElement ddCountry;

    @FindBy(id = "StateProvinceId")
    public WebElement ddState;

    @FindBy(id = "ZipPostalCode")
    public WebElement zipCodeInput;

    @FindBy(id = "termsofservice")
    public WebElement clickRadioButton;

    @FindBy(id = "checkout")
    public WebElement clickCheckOut;

    @FindBy(id = "BillingNewAddress_CountryId")
    public WebElement ddCountry2;

    @FindBy(id = "BillingNewAddress_StateProvinceId")
    public WebElement ddState2;

    @FindBy(id = "BillingNewAddress_City")
    public WebElement cityInput;

    @FindBy(id = "BillingNewAddress_Address1")
    public WebElement addressInput;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    public WebElement zipCodeInput2;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    public WebElement phoneNumberInput;

    @FindBy(css = "input[onclick='Billing.save()']")
    public WebElement clickContinueButton;

    @FindBy(css = "input[onclick='Shipping.save()']")
    public WebElement clickContinueButton2;

    @FindBy(id = "billing-address-select")
    public WebElement selectAddressDropDown;

    @FindBy(css = "input[onclick='ShippingMethod.save()']")
    public WebElement getClickContinueButton3;

    @FindBy(id = "paymentmethod_1")
    public  WebElement checkRadioButton;

    @FindBy(css = "input[onclick='PaymentMethod.save()']")
    public  WebElement getClickContinueButton4;

    @FindBy(css = "input[onclick='PaymentInfo.save()']")
    public WebElement getClickContinueButton5;

    @FindBy(css = "input[onclick='ConfirmOrder.save()']")
    public WebElement clickConfirmButton;

    @FindBy(css = "div.title>strong")
    public WebElement successMessage;

}
