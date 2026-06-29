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
public class Androiddata {

    public static JSONObject var_upjson = new JSONObject();

    public static JSONObject var_JSONG = new JSONObject();

    public static Double var_ra_DBR = 60.60;

    public static Double var_DBdata = 50.50;

    public static int var_ra_TotalR = 60;

    public static int var_Totaldata = 50;

    public static String var_FullName = "upendra Goswami";

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void ur() {
        tg.openDevice();
        tg.wait(5);
        var_FullName = (String) tg.testFunction("TF01", new Object[] { "upen", "goswami" });
        tg.wait(5);
        tg.printLogs(var_FullName);
        tg.wait(5);
        int var_ValueL = 0;
        var_ValueL = tg.saveToVariable(40, var_ValueL);
        var_ValueL = (int) tg.testFunction("TF02", new Object[] { var_ra_TotalR, var_ra_TotalR });
        tg.printLogs(var_ra_TotalR);
        tg.printLogs(var_ValueL);
        tg.wait(5);
        var_ra_DBR = (double) tg.testFunction("TF03", new Object[] { var_DBdata, var_DBdata });
        tg.wait(1);
        tg.printLogs(var_DBdata);
        tg.wait(1);
        tg.printLogs(var_ra_DBR);
        var_upjson = tg.getJsonData("https://qainofc2.testgrid.io/s/csv-to-json/20260610/Z6W2jS.json");
        var_upjson = (JSONObject) tg.testFunction("TF05", new Object[] { var_upjson, var_FullName });
        // [DISABLED] tg.printLogs(var_JSONG);
        tg.wait(1);
        tg.printLogs(var_upjson);
        tg.wait("ele_EnteremailaddressEditText1781004199257", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnteremailaddressEditText1781004199257", 1);
        tg.wait("ele_EnteremailaddressEditText1781004199257", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnteremailaddressEditText1781004199257", var_ra_TotalR, true);
        tg.wait(1);
        tg.type("ele_EnteremailaddressEditText1781004199257", var_FullName, true);
        tg.wait(1);
        tg.type("ele_EnteremailaddressEditText1781004199257", var_DBdata, true);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void urj() {
        tg.openDevice();
        tg.wait(5);
        var_upjson = tg.getJsonData("https://qainofc2.testgrid.io/s/csv-to-json/20260610/Z6W2jS.json");
        var_upjson = (JSONObject) tg.testFunction("TF05", new Object[] { var_FullName, var_FullName });
        // [DISABLED] tg.printLogs(var_JSONG);
        tg.wait(1);
        tg.printLogs(var_upjson);
        tg.wait(1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void upen() {
        tg.openDevice();
        tg.wait(5);
        var_FullName = (String) tg.testFunction("TF01", new Object[] { "upen", "goswami" });
        tg.wait(5);
        tg.printLogs(var_FullName);
        tg.wait(5);
        var_Totaldata = (int) tg.testFunction("TF02", new Object[] { var_ra_TotalR, var_ra_TotalR });
        tg.printLogs(var_ra_TotalR);
        tg.printLogs(var_Totaldata);
        tg.wait(5);
        var_ra_DBR = (double) tg.testFunction("TF03", new Object[] { var_DBdata, var_DBdata });
        tg.wait(1);
        int var_ValueL = 0;
        var_ValueL = tg.saveToVariable(40, var_ValueL);
        tg.printLogs(var_DBdata);
        tg.wait(1);
        tg.printLogs(var_ra_DBR);
        var_JSONG = (JSONObject) tg.testFunction("TF05", new Object[] { var_FullName, var_FullName });
        tg.printLogs(var_JSONG);
        tg.wait("ele_EnteremailaddressEditText1781004199257", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnteremailaddressEditText1781004199257", 1);
        tg.wait("ele_EnteremailaddressEditText1781004199257", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnteremailaddressEditText1781004199257", var_ra_TotalR, true);
        tg.wait(1);
        tg.type("ele_EnteremailaddressEditText1781004199257", var_FullName, true);
        tg.wait(1);
        tg.type("ele_EnteremailaddressEditText1781004199257", var_DBdata, true);
        var_FullName = (String) tg.testFunction("TF008", new Object[] { var_FullName, var_FullName });
        tg.printLogs(var_FullName);
        tg.close();
    }

    public static Object tf002(String Fname, String Lname) {
        String var_TGReturn = "";
        tg.wait(5);
        tg.wait(5);
        tg.wait(5);
        tg.wait(5);
        return var_TGReturn;
    }

    public static Object tf008(String FirstName, String LastName) {
        String var_TGReturn = "";
        tg.customScriptStart();
        System.out.println("FName: " + FirstName);
        System.out.println("LName: " + LastName);
        var_TGReturn = FirstName + " " + LastName;
        System.out.println("Full Name: " + var_TGReturn);
        tg.customScriptEnd();
        return var_TGReturn;
    }

    public static Object tf01(String FirstName, String LastName) {
        String var_TGReturn = "";
        tg.customScriptStart();
        System.out.println("FName: " + FirstName);
        System.out.println("LName: " + LastName);
        var_TGReturn = FirstName + " " + LastName;
        System.out.println("Full Name: " + var_TGReturn);
        tg.customScriptEnd();
        return var_TGReturn;
    }

    public static Object tf02(Integer up, Integer upen) {
        int var_TGReturn = 0;
        tg.customScriptStart();
        System.out.println("U " + up);
        System.out.println("UP " + upen);
        var_TGReturn = up + upen;
        System.out.println("Total Value " + var_TGReturn);
        tg.customScriptEnd();
        return var_TGReturn;
    }

    public static Object tf03(Double DB1, Double DB2) {
        Double var_TGReturn = 0.00;
        tg.customScriptStart();
        System.out.println("D " + DB1);
        System.out.println("D1 " + DB2);
        var_TGReturn = DB1 + DB2;
        System.out.println("Total Value " + var_TGReturn);
        tg.customScriptEnd();
        return var_TGReturn;
    }

    public static Object tf04(String FName, String LName) {
        String var_TGReturn = "";
        tg.customScriptStart();
        System.out.println("FName " + FName);
        System.out.println("LName " + LName);
        var_TGReturn = FName + " " + LName;
        System.out.println("Full Name " + var_TGReturn);
        tg.customScriptEnd();
        return var_TGReturn;
    }

    public static Object tf05(String First, String Last) {
        JSONObject var_TGReturn = tg.getJsonData("");
        tg.customScriptStart();
        System.out.println("First Name : " + First);
        System.out.println("Last Name  : " + Last);
        var_TGReturn.put("FirstName", First);
        var_TGReturn.put("LastName", Last);
        var_TGReturn.put("FullName", First + " " + Last);
        var_TGReturn.put("Status", "Success");
        System.out.println("JSON Response : " + var_TGReturn.toString());
        tg.customScriptEnd();
        return var_TGReturn;
    }

    public static void tf07_copy() {
        tg.wait(5);
        var_FullName = (String) tg.testFunction("TF01", new Object[] { "upen", "goswami" });
        tg.wait(5);
        tg.printLogs(var_FullName);
        tg.wait(5);
        int var_ValueL = 0;
        var_ValueL = tg.saveToVariable(40, var_ValueL);
        var_ValueL = (int) tg.testFunction("TF02", new Object[] { var_ra_TotalR, var_ra_TotalR });
        tg.printLogs(var_ra_TotalR);
        tg.printLogs(var_ValueL);
        tg.wait(5);
        var_ra_DBR = (double) tg.testFunction("TF03", new Object[] { var_DBdata, var_DBdata });
        tg.wait(1);
        tg.printLogs(var_DBdata);
        tg.wait(1);
        tg.printLogs(var_ra_DBR);
        var_JSONG = (JSONObject) tg.testFunction("TF05", new Object[] { var_FullName, var_FullName });
        tg.printLogs(var_JSONG);
        tg.wait("ele_EnteremailaddressEditText1781004199257", ComparisonType.IS_VISIBLE);
        tg.click("ele_EnteremailaddressEditText1781004199257", 1);
        tg.wait("ele_EnteremailaddressEditText1781004199257", ComparisonType.IS_VISIBLE);
        tg.type("ele_EnteremailaddressEditText1781004199257", var_ra_TotalR, true);
        tg.wait(1);
        tg.type("ele_EnteremailaddressEditText1781004199257", var_FullName, true);
        tg.wait(1);
        tg.type("ele_EnteremailaddressEditText1781004199257", var_DBdata, true);
    }

    public static void testdataf_copy() {
    }
}
