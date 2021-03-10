package tests;

import general.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginLogoutPage;

import java.util.concurrent.TimeUnit;

public class verifyLoginTest extends BaseTest {


    @Test
    public void testLogin() {
        HomePage homePage = new HomePage(driver);
        homePage.setLoginLink();

        LoginLogoutPage login = new LoginLogoutPage(driver);
        login.Login("archanashirsat0208@gmail.com", "Practise12");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        login.validateLoginsuccessful();
        Assert.assertEquals(login.validateLoginsuccessful(), "12Logged in successfully");
    }
    @Test
    public void testlogout(){
        LoginLogoutPage logout = new LoginLogoutPage(driver);
        logout.Logout();
        logout.validateLogoutsuccessful();
        Assert.assertEquals(logout.validateLogoutsuccessful(), "Signed out successfully.");


    }
}




