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
public class variable_soft_check_fail {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void variable_soft_check_fail() {
		tg.openBrowser();
		tg.softCheck.contains("Hello","hello", false);
		tg.wait(5);
		tg_String var_Namedata = "";
		var_Namedata = tg.saveToVariable("upen", var_Namedata);
		tg_int var_ValueLocal = 0;
		var_ValueLocal = tg.saveToVariable(5, var_ValueLocal);
		tg_String var_NameLocal = "";
		var_NameLocal = tg.saveToVariable("Upen", var_NameLocal);
		tg.softCheck.contains(var_Namedata,var_NameLocal, false);
		tg.softCheck.isEqualTo(var_ValueLocal,var_NameGlobal, false);
		tg.softCheck.isNotEqualTo(var_DBGlobal,var_ValueGlobal, false);
		tg.softCheck.isEqualTo(var_ValueGlobal,var_ValueLocal, false);
		tg.wait(5);
		tg.softCheck.isNotEqualTo(var_NameGlobal,var_Namedata, false);
		tg.wait(5);
		tg.close();
	}
}