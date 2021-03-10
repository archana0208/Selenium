package tests;

import general.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchProducts;

public class searchProductTest extends BaseTest {

    @Test
     public void verifySearchResult()
    {
        /**1. Open url.
         2. Enter the text ruby to be searched
         3. Click on search button
         4. Verify if correct search results are displayed
            4.1 Get the text of each elements
            4.2 Compare it with input.
            4.3 If any text does not contain text then mark test case fail otherwise pass.**/

        HomePage home = new HomePage(driver);
        home.enterSearchText("Ruby");
        home.clickSearchButton();
        SearchProducts sp= new SearchProducts(driver);;
        Assert.assertTrue(sp.findTextInAllSearchElements("Apache"),"Correct Search Results");



    }

}
