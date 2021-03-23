package general;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners extends BaseTest implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        //BaseTest.screenshots(result);
        System.out.println("Test Case Failed: "+result.getName());

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Case Passed: "+ result.getName());
    }
}
