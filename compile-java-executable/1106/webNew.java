import io.testgrid.listeners.TestListener;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;

@Listeners(TestListener.class)
public class webNew {

    @Test
public void allaction() {
    tg.openBrowser();
    tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
    tg.wait("ele_Register", ComparisonType.IS_VISIBLE);
    tg.click("ele_input186", 1);
    tg.type("ele_input186", "Jhon");
    tg.click("ele_input239", 1);
    tg.type("ele_input239", "Doe");
    tg.click("ele_textarea097", 1);
    tg.type("ele_textarea097", "Demo Adress");
    tg.scrollToElement("ele_Submit", Direction.DOWN);
    tg.click("ele_Male", 1);
    tg.click("ele_Cricket", 1);
    tg.click("ele_Languages", 1);
    tg.click("ele_arabic", 1);
    tg.click("ele_Tap", 1);
    tg.click("ele_firstp", 1);
    tg.type("ele_firstp", "+C8ViEFemQtayJOMEcXvuw==:MTIzNDU2Nzg5MTAxMTEyMQ==");
    tg.click("ele_secondpassword1", 1);
    tg.type("ele_secondpassword1", "+C8ViEFemQtayJOMEcXvuw==:MTIzNDU2Nzg5MTAxMTEyMQ==");
    tg.click("ele_Submit", 1);
    tg.openNewTab();
    tg.wait(5);
    tg.customScriptStart();
    driver.get("https://demo.automationtesting.in/Frames.html");
    tg.customScriptEnd();
    // tg.navigateToUrl("https:demo.automationtesting.in/Frames.html");
    tg.switchToTab(0);
    tg.networkAssert("Letcode");
    tg.takeScreenshot();
    tg.close();
}

    @Test
public void declare() {
    tg.openBrowser();
    tg.navigateToUrl("https://letcode.in/forms");
    tg.wait("ele_Form", ComparisonType.IS_VISIBLE);
    int var_count = 1;
    var_count = tg.saveToVariable(1, var_count);
    while (tg.verify.isLessThanOrEqualTo(var_count, 2)) {
        tg.declare("ele_name", "(//input[@class='input'])[{$}]", var_count);
        tg.click("ele_name", 1);
        tg.type("ele_name", "Jhon");
        var_count = tg.increments(var_count, 1);
    }
    tg.clearNetworkLog();
    tg.scrollToElement("ele_FirstName", Direction.DOWN);
    tg.close();
}

    @Test
public void iframe() {
    tg.openBrowser();
    tg.navigateToUrl("https://demo.automationtesting.in/Frames.html");
    tg.wait("ele_AutomationDemoSite", ComparisonType.IS_VISIBLE);
    tg.click("ele_SingleIframe", 1);
    tg.wait("ele_singleifra502", ComparisonType.IS_VISIBLE);
    tg.click("ele_singleifra502", 1);
    tg.switchToFrame("ele_pyourbrows871");
    tg.wait("ele_div824", ComparisonType.IS_VISIBLE);
    tg.click("ele_div824", 1);
    tg.wait("ele_text951", ComparisonType.IS_VISIBLE);
    tg.click("ele_text951", 1);
    tg.wait("ele_text951", ComparisonType.IS_VISIBLE);
    tg.type("ele_text951", "Demo");
    tg.switchToDefaultContent();
    tg.click("ele_IframewithinanIframe", 1);
    tg.switchToFrame("ele_pyourbrows619");
    tg.switchToFrame("ele_pyourbrows855");
    tg.wait("ele_text279", ComparisonType.IS_VISIBLE);
    tg.click("ele_text279", 1);
    tg.wait("ele_text279", ComparisonType.IS_VISIBLE);
    tg.type("ele_text279", "Demo 2");
    tg.switchToDefaultContent();
    tg.close();
}

    @Test
public void select() {
    tg.openBrowser();
    tg.navigateToUrl("https://rahulshettyacademy.com/AutomationPractice/");
    tg.wait("ele_PracticePage", ComparisonType.IS_VISIBLE);
    tg.selectDropdownByIndex("ele_SelectOption1Option2Option3", 1);
    tg.scrollToElement("ele_MouseHover", Direction.DOWN);
    tg.hoverOverElement("ele_MouseHover");
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
    tg.tapByImage("ele_Home", 0.65);
    tg.close();
}

    @Test
public void tdm2() {
    tg.openBrowser();
    tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
    tg.wait("ele_Register", ComparisonType.IS_VISIBLE);
    JSONObject var_Data = tg.getJsonData("https://demo.testgrid.io/s/csv-to-json/20250806/uxil9M.json");
    int var_count = 0;
    var_count = tg.saveToVariable(0, var_count);
    String var_v1 = "Null";
    String var_v2 = "Null";
    while (tg.verify.isLessThan(var_count, 2)) {
        var_v1 = tg.saveToVariable(var_v1, var_Data, "$.records[" + var_count + "].FirstName");
        tg.wait("ele_firstname110", ComparisonType.IS_VISIBLE);
        tg.type("ele_firstname110", var_v1);
        tg.wait(2);
        tg.wait("ele_LastName", ComparisonType.IS_VISIBLE);
        var_v2 = tg.saveToVariable(var_v2, var_Data, "$.records[" + var_count + "].LastName");
        tg.type("ele_LastName", var_v2);
        var_count = tg.increments(var_count, 1);
    }
    tg.close();
}

    @Test
public void writetocsv() {
    tg.openBrowser();
    tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
    tg.wait("ele_Register", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_FirstName");
    tg.check.isVisible("ele_LastName");
    tg.type("ele_FirstName", "#TGITVAR.FirstName");
    tg.type("ele_LastName", "#TGITVAR.LastName");
    String var_FName = "FirstName";
    String var_LName = "LastName";
    tg.writeToCSV("var_FName", var_FName, "");
    tg.writeToCSV("var_LName", var_LName, "");
    tg.close();
}

    @Test
public void writetocsvtgit01() {
    tg.openBrowser();
    tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
    tg.wait("ele_Register", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_FirstName");
    tg.check.isVisible("ele_LastName");
    tg.type("ele_FirstName", "John");
    tg.type("ele_LastName", "Doe");
    String var_FName = "FirstName";
    String var_LName = "LastName";
    tg.writeToCSV("var_FName", var_FName, "");
    tg.writeToCSV("var_LName", var_LName, "");
    tg.close();
}

    @Test
public void writetocsvtgit02() {
    tg.openBrowser();
    tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
    tg.wait("ele_Register", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_FirstName");
    tg.check.isVisible("ele_LastName");
    tg.type("ele_FirstName", "Mark");
    tg.type("ele_LastName", "Peater");
    String var_FName = "FirstName";
    String var_LName = "LastName";
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
