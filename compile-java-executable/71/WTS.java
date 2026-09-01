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
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class WTS {

    public static String var_ra_str123 = "DhruvinVasoya";

    public static int var_ra_var1 = 34;

    public static String var_date1 = "DATE";

    public static String var_xyz1 = "123";

    public static String var_ans1 = "Demo";

    public static int var_in2 = 20;

    public static int var_in1 = 10;

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void performcalculationsnewkeyword() {
        tg.openBrowser();
        String var_date = "DATE";
        String var_ans = "ans";
        String var_abc = "abc";
        int var_a = 2;
        int var_b = 4;
        int var_c = 6;
        var_ans1 = tg.stringUtilities("{STRING[CHARAT][" + var_ra_str123 + "][4]}");
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_a + " + " + var_b + " * " + var_c + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[(" + var_a + " + " + var_b + ") * " + var_c + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_b + " / " + var_a + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_c + " % " + var_a + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_b + " > " + var_a + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_b + " == " + var_a + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_a + " != " + var_b + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_b + " && " + var_a + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_a + " || " + var_b + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[!" + var_a + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_a + " > " + var_b + " && " + var_c + " > " + var_a + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_a + " & " + var_b + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_a + " | " + var_b + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_a + " ^ " + var_b + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[~" + var_a + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_b + " << " + var_a + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_a + " >> " + var_b + "]}").toString();
        tg.printLogs(var_ans1);
        tg.writeToCSV("var_ans1", var_ans1, "");
        tg.type("ele_firstname268", var_ans1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void test2() {
        tg.openBrowser();
        String var_date = "DATE";
        String var_ans = "ans";
        String var_abc = "abc";
        int var_a = 2;
        int var_b = 4;
        int var_c = 6;
        var_ans1 = tg.stringUtilities("{STRING[CHARAT][" + var_ra_str123 + "][4]}");
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_a + " + " + var_b + " * " + var_c + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[(" + var_a + " + " + var_b + ") * " + var_c + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_b + " / " + var_a + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_c + " % " + var_a + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_b + " > " + var_a + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_b + " == " + var_a + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_a + " != " + var_b + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_b + " && " + var_a + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_a + " || " + var_b + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[!" + var_a + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_a + " > " + var_b + " && " + var_c + " > " + var_a + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_a + " & " + var_b + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_a + " | " + var_b + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_a + " ^ " + var_b + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[~" + var_a + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_b + " << " + var_a + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_a + " >> " + var_b + "]}").toString();
        tg.printLogs(var_ans1);
        tg.writeToCSV("var_ans1", var_ans1, "");
        tg.type("ele_firstname268", var_ans1);
        tg.close();
    }
}
