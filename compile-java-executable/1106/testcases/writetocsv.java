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
public class writetocsv {

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
		tg_String var_FName = "FirstName";
		tg_String var_LName = "LastName";
		tg.endSecureBlock();
		tg.writeToCSV("var_FName", var_FName, "");
		tg.writeToCSV("var_LName", var_LName, "");
		tg.close();
	}
}