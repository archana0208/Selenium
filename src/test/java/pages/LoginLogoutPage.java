package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLogoutPage {

    @FindBy(id = "spree_user_email")
    private WebElement email;

    @FindBy(css = "input[name='spree_user[password]']")
    private WebElement password;

    @FindBy(css = "input[name='commit']")
    private WebElement submitt;


    //@FindBy(className = "alert alert-success")
    @FindBy(css = "div[class='alert alert-success']")
    private WebElement loginsuccessful;

    @FindBy(css = "a[href='/logout']")
    private WebElement logout;

    @FindBy(css = "div[class='alert alert-notice']")
    private WebElement logoutsuccessful;


    public LoginLogoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void Login(String UserName,String Password)
    {
        email.sendKeys(UserName);
        password.sendKeys(Password);
        submitt.click();
    }

    public String validateLoginsuccessful() {
        String loginMessage= loginsuccessful.getText();
        System.out.println(loginMessage);
        return loginMessage;
    }

    public void Logout()
    {
        logout.click();
    }

    public String validateLogoutsuccessful() {
        String logoutMessage= logoutsuccessful.getText();
        System.out.println(logoutMessage);
        return logoutMessage;
    }


}
