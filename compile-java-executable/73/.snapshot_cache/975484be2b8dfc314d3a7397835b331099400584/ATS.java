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
public class ATS {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void countries() {
        tg.openDevice();
        tg.click("ele_btncountry1794542100819", 1);
        tg.wait("ele_search1794542107198", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_search1794542107198", 1);
        tg.wait("ele_search1794542113837", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_search1794542113837", 1);
        tg.type("ele_search1794542113837", "India", false);
        tg.click("ele_cardmain1794542124126", 1);
        tg.wait("ele_back1794542131643", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_back1794542131643", 1);
        tg.wait("ele_back1794542131643", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_back1794542131643", 1);
        tg.customScriptStart();
        /* CoTester: swipe "Countries, Wonders of the world, Continents…" down */
        {
            org.openqa.selenium.Rectangle tgR = driver.findElement(org.openqa.selenium.By.xpath("//android.widget.ScrollView[@resource-id=\"ru.androidtools.countries_of_the_world:id/include_main\"]")).getRect();
            org.openqa.selenium.interactions.PointerInput tgF = new org.openqa.selenium.interactions.PointerInput(org.openqa.selenium.interactions.PointerInput.Kind.TOUCH, "finger");
            org.openqa.selenium.interactions.Sequence tgS = new org.openqa.selenium.interactions.Sequence(tgF, 1);
            tgS.addAction(tgF.createPointerMove(java.time.Duration.ZERO, org.openqa.selenium.interactions.PointerInput.Origin.viewport(), tgR.getX() + (int) (tgR.getWidth() * 0.5), tgR.getY() + (int) (tgR.getHeight() * 0.2)));
            tgS.addAction(tgF.createPointerDown(0));
            tgS.addAction(new org.openqa.selenium.interactions.Pause(tgF, java.time.Duration.ofMillis(150)));
            tgS.addAction(tgF.createPointerMove(java.time.Duration.ofMillis(400), org.openqa.selenium.interactions.PointerInput.Origin.viewport(), tgR.getX() + (int) (tgR.getWidth() * 0.5), tgR.getY() + (int) (tgR.getHeight() * 0.8)));
            tgS.addAction(new org.openqa.selenium.interactions.Pause(tgF, java.time.Duration.ofMillis(200)));
            tgS.addAction(tgF.createPointerUp(0));
            ((org.openqa.selenium.interactions.Interactive) driver).perform(java.util.Arrays.asList(tgS));
        }
        tg.customScriptEnd();
        tg.click("ele_btngame1794542155479", 1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tcmanual1() {
        tg.openDevice();
        tg.wait(1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void test_case_1794540470() {
        tg.openDevice();
        // [DISABLED] tg.wait("ele_ok1794540178453", ComparisonType.IS_VISIBLE, 30);
        // [DISABLED] tg.click("ele_ok1794540178453", 1);
        tg.wait("ele_wind00ms1794540202044", ComparisonType.IS_VISIBLE, 30);
        tg.swipe(Direction.DOWN);
        tg.wait("ele_update1794540211657", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_update1794540211657", 1);
        tg.wait("ele_searchcity1794540231317", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_searchcity1794540231317", 1);
        tg.wait("ele_searchlocation1794540237490", ComparisonType.IS_VISIBLE, 30);
        tg.type("ele_searchlocation1794540237490", "Mumbai", false);
        tg.wait("ele_in1794540643512", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_in1794540643512", 1);
        tg.wait("ele_opennavigationdrawer1794540665580", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_opennavigationdrawer1794540665580", 1);
        tg.wait("ele_graphs1794540673303", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_graphs1794540673303", 1);
        tg.swipe(Direction.UP);
        tg.swipe(Direction.DOWN);
        tg.wait("ele_moreoptions1794540694842", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_moreoptions1794540694842", 1);
        tg.wait("ele_togglevalues1794540706261", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_togglevalues1794540706261", 1);
        tg.wait("ele_opennavigationdrawer1794540665580", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_opennavigationdrawer1794540665580", 1);
        tg.wait("ele_settings1794540726278", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_settings1794540726278", 1);
        tg.wait("ele_generalsettings1794540735920", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_generalsettings1794540735920", 1);
        tg.check.isVisible("ele_generalsettings1794540788597");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void test_case_1794545834() {
        tg.openDevice();
        tg.click("ele_19216888124demo1794547977171", 1);
        tg.type("ele_19216888124demo1794547977171", "http://192.168.88.44:8000/Demo", true);
        tg.click("ele_19216888124demo1794547977171", 1);
        tg.wait(2);
        tg.click("92%WIDTH,90%HEIGHT", 1);
        tg.click("ele_togglenavigation1794548060455", 1);
        tg.wait("ele_about1794548067626", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_about1794548067626", 1);
        tg.close();
    }
}
