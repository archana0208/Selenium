package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class SearchProducts {

    @FindBys(@FindBy(xpath = "//div[@id='products']/*"))
    List<WebElement> searchList;

    public SearchProducts(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public boolean findTextInAllSearchElements(String textToSearch)
    {
        for (WebElement elementText: searchList)
        {
            if(!(elementText.getText().contains(textToSearch)))
            {
                return false;
            }
        }
        return true;
    }


   /** @DataProvider(name="searchElement")
    public Object[][] createData1() {
        return new Object[][] {
                { "Ruby" }, {"Apache"},
        };
    }**/

}
