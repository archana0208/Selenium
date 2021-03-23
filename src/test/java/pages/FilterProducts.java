package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilterProducts {

    @FindBys(@FindBy(xpath = "//div[@data-hook='taxon_sidebar_navigation']//div[1]//a[1]"))
    List<WebElement> filterByCategory;

    @FindBy(xpath = "//label[@for='Price_Range_$15.00_-_$18.00']")
    WebElement priceRange;

    @FindBy(className = "btn btn-primary")
    WebElement submittbutton;

    public FilterProducts(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void selectCategory(String Category) {

        for (int i = 0; i < filterByCategory.size(); i++) {
            String s1 = filterByCategory.get(i).getText();
            if (s1.equals(Category))
                filterByCategory.get(i).click();
        }
    }

    public void selectPriceRange()
    {
        priceRange.click();
    }
    public void hitSubmittButton()
    {
       submittbutton.click();
    }

}