package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    @FindBy(id = "link-to-login")
    WebElement loginLink;

    @FindBy(css = "#keywords")
    WebElement searchBox;

    @FindBy(css = "input[value='Search']")
    WebElement searchButton;


    public HomePage(WebDriver driver) {
        //this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public void setLoginLink() {
        System.out.println("Click on login link");
        loginLink.click();
    }

    public void enterSearchText(String searchElement) {
        searchBox.sendKeys(searchElement);

    }

    public void clickSearchButton() {
        searchButton.click();
    }
}