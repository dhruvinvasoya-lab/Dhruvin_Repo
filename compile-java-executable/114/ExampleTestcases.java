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
import org.openqa.selenium.*;
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;

@Listeners(TestListener.class)
public class ExampleTestcases {

    @Test
public void tc001typein() {
    tg.openBrowser();
    tg.wait(5);
    tg.swipe(Direction.UP);
    tg.click("ele_CardElements");
    tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
    tg.click("ele_MenuTextBox");
    tg.wait("ele_TextBoxuserName", ComparisonType.IS_VISIBLE);
    tg.type("ele_TextBoxuserName", "Test1");
    String var_Email = "";
    var_Email = tg.saveToVariable("test@test.com", var_Email);
    tg.type("ele_TextBoxEmail", var_Email);
    tg.wait(5);
    tg.close();
}

    @Test
public void tc002waitfor() {
    tg.openBrowser();
    tg.wait(5);
    tg.swipe(Direction.UP);
    tg.click("ele_CardElements");
    tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
    tg.click("ele_MenuTextBox");
    tg.wait("ele_TextBoxuserName", ComparisonType.IS_VISIBLE);
    tg.type("ele_TextBoxuserName", "Test1");
    String var_Email = "";
    var_Email = tg.saveToVariable("test@test.com", var_Email);
    tg.type("ele_TextBoxEmail", var_Email);
    tg.wait(5);
    tg.close();
}

    @Test
public void tc003check() {
    tg.openBrowser();
    tg.wait(5);
    tg.swipe(Direction.UP);
    tg.click("ele_CardElements");
    tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
    tg.click("ele_MenuTextBox");
    tg.wait("ele_TextBoxuserName", ComparisonType.IS_VISIBLE);
    tg.check.isVisible("ele_LabelFullName");
    tg.check.isEqualTo("ele_LabelFullName", "Full Name");
    tg.check.isNotEqualTo("ele_LabelFullName", "Email");
    tg.check.contains("ele_LabelFullName", "Name");
    int var_CheckValue = 10;
    tg.check.isGreaterThanOrEqualTo(var_CheckValue, 9);
    tg.check.isLessThanOrEqualTo(var_CheckValue, 11);
    tg.check.isGreaterThan(var_CheckValue, 8);
    tg.check.isLessThan(var_CheckValue, 12);
    tg.wait(5);
    tg.close();
}

    @Test
public void tc004scrollto() {
    tg.openBrowser();
    tg.wait(5);
    tg.swipe(Direction.UP);
    tg.click("ele_CardElements");
    tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
    tg.click("ele_MenuTextBox");
    tg.wait("ele_TextBoxuserName", ComparisonType.IS_VISIBLE);
    tg.scrollToElement("ele_MenuForms", Direction.UP);
    tg.scrollToElement("ele_LogoToolsQA", Direction.DOWN);
    tg.close();
}

    @Test
public void tc005swipe() {
    tg.openBrowser();
    tg.wait(5);
    tg.swipe(Direction.UP);
    tg.click("ele_CardElements");
    tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
    tg.click("ele_MenuTextBox");
    tg.wait("ele_TextBoxuserName", ComparisonType.IS_VISIBLE);
    tg.swipe("ele_MenuForms", Direction.UP);
    tg.swipe("ele_LogoToolsQA", Direction.DOWN);
    tg.swipe(Direction.LEFT);
    tg.swipe(Direction.RIGHT);
    tg.close();
}

    @Test
public void tc006testfunction() {
    tg.openBrowser();
    tg.wait(5);
    tg.testFunction("ToolsQATestFunction");
    tg.close();
}

    @Test
public void tc007variable() {
    tg.openBrowser();
    tg.wait(5);
    tg.swipe(Direction.UP);
    tg.click("ele_CardElements");
    tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
    tg.click("ele_MenuTextBox");
    tg.wait("ele_TextBoxuserName", ComparisonType.IS_VISIBLE);
    tg.type("ele_TextBoxuserName", "Test1");
    String var_Email = "";
    var_Email = tg.saveToVariable("test@test.com", var_Email);
    tg.type("ele_TextBoxEmail", var_Email);
    tg.wait(5);
    tg.close();
}

    @Test
public void tc008savetovariable() {
    tg.openBrowser();
    tg.wait(5);
    tg.swipe(Direction.UP);
    tg.click("ele_CardElements");
    tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
    tg.click("ele_MenuTextBox");
    tg.wait("ele_TextBoxuserName", ComparisonType.IS_VISIBLE);
    tg.type("ele_TextBoxuserName", "Test1");
    String var_Email = "";
    var_Email = tg.saveToVariable("test@test.com", var_Email);
    tg.type("ele_TextBoxEmail", var_Email);
    tg.wait(5);
    tg.close();
}

    @Test
public void tc009comment() {
    tg.openBrowser();
    tg.wait(5);
    tg.swipe(Direction.UP);
    tg.click("ele_CardElements");
    tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
    tg.click("ele_MenuTextBox");
    tg.wait("ele_TextBoxuserName", ComparisonType.IS_VISIBLE);
    tg.wait(5);
    tg.close();
}

    @Test
public void tc010tapon() {
    tg.openBrowser();
    tg.wait(5);
    tg.swipe(Direction.UP);
    tg.click("ele_CardElements");
    tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
    tg.click("ele_MenuTextBox");
    tg.wait("ele_TextBoxuserName", ComparisonType.IS_VISIBLE);
    tg.type("ele_TextBoxuserName", "Test1");
    String var_Email = "";
    var_Email = tg.saveToVariable("test@test.com", var_Email);
    tg.type("ele_TextBoxEmail", var_Email);
    tg.swipe(Direction.UP);
    tg.wait(5);
    tg.click("ele_MenuButtons");
    tg.wait("ele_ButtonClickMe", ComparisonType.IS_VISIBLE);
    tg.click("ele_ButtonClickMe");
    tg.wait(5);
    tg.close();
}

    @Test
public void tc011startif() {
    tg.openBrowser();
    tg.wait(5);
    tg.swipe(Direction.UP);
    tg.click("ele_CardElements");
    tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
    tg.click("ele_MenuRadioButton");
    tg.wait(5);
    if (tg.performAssert("ele_Yes", ComparisonType.IS_VISIBLE)) {
        tg.click("ele_Yes");
    }
    if (tg.performAssert("ele_RadioButtonImpressive", ComparisonType.CONTAINS, "Yes")) {
        tg.click("ele_Yes");
    }
    if (tg.performAssert("ele_RadioButtonImpressive", ComparisonType.NOT_EQUAL_TO, "Yes")) {
        tg.click("ele_RadioButtonImpressive");
    }
    tg.close();
}

    @Test
public void tc012startelse() {
    tg.openBrowser();
    tg.wait(5);
    tg.swipe(Direction.UP);
    tg.click("ele_CardElements");
    tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
    tg.click("ele_MenuRadioButton");
    tg.wait(5);
    if (tg.performAssert("ele_Yes", ComparisonType.IS_VISIBLE)) {
        tg.click("ele_Yes");
    }
    if (tg.performAssert("ele_RadioButtonImpressive", ComparisonType.CONTAINS, "Yes")) {
        tg.click("ele_Yes");
    } else {
        tg.click("ele_RadioButtonImpressive");
    }
    tg.close();
}

    @Test
public void tc013endif() {
    tg.openBrowser();
    tg.wait(5);
    tg.swipe(Direction.UP);
    tg.click("ele_CardElements");
    tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
    tg.click("ele_MenuRadioButton");
    tg.wait(5);
    if (tg.performAssert("ele_Yes", ComparisonType.IS_VISIBLE)) {
        tg.click("ele_Yes");
    }
    if (tg.performAssert("ele_RadioButtonImpressive", ComparisonType.CONTAINS, "Yes")) {
        tg.click("ele_Yes");
    } else {
        tg.click("ele_RadioButtonImpressive");
    }
    tg.close();
}

    @Test
public void tc014printlog() {
    tg.openBrowser();
    tg.wait(5);
    tg.swipe(Direction.UP);
    tg.click("ele_CardElements");
    tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
    tg.click("ele_MenuTextBox");
    tg.wait("ele_TextBoxuserName", ComparisonType.IS_VISIBLE);
    tg.printLogs("ele_TextBoxuserName");
    tg.wait(5);
    tg.close();
}

    @Test
public void tc015repeatif() {
    tg.openBrowser();
    tg.wait(5);
    tg.swipe(Direction.UP);
    tg.click("ele_CardElements");
    tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
    tg.click("ele_MenuTextBox");
    tg.wait("ele_TextBoxuserName", ComparisonType.IS_VISIBLE);
    tg.wait(5);
    int var_Count = 0;
    while (tg.verify.isEqualTo(var_Count, 5)) {
        var_Count = tg.increments(var_Count, 1);
    }
    tg.close();
}

    @Test
public void tc016endrepeat() {
    tg.openBrowser();
    tg.wait(5);
    tg.swipe(Direction.UP);
    tg.click("ele_CardElements");
    tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
    tg.click("ele_MenuTextBox");
    tg.wait("ele_TextBoxuserName", ComparisonType.IS_VISIBLE);
    tg.wait(5);
    int var_Count = 0;
    while (tg.verify.isEqualTo(var_Count, 5)) {
        var_Count = tg.increments(var_Count, 1);
    }
    tg.close();
}

    @Test
public void tc017increase() {
    tg.openBrowser();
    tg.wait(5);
    tg.swipe(Direction.UP);
    tg.click("ele_CardElements");
    tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
    tg.click("ele_MenuTextBox");
    tg.wait("ele_TextBoxuserName", ComparisonType.IS_VISIBLE);
    tg.wait(5);
    int var_Count = 0;
    while (tg.verify.isEqualTo(var_Count, 5)) {
        var_Count = tg.increments(var_Count, 1);
    }
    tg.close();
}

    @Test
public void tc018hover() {
    tg.openBrowser();
    tg.wait(5);
    tg.swipe(Direction.UP);
    tg.click("ele_CardElements");
    tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
    tg.swipe("ele_MenuWidgets", Direction.UP);
    tg.swipe(Direction.UP);
    tg.swipe(Direction.UP);
    tg.click("ele_MenuWidgets");
    tg.wait(5);
    tg.swipe("ele_MenuToolTips", Direction.UP);
    tg.swipe(Direction.UP);
    tg.swipe(Direction.UP);
    tg.click("ele_MenuToolTips");
    tg.wait("ele_Hovermetosee", ComparisonType.IS_VISIBLE);
    tg.hoverOverElement("ele_Hovermetosee");
    tg.close();
}

    @Test
public void tc019takefullscreenshot() {
    tg.openBrowser();
    tg.wait(5);
    tg.swipe(Direction.UP);
    tg.click("ele_CardElements");
    tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
    tg.click("ele_MenuTextBox");
    tg.wait("ele_TextBoxuserName", ComparisonType.IS_VISIBLE);
    tg.type("ele_TextBoxuserName", "Test1");
    String var_Email = "";
    var_Email = tg.saveToVariable("test@test.com", var_Email);
    tg.type("ele_TextBoxEmail", var_Email);
    tg.takeScreenshot();
    tg.wait(5);
    tg.close();
}

    @Test
public void tc020presskey() {
    tg.openBrowser();
    tg.wait(5);
    tg.swipe(Direction.UP);
    tg.click("ele_CardElements");
    tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
    tg.click("ele_MenuTextBox");
    tg.wait("ele_TextBoxuserName", ComparisonType.IS_VISIBLE);
    tg.type("ele_TextBoxuserName", "Test1");
    String var_Email = "";
    var_Email = tg.saveToVariable("test@test.com", var_Email);
    tg.type("ele_TextBoxEmail", var_Email);
    tg.wait(5);
    ;
    tg.close();
}

    @Test
public void tc021callcustomscript() {
    tg.openBrowser();
    tg.wait(5);
    tg.swipe(Direction.UP);
    tg.click("ele_CardElements");
    tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
    tg.click("ele_MenuTextBox");
    tg.wait("ele_TextBoxuserName", ComparisonType.IS_VISIBLE);
    tg.customScriptStart();
    WebElement username = driver.findElement(By.id("userName"));
    username.sendKeys("User Name Test");
    WebElement email = driver.findElement(By.xpath("//html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/input[1]"));
    email.sendKeys("test@test.com");
    tg.customScriptEnd();
    tg.wait(5);
    tg.close();
}

    @Test
public void tc022select() {
    tg.openBrowser();
    tg.wait(5);
    tg.swipe(Direction.UP);
    tg.click("ele_CardElements");
    tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
    tg.click("ele_MenuTextBox");
    tg.wait(5);
    tg.swipe("ele_TabForms", Direction.UP);
    tg.swipe(Direction.UP);
    tg.swipe(Direction.UP);
    tg.click("ele_TabForms");
    tg.swipe("ele_MenuPracticeForm", Direction.UP);
    tg.swipe(Direction.UP);
    tg.swipe(Direction.UP);
    tg.click("ele_MenuPracticeForm");
    String var_stateName = "";
    var_stateName = tg.saveToVariable("Rajasthan", var_stateName);
    tg.swipe("ele_DropDownSelectState1", Direction.UP);
    tg.swipe(Direction.UP);
    tg.wait(5);
    tg.close();
}

    public static void toolsqatestfunction() {
        tg.wait(5);
        tg.swipe(Direction.UP);
        tg.click("ele_CardElements");
        tg.wait("ele_MenuTextBox", ComparisonType.IS_VISIBLE);
        tg.click("ele_MenuTextBox");
        tg.wait("ele_TextBoxuserName", ComparisonType.IS_VISIBLE);
        tg.type("ele_TextBoxuserName", "Test1");
        String var_Email = "";
        var_Email = tg.saveToVariable("test@test.com", var_Email);
        tg.type("ele_TextBoxEmail", var_Email);
        tg.wait(5);
    }
}
