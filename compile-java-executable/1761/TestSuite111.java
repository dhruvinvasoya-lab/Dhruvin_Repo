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
public class TestSuite111 {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void assd() {
        tg.openDevice();
        tg.wait(5);
        String var_v1 = "Null";
        tg.wait(45);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void rnp() {
        tg.openDevice();
        tg.wait(5);
        tg.printLogs(var_str1);
        tg.printLogs(var_ra_rint1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void rnp11() {
        tg.openDevice();
        tg.wait(5);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void rnp123654() {
        tg.openDevice();
        var_str = (String) tg.testFunction("F1", new Object[] { var_ra_rint, var_str1, var_ra_rint1 });
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void rnp12365458() {
        tg.openDevice();
        var_str = (String) tg.testFunction("F1", new Object[] { var_str1, var_str1, var_ra_rint1 });
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void rnp12365458dfg() {
        tg.openDevice();
        var_str = (String) tg.testFunction("F1", new Object[] { "dhruvin", "vasoya", 10 });
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void rnp22() {
        tg.openDevice();
        tg.wait(5);
        tg.wait(45);
        tg.wait(23);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void rnp33() {
        tg.openDevice();
        tg.wait(10);
        tg.click("ele_DoneButton1781197755153", 1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void rnp44() {
        tg.openDevice();
        tg.wait(5);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void rnp55() {
        tg.openDevice();
        tg.wait(5);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void rnpmohit1() {
        tg.openDevice();
        tg.wait("ele_SearchSearchField1781251414344", ComparisonType.IS_VISIBLE);
        tg.click("ele_SearchSearchField1781251414344", 1);
        tg.wait("ele_SearchSearchField1781251414344", ComparisonType.IS_VISIBLE);
        tg.type("ele_SearchSearchField1781251414344", "sound", true);
        tg.wait("ele_SearchButton1781251442875", ComparisonType.IS_VISIBLE);
        tg.click("ele_SearchButton1781251442875", 1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void res() {
        tg.openDevice();
        tg.swipe(Direction.DOWN);
        tg.wait("ele_alertcancelButton1781783317724", ComparisonType.IS_VISIBLE);
        tg.click("ele_alertcancelButton1781783317724", 1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void dv123546() {
        tg.openDevice();
        var_str = (String) tg.testFunction("F1", new Object[] { "dv", "as", 12 });
        tg.close();
    }

    public static Object f1(String FirstName, String LastName) {
        String var_TGReturn = "";
        tg.customScriptStart();
        System.out.println("FName " + FirstName);
        System.out.println("LName " + LastName);
        var_TGReturn = FirstName + " " + LastName;
        System.out.println("Full Name " + var_TGReturn);
        tg.customScriptEnd();
        return var_TGReturn;
    }
}
