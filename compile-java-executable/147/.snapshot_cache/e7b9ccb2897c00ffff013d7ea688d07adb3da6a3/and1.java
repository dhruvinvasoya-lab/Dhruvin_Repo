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
public class and1 {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void weather() {
        tg.openDevice();
        tg.wait(5);
        tg.wait(5);
        tg.wait("ele_mainmenurefreshTextView1788169786082", ComparisonType.IS_VISIBLE);
        tg.click("ele_mainmenurefreshTextView1788169786082", 1);
        tg.check.isInvisible("ele_mainmenurefreshTextView1788169786082");
        tg.wait("ele_OpennavigationdrawerImageButton1788169794160", ComparisonType.IS_VISIBLE);
        tg.click("ele_OpennavigationdrawerImageButton1788169794160", 1);
        tg.wait("ele_CurrentWeatherCheckedTextView1788169797194", ComparisonType.IS_VISIBLE);
        tg.click("ele_CurrentWeatherCheckedTextView1788169797194", 1);
        tg.close();
    }
}
