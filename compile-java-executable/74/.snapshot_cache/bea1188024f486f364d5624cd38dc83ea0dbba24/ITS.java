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
public class ITS {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void rnp() {
        tg.openDevice();
        tg.wait(5);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tcmanual1() {
        tg.openDevice();
        tg.wait(1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void dsc324234234() {
        tg.openDevice();
        tg.click("ele_address1794548381938", 1);
        tg.wait("ele_address1794548388981", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_address1794548388981", 1);
        tg.wait("ele_address1794548394130", ComparisonType.IS_VISIBLE, 30);
        tg.type("ele_address1794548394130", "http://192.168.88.44:8000/Demo", false);
        tg.click("ele_go1794548400855", 1);
        tg.click("ele_togglenavigation1794548438549", 1);
        tg.wait("ele_about1794548446441", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_about1794548446441", 1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void test_case_1794543904() {
        tg.openDevice();
        tg.wait("ele_fieldfullname1794544058011", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_fieldfullname1794544058011", 1);
        tg.type("ele_fieldfullname1794544058011", "DemoFull", false);
        tg.wait(2);
        tg.click("ele_fieldfirstname1794544076128", 1);
        tg.type("ele_fieldfirstname1794544076128", "DemoFirst", false);
        tg.wait("ele_done1794544089540", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_done1794544089540", 1);
        tg.wait("ele_clear1794544102392", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_clear1794544102392", 1);
        tg.wait("ele_controls1794544108932", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_controls1794544108932", 1);
        tg.wait("ele_male1794544119816", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_female1794544122152", 1);
        tg.wait("ele_screens1794544126498", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_screens1794544126498", 1);
        tg.wait("ele_openmodalsheet1794544136733", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_openmodalsheet1794544136733", 1);
        tg.wait("ele_close1794544155698", ComparisonType.IS_VISIBLE, 30);
        tg.swipe(Direction.DOWN);
        tg.wait("ele_opendetailscreen1794544167579", ComparisonType.IS_VISIBLE, 30);
        tg.wait(2);
        tg.click("ele_opendetailscreen1794544167579", 1);
        tg.wait("ele_pushanotherscreen1794544182530", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_pushanotherscreen1794544182530", 1);
        tg.wait("ele_nesteddetail1794544190874", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_detailscreen1794544192016", 1);
        tg.wait("ele_detailscreen1794544199371", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_screens1794544201639", 1);
        tg.wait(2);
        tg.click("ele_form1794544215138", 1);
        tg.wait("ele_form1794544227867", ComparisonType.IS_VISIBLE, 30);
        tg.check.isVisible("ele_form1794544227867");
        tg.close();
    }
}
