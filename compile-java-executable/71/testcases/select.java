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

@Listeners(TestListener.class);
public class select {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void select() {
		tg.openBrowser();
		tg.navigateToUrl("https://rahulshettyacademy.com/AutomationPractice/");
		tg.wait("ele_PracticePage", ComparisonType.IS_VISIBLE);
		tg.selectDropdownByIndex("ele_SelectOption1Option2Option3",1);
		tg.scrollToElement("ele_MouseHover", Direction.DOWN);
		tg.hoverOverElement("ele_MouseHover");
		tg.wait(5);
		tg.swipe("ele_PracticePage", Direction.DOWN);
		if(tg.performAssert("ele_alertbtn1", ComparisonType.IS_VISIBLE)){
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
		tg.setBrowserResolution("800", "600");
		tg_String var_V1 = "Demo";
		var_V1 = tg.saveToVariable(var_V1, "capability", "browserName");
		tg.printLogs(var_V1);
		tg_String var_V2 = "Demo1";
		var_V2 = tg.saveToVariable(var_V2, "regex", "[a-fA-F0-9]{2,15}");
		tg.printLogs(var_V2);
		tg.close();
	}
}