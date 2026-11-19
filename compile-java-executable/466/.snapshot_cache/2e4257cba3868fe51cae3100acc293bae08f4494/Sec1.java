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
public class Sec1 {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    @XrayTest(key = "TES-3")
    public void netwassert1() {
        tg.openDevice();
        tg.alertButton("OK");
        tg.alertButton("Allow");
        tg.wait("ele_mainmenurefreshTextView1795070617273", ComparisonType.IS_VISIBLE);
        tg.click("ele_mainmenurefreshTextView1795070617273", 1);
        tg.wait("ele_mainmenusearchcityTextView1795070621615", ComparisonType.IS_VISIBLE);
        tg.click("ele_mainmenusearchcityTextView1795070621615", 1);
        tg.wait("ele_LondonTextView1795070627511", ComparisonType.IS_VISIBLE);
        tg.click("ele_LondonTextView1795070627511", 1);
        tg.networkAssert("CallAPI");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tcsearchwithanemptylocationfield() {
        tg.openDevice();
        tg.wait(1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void call_func() {
        tg.openDevice();
        tg.testFunction("webio", new Object[] {});
        tg.close();
    }

    public static void webio() {
        tg.wait("ele_WebviewTextView1795079849728", ComparisonType.IS_VISIBLE);
        tg.click("ele_WebviewTextView1795079849728", 1);
        tg.wait(1);
        tg.wait("ele_GetStarted", ComparisonType.IS_VISIBLE);
        tg.click("ele_GetStarted", 1);
        tg.wait(3);
    }
}
