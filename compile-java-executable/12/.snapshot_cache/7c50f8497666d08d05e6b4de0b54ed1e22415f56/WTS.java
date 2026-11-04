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

@Listeners(TestListener.class)
public class WTS {

    public static String var_ra_str1231 = "DhruvinVasoya";

    public static int var_ra_var1 = 34;

    public static String var_date1 = "DATE";

    public static String var_xyz1 = "123";

    public static String var_ans1 = "Demo";

    public static int var_in2 = 20;

    public static int var_in1 = 10;

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void rnp1____() {
        tg.openBrowser();
        tg.wait(5);
        tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
        tg.wait("ele_firstname268", ComparisonType.IS_VISIBLE);
        tg.click("ele_firstname268", 1);
        tg.wait("ele_firstname268", ComparisonType.IS_VISIBLE);
        tg.type("ele_firstname268", "jhon");
        tg.wait("ele_divtgwebcomma371", ComparisonType.IS_VISIBLE);
        tg.click("ele_divtgwebcomma371", 1);
        tg.wait("ele_divtgwebcomma371", ComparisonType.IS_VISIBLE);
        tg.type("ele_divtgwebcomma371", "Doe");
        tg.openNewTab();
        tg.navigateToUrl("https://demo.automationtesting.in/Frames.html");
        tg.wait("ele_text177", ComparisonType.IS_VISIBLE);
        tg.click("ele_text177", 1);
        tg.wait("ele_text177", ComparisonType.IS_VISIBLE);
        tg.type("ele_text177", "single");
        // [DISABLED] tg.wait("ele_close258", ComparisonType.IS_VISIBLE);
        // [DISABLED] tg.click("ele_close258", 1);
        tg.wait("ele_iframewith041", ComparisonType.IS_VISIBLE);
        tg.click("ele_iframewith041", 1);
        tg.wait("ele_text086", ComparisonType.IS_VISIBLE);
        tg.type("ele_text086", "nested");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void stingutility() {
        tg.openBrowser();
        String var_dt = "Null";
        String var_strone = "Kartik";
        String var_strtwo = "M-a-k,w,ana";
        String var_strthree = "Null";
        int var_one = 10;
        int var_two = 10;
        int var_three = 10;
        var_dt = tg.dateUtilities("{DATE[ADDDAYS][25.05.2026,14][dd-MM-yyyy]}");
        tg.printLogs(var_dt);
        var_strthree = tg.stringUtilities("{STRING[TOUPPER][" + var_strone + "][" + var_strtwo + "]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[TOLOWER][" + var_strone + "][" + var_strtwo + "]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[TRIM][" + var_strone + "][]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[LENGTH][" + var_strone + "][]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[CHARAT][" + var_strone + "][2]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[SUBSTRING][" + var_strone + "][2,3]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[INDEXOF][" + var_strone + "][tik]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[STARTSWITH][" + var_strone + "][K]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[ENDSWITH][" + var_strone + "][k]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[REPLACE][" + var_strone + "][Kartik,Hiii]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[SPLIT][" + var_strtwo + "][-]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[CONCAT][" + var_strtwo + "]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[COMPARE][" + var_strone + ",Kartik][]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[COMPAREIGNORECASE][" + var_strone + "][kartik]}");
        tg.printLogs(var_strthree);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void allaction() {
        tg.openBrowser();
        tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
        tg.pageLoadStart("Page1");
        tg.wait("ele_Register", ComparisonType.IS_VISIBLE);
        tg.click("ele_input186", 1);
        tg.type("ele_input186", "Jhon");
        tg.click("ele_input239", 1);
        tg.type("ele_input239", "Doe");
        tg.pageLoadEnd("Page1");
        tg.click("ele_textarea097", 1);
        tg.type("ele_textarea097", "Demo Adress");
        tg.scrollToElement("ele_submit717", Direction.DOWN);
        tg.pageLoadStart("Page2");
        tg.click("ele_Male", 1);
        tg.click("ele_Cricket", 1);
        tg.click("ele_Languages", 1);
        tg.click("ele_arabic", 1);
        tg.click("ele_Tap", 1);
        tg.click("ele_firstp", 1);
        tg.type("ele_firstp", "+C8ViEFemQtayJOMEcXvuw==:MTIzNDU2Nzg5MTAxMTEyMQ==");
        tg.pageLoadEnd("Page2");
        tg.click("ele_secondpassword1", 1);
        tg.type("ele_secondpassword1", "+C8ViEFemQtayJOMEcXvuw==:MTIzNDU2Nzg5MTAxMTEyMQ==");
        tg.click("ele_submit717", 1);
        tg.openNewTab();
        tg.wait(5);
        tg.customScriptStart();
        driver.get("https://demo.automationtesting.in/Frames.html");
        tg.customScriptEnd();
        // tg.navigateToUrl("https:demo.automationtesting.in/Frames.html");
        tg.switchToTab(0);
        tg.takeFullScreenshot();
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void amazon() {
        tg.openBrowser();
        tg.navigateToUrl("https://www.amazon.in/");
        tg.pageLoadStart("Amazon");
        tg.wait("ele_i881", ComparisonType.IS_VISIBLE);
        tg.click("ele_i881", 1);
        tg.wait("ele_bestseller423", ComparisonType.IS_VISIBLE);
        tg.click("ele_bestseller423", 1);
        tg.pageLoadEnd("Amazon");
        tg.networkAssert("Amazon");
        String var_V1 = "abc";
        int var_V2 = 10;
        Double var_V3 = 10.0;
        JSONObject var_V4 = tg.getJsonData("{}");
        tg.readFromAPI("req_api.json", var_V1, var_V2, var_V3, var_V4);
        tg.printLogs(var_V1);
        tg.printLogs(var_V2);
        tg.printLogs(var_V3);
        tg.printLogs(var_V4);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void declare() {
        tg.openBrowser();
        tg.navigateToUrl("https://letcode.in/forms");
        tg.wait("ele_Form", ComparisonType.IS_VISIBLE);
        int var_count = 1;
        var_count = tg.saveToVariable(1, var_count);
        while (tg.verify.isLessThanOrEqualTo(var_count, 2)) {
            tg.declare("ele_name", "(//input[@id='firstname']", var_count);
            tg.click("ele_textinput280", 1);
            tg.type("ele_textinput280", "Jhon");
            var_count = tg.increments(var_count, 1);
        }
        tg.clearNetworkLog();
        tg.scrollToElement("ele_firstname211", Direction.DOWN);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void performcalculationsnewkeyword() {
        tg.openBrowser();
        String var_date = "DATE";
        String var_ans = "ans";
        String var_abc = "abc";
        int var_a = 2;
        int var_b = 4;
        int var_c = 6;
        var_ans1 = tg.stringUtilities("{STRING[CHARAT][" + var_ra_str1231 + "][4]}");
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
    public void select() {
        tg.openBrowser();
        tg.navigateToUrl("https://rahulshettyacademy.com/AutomationPractice/");
        tg.wait("ele_PracticePage", ComparisonType.IS_VISIBLE);
        tg.selectDropdownByIndex("ele_SelectOption1Option2Option3", 1);
        tg.scrollToElement("ele_mousehover377", Direction.DOWN);
        tg.hoverOverElement("ele_mousehover377");
        tg.wait(5);
        tg.swipe("ele_PracticePage", Direction.DOWN);
        if (tg.performAssert("ele_alertbtn1", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_alertbtn1", 1);
        } else {
            tg.swipe("ele_PracticePage", Direction.DOWN);
        }
        // This is demo comment
        tg.controlPlusClick("ele_Home");
        tg.performDoubleClick("ele_checkBoxOption11");
        tg.performRightClick("ele_confirmbtn1");
        tg.printLogs("ele_MouseHover");
        tg.tapByImage("ele_myre", 0.5);
        tg.setBrowserResolution("800", "600");
        String var_V1 = "Demo";
        var_V1 = tg.saveToVariable(var_V1, "capability", "browserName");
        tg.printLogs(var_V1);
        String var_V2 = "Demo1";
        var_V2 = tg.saveToVariable(var_V2, "regex", "[a-fA-F0-9]{2,15}");
        tg.printLogs(var_V2);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tdm2() {
        tg.openBrowser();
        tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
        tg.wait("ele_Register", ComparisonType.IS_VISIBLE);
        JSONObject var_Data = tg.getJsonData("https://poc30.testgrid.io/s/csv-to-json/20261104/YQbyh8.json");
        int var_count = 0;
        var_count = tg.saveToVariable(0, var_count);
        String var_v1 = "Null";
        String var_v2 = "Null";
        while (tg.verify.isLessThan(var_count, 2)) {
            tg.startSecureBlock();
            var_v1 = tg.saveToVariable(var_v1, var_Data, "$.records[" + var_count + "].First");
            tg.wait("ele_firstname110", ComparisonType.IS_VISIBLE);
            tg.type("ele_firstname110", var_v1);
            tg.wait(2);
            tg.wait("ele_LastName", ComparisonType.IS_VISIBLE);
            tg.endSecureBlock();
            var_v2 = tg.saveToVariable(var_v2, var_Data, "$.records[" + var_count + "].Last");
            tg.type("ele_LastName", var_v2);
            var_count = tg.increments(var_count, 1);
        }
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void writetocsv() {
        tg.openBrowser();
        tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
        tg.wait("ele_Register", ComparisonType.IS_VISIBLE);
        tg.check.isVisible("ele_FirstName");
        tg.check.isVisible("ele_LastName");
        tg.startSecureBlock();
        tg.type("ele_FirstName", "#TGITVAR.First");
        tg.type("ele_LastName", "#TGITVAR.Last");
        String var_FName = "FirstName";
        String var_LName = "LastName";
        tg.endSecureBlock();
        tg.writeToCSV("var_FName", var_FName, "");
        tg.writeToCSV("var_LName", var_LName, "");
        tg.close();
    }

    public static void valuecheck() {
        tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
        tg.wait("ele_Register", ComparisonType.IS_VISIBLE);
        int var_count = 5;
        tg.check.isEqualTo(var_count, 5);
        tg.check.isNotEqualTo(var_count, 3);
        tg.check.isGreaterThanOrEqualTo(var_count, 4);
        tg.check.isLessThanOrEqualTo(var_count, 7);
        tg.check.isGreaterThan(var_count, 1);
        tg.check.isLessThan(var_count, 6);
    }
}
