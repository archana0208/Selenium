package tests;

import general.BaseTest;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.FilterProducts;
import pages.HomePage;
import pages.SearchProducts;
@Listeners(general.Listners.class)
public class searchProductTest extends BaseTest {

    @Test
     public void verifySearchResult()
    {
        HomePage home = new HomePage(driver);
        home.enterSearchText("Ruby");
        home.clickSearchButton();
        SearchProducts sp= new SearchProducts(driver);;
        Assert.assertTrue(sp.findTextInAllSearchElements("Ruby"),"Correct Search Results");
        home.enterSearchText("Apache");
        home.clickSearchButton();
        Assert.assertTrue(sp.findTextInAllSearchElements("Apach"),"Correct Search Results");

    }

    @Test
    public void filterProduct()
    {
        FilterProducts product = new FilterProducts(driver);
        product.selectCategory("Bags");
        product.selectPriceRange();
        product.hitSubmittButton();
    }



}
