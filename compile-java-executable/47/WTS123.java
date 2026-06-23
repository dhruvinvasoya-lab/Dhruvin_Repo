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
public class WTS123 {

    public static String var_ra_Rs4 = "ujm";

    public static String var_ra_Rs3 = "tgb";

    public static int var_V1 = 100;

    public static String var_ra_RS2 = "qwe";

    public static String var_ra_RS1 = "XYZ";

    public static String var_S1 = "ABC";

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void jtest() {
        tg.openBrowser();
        JSONObject var_S1 = (JSONObject) tg.testFunction("JFunction", new Object[] { var_ra_RS1, var_ra_RS2 });
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void newtest() {
        tg.openBrowser();
        int var_S1 = (int) tg.testFunction("F2", new Object[] { var_V1 });
        tg.printLogs(var_S1);
        tg.printLogs(var_V1);
        // [DISABLED] String var_S1 = (String) tg.testFunction("RNP2", new Object[]{var_ra_RS1, var_ra_RS2, var_V1});
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void rnp() {
        tg.openBrowser();
        tg.wait(5);
        int var_in1 = 10;
        // [DISABLED] var_S1 = (int) tg.testFunction("F2", new Object[]{var_V1});
        tg.printLogs(var_S1);
        tg.type("ele_firstname112", var_S1);
        int var_v123 = 100;
        tg.writeToCSV("var_ra_RS1", var_ra_RS1, var_ra_RS1);
        // [DISABLED] tg.writeToCSV("var_ra_RS2", var_ra_RS2, "sdgvds");
        // [DISABLED] tg.writeToCSV("var_ra_Rs3", var_ra_Rs3, "gterge");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void rnpsdcsdc() {
        tg.openBrowser();
        int var_in1234 = 500;
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void namenumberboth() {
        tg.openBrowser();
        tg.printLogs(var_S1);
        tg.printLogs(var_S1);
        var_S1 = (String) tg.testFunction("RNP2", new Object[] { var_ra_RS1, var_ra_RS2, var_V1 });
        tg.printLogs(var_S1);
        tg.close();
    }

    public static Object f123(String Fname, String Lname) {
        String var_TGReturn = "";
        // [DISABLED] tg.customScriptStart();
        // [DISABLED] System.out.println(“Firstname” + Fname);
        // [DISABLED] System.out.println(“Lastname” + Lname);
        // [DISABLED] tg.customScriptEnd();
        return var_TGReturn;
    }

    public static Object f2(Integer amount) {
        int var_TGReturn = 0;
        tg.customScriptStart();
        //System.out.println("FName " + FirstName);
        // System.out.println("LName " + LastName);
        var_TGReturn = amount;
        System.out.println(amount);
        // var_TGReturn = FirstName + " " + LastName;
        // System.out.println("Full Name " + var_TGReturn);
        tg.customScriptEnd();
        return var_TGReturn;
    }

    public static Object f2mohitcopy(Integer amount) {
        int var_TGReturn = 0;
        tg.customScriptStart();
        //System.out.println("FName " + FirstName);
        // System.out.println("LName " + LastName);
        var_TGReturn = amount;
        System.out.println(amount);
        // var_TGReturn = FirstName + " " + LastName;
        // System.out.println("Full Name " + var_TGReturn);
        tg.customScriptEnd();
        return var_TGReturn;
    }

    public static void ff01() {
    }

    public static void j00() {
        var_S1 = (String) tg.testFunction("RNP2", new Object[] { var_ra_RS1, var_ra_RS2, var_V1 });
    }

    public static Object rnp2(String FirstName, String LastName, Integer amount) {
        String var_TGReturn = "";
        tg.customScriptStart();
        System.out.println("FName " + FirstName);
        System.out.println("LName " + LastName);
        var_TGReturn = FirstName + " " + LastName + " " + amount;
        System.out.println("Full Name " + var_TGReturn);
        tg.customScriptEnd();
        return var_TGReturn;
    }

    public static Object rnp2m(String FirstName, String LastName, Integer amount) {
        String var_TGReturn = "";
        tg.customScriptStart();
        System.out.println("FName " + FirstName);
        System.out.println("LName " + LastName);
        var_TGReturn = FirstName + " " + LastName + " " + amount;
        System.out.println("Full Name " + var_TGReturn);
        tg.customScriptEnd();
        return var_TGReturn;
    }

    public static Object rnpcopy(String FirstName, String LastName, Integer amount) {
        String var_TGReturn = "";
        tg.customScriptStart();
        System.out.println("FName " + FirstName);
        System.out.println("LName " + LastName);
        var_TGReturn = FirstName + " " + LastName + " " + amount;
        System.out.println("Full Name " + var_TGReturn);
        tg.customScriptEnd();
        return var_TGReturn;
    }

    public static Object rnpmohit(String FirstName, String LastName, Integer amount) {
        String var_TGReturn = "";
        tg.customScriptStart();
        System.out.println("FName " + FirstName);
        System.out.println("LName " + LastName);
        var_TGReturn = FirstName + " " + LastName + " " + amount;
        System.out.println("Full Name " + var_TGReturn);
        tg.customScriptEnd();
        return var_TGReturn;
    }

    public static void tf0001() {
    }

    public static void tfm01() {
        int var_S1 = (int) tg.testFunction("F2", new Object[] { var_V1 });
        tg.printLogs(var_S1);
        tg.printLogs(var_V1);
        // [DISABLED] String var_S1 = (String) tg.testFunction("RNP2", new Object[]{var_ra_RS1, var_ra_RS2, var_V1});
    }

    public static void convertfunction() {
        tg.wait(5);
        int var_in1 = 10;
        int var_S1 = (int) tg.testFunction("F2", new Object[] { var_V1 });
        tg.printLogs(var_S1);
        tg.type("ele_firstname112", var_S1);
    }
}
