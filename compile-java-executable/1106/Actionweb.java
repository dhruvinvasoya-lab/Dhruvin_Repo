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
public class Actionweb {

    @Test
public void allaction() {
    tg.openBrowser();
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
    tg.navigateToUrl("https://demo.automationtesting.in/Frames.html");
    tg.switchToTab(0);
    tg.switchToFrame("ele_pYourbrowserdoesnotsupportiframesp");
    tg.switchToParentFrame();
    tg.click("ele_IframewithinanIframe", 1);
    tg.switchToFrame("ele_NestediFrames");
    tg.switchToFrame("ele_ifram2");
    tg.click("ele_Inputboxifram");
    tg.type("ele_Inputboxifram", "Demo");
    tg.navigateToUrl("https://demo.automationtesting.in/Frames.html");
    tg.switchToTab(0);
    tg.switchToFrame("ele_pYourbrowserdoesnotsupportiframesp");
    tg.switchToParentFrame();
    tg.click("ele_IframewithinanIframe", 1);
    tg.switchToFrame("ele_NestediFrames");
    tg.switchToFrame("ele_ifram2");
    tg.click("ele_Inputboxifram");
    tg.type("ele_Inputboxifram", "Demo");
    tg.pressKey(ARROW_LEFT, 2);
    // This is demo comment
    tg.takeScreenshot();
    tg.close();
}

    @Test
public void declare() {
    tg.openBrowser();
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
    tg.close();
}

    @Test
public void writetocsv() {
    tg.openBrowser();
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
