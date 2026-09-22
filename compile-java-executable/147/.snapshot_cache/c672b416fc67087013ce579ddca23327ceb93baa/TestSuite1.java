import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.*;
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

@Listeners(TestListener.class)
public class TestSuite1 {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void newqtesttest() {
        tg.openDevice();
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnteremailaddressEditText1782989341799", 1);
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnteremailaddressEditText1782989341799", "gautam@nandvanaq@testgrid.io", true);
        // [DISABLED] tg.startSecureBlock();
        tg.wait("ele_EnterpasswordEditText1784028263660", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnterpasswordEditText1784028263660", 1);
        tg.wait("ele_EnterpasswordEditText1784028263660", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnterpasswordEditText1784028263660", "pass4TG$", true);
        // [DISABLED] tg.endSecureBlock();
        tg.wait(1);
        tg.wait(1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void newtttt() {
        tg.openDevice();
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnteremailaddressEditText1782989341799", 1);
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnteremailaddressEditText1782989341799", "gautamkumar@gmail.com", true);
        tg.wait("ele_EnterpasswordEditText1784028263660", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnterpasswordEditText1784028263660", 1);
        tg.wait("ele_EnterpasswordEditText1784028263660", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnterpasswordEditText1784028263660", "pass4TG$", true);
        tg.wait("ele_textinputendiconImageButton1784028279429", ComparisonType.IS_VISIBLE);
        tg.click("ele_textinputendiconImageButton1784028279429", 1);
        tg.wait("ele_textinputendiconImageButton1784028279429", ComparisonType.IS_VISIBLE);
        tg.click("ele_textinputendiconImageButton1784028279429", 1);
        tg.wait("ele_ForgotPasswordTextView1784028289696", ComparisonType.IS_VISIBLE);
        tg.click("ele_ForgotPasswordTextView1784028289696", 1);
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnteremailaddressEditText1782989341799", 1);
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnteremailaddressEditText1782989341799", "Enter email address", true);
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnteremailaddressEditText1782989341799", 1);
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnteremailaddressEditText1782989341799", "gautamkumar@gmail.com", true);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void newtest() {
        tg.openDevice();
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnteremailaddressEditText1782989341799", 1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void newtestfeatureinfrafaild() {
        tg.openDevice();
        tg.wait("ele_EnteremailaddressEditText1782727175745", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnteremailaddressEditText1782727175745", 1);
        tg.wait("ele_EnteremailaddressEditText1782727175745", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnteremailaddressEditText1782727175745", "gautamkumar@gmail.com", true);
        tg.wait("ele_EnterpasswordEditText1782727214455", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnterpasswordEditText1782727214455", 1);
        tg.wait("ele_EnterpasswordEditText1782727214455", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnterpasswordEditText1782727214455", "pass4TG$", true);
        tg.wait("ele_textinputendiconImageButton1782727228418", ComparisonType.IS_VISIBLE);
        tg.click("ele_textinputendiconImageButton1782727228418", 1);
        tg.wait("ele_textinputendiconImageButton1782727228418", ComparisonType.IS_VISIBLE);
        tg.click("ele_textinputendiconImageButton1782727228418", 1);
        tg.wait("ele_ForgotPasswordTextView1783329197916", ComparisonType.IS_VISIBLE);
        tg.click("ele_ForgotPasswordTextView1783329197916", 1);
        tg.wait("ele_EnteremailaddressEditText1782727175745", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnteremailaddressEditText1782727175745", 1);
        tg.wait("ele_EnteremailaddressEditText1782727175745", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnteremailaddressEditText1782727175745", "gautam@gnmial.com", true);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void securetest() {
        tg.openDevice();
        tg.wait("ele_EnteremailaddressEditText1782727175745", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnteremailaddressEditText1782727175745", 1);
        tg.wait("ele_EnteremailaddressEditText1782727175745", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnteremailaddressEditText1782727175745", 1);
        // [DISABLED] tg.startSecureBlock();
        tg.wait("ele_EnteremailaddressEditText1782727175745", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnteremailaddressEditText1782727175745", "gautamkumar@testgmail.com", true);
        tg.wait("ele_EnterpasswordEditText1782727214455", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnterpasswordEditText1782727214455", 1);
        tg.wait("ele_EnterpasswordEditText1782727214455", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnterpasswordEditText1782727214455", "testpassword@123", true);
        tg.wait("ele_textinputendiconImageButton1782727228418", ComparisonType.IS_VISIBLE);
        tg.click("ele_textinputendiconImageButton1782727228418", 1);
        tg.wait("ele_textinputendiconImageButton1782727228418", ComparisonType.IS_VISIBLE);
        tg.click("ele_textinputendiconImageButton1782727228418", 1);
        // [DISABLED] tg.endSecureBlock();
        tg.wait(1);
        tg.wait(1);
        tg.testFunction("CallTestFunctionCheck", new Object[] {});
        tg.wait(1);
        tg.testFunction("TestFunctionForQtestTest", new Object[] {});
        tg.wait(5);
        tg.wait(4);
        tg.wait(1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void check() {
        tg.openDevice();
        tg.wait("ele_CountriesImageView1781517742955", ComparisonType.IS_VISIBLE);
        tg.click("ele_CountriesImageView1781517742955", 1);
        tg.wait("ele_AustraliaTextView1781517746740", ComparisonType.IS_VISIBLE);
        tg.startSecureBlock();
        tg.click("ele_AustraliaTextView1781517746740", 1);
        tg.wait("ele_ivcountrybackImageView1781517751084", ComparisonType.IS_VISIBLE);
        tg.click("ele_ivcountrybackImageView1781517751084", 1);
        tg.wait("ele_AlgeriaTextView1781517755743", ComparisonType.IS_VISIBLE);
        tg.endSecureBlock();
        tg.click("ele_AlgeriaTextView1781517755743", 1);
        tg.wait("ele_ivcountrybackImageView1781517751084", ComparisonType.IS_VISIBLE);
        tg.click("ele_ivcountrybackImageView1781517751084", 1);
        tg.wait("ele_CountriesImageView1781517742955", ComparisonType.IS_VISIBLE);
        tg.click("ele_CountriesImageView1781517742955", 1);
        tg.wait("ele_AustraliaTextView1781517746740", ComparisonType.IS_VISIBLE);
        tg.startSecureBlock();
        tg.click("ele_AustraliaTextView1781517746740", 1);
        tg.wait("ele_ivcountrybackImageView1781517751084", ComparisonType.IS_VISIBLE);
        tg.click("ele_ivcountrybackImageView1781517751084", 1);
        tg.wait("ele_AlgeriaTextView1781517755743", ComparisonType.IS_VISIBLE);
        tg.endSecureBlock();
        tg.click("ele_AlgeriaTextView1781517755743", 1);
        tg.wait("ele_ivcountrybackImageView1781517751084", ComparisonType.IS_VISIBLE);
        tg.click("ele_ivcountrybackImageView1781517751084", 1);
        tg.testFunction("CallTestFunctionCheck", new Object[] {});
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void demo() {
        tg.openDevice();
        tg.wait(1);
        tg.wait(1);
        tg.wait(1);
        tg.wait(1);
        // [DISABLED] tg.wait(5);
        tg.close();
    }

    public static void calltestfunctioncheck() {
        tg.wait(1);
        tg.wait(2);
    }

    public static void testfunctionforqtesttest() {
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnteremailaddressEditText1782989341799", 1);
        tg.wait("ele_EnteremailaddressEditText1782989341799", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnteremailaddressEditText1782989341799", "calltestfunction@testfunction.io", true);
        tg.wait("ele_EnterpasswordEditText1784028263660", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnterpasswordEditText1784028263660", 1);
        tg.wait("ele_EnterpasswordEditText1784028263660", ComparisonType.IS_VISIBLE, 4);
        tg.type("ele_EnterpasswordEditText1784028263660", "pass4TG$", true);
    }
}
