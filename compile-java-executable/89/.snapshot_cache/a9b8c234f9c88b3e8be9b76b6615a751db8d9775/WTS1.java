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
public class WTS1 {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc1() {
        tg.openBrowser();
        tg.navigateToUrl("https://ultimateqa.com/automation/");
        tg.wait("ele_learnhowtoautomateanapplic1793857669185", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_learnhowtoautomateanapplic1793857669185", 1);
        tg.wait("ele_sprint11793857680757", ComparisonType.IS_VISIBLE, 30);
        tg.type("ele_firstnamegoto1793857689356", "FirstDemo");
        tg.click("ele_gotothenextsprint1793857690952", 1);
        tg.wait("ele_iteration21793857699482", ComparisonType.IS_VISIBLE, 30);
        tg.type("ele_firstnamegoto1793857689356", "FirstDemo");
        tg.type("ele_firstnamelastna1793857702340", "LastDemo");
        tg.click("ele_gotosprint31793857703907", 1);
        tg.wait("ele_iteration31793857719314", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_maleradiobutton1793857729055", 1);
        tg.wait("ele_malefemaleother1793857744196", ComparisonType.IS_VISIBLE, 30);
        tg.type("ele_malefemaleother1793857744196", "FirstDemo");
        tg.type("ele_malefemaleother1793857745766", "LastDemo");
        tg.click("ele_gotosprint41793857747356", 1);
        tg.wait("ele_iteration41793857758646", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_gotosprint51793857760246", 1);
        tg.wait("ele_iteration51793857770390", ComparisonType.IS_VISIBLE, 30);
        tg.click("ele_malefemaleothe1793857771982", 1);
        tg.close();
    }
}
