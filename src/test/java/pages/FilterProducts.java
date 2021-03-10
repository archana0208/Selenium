package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilterProducts {

    @FindBys(@FindBy(xpath = "///div[@class='list-group']/*"))
    List<WebElement> searchList;

    public FilterProducts(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void  
}
