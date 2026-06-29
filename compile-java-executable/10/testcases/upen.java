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
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class upen {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void upen() {
		tg.openDevice();
		tg.wait(5);
		var_FullName = (String) tg.testFunction("TF01", new Object[]{"upen", "goswami"});
		tg.wait(5);
		tg.printLogs(var_FullName);
		tg.wait(5);
		var_Totaldata = (int) tg.testFunction("TF02", new Object[]{var_ra_TotalR, var_ra_TotalR});
		tg.printLogs(var_ra_TotalR);
		tg.printLogs(var_Totaldata);
		tg.wait(5);
		var_ra_DBR = (double) tg.testFunction("TF03", new Object[]{var_DBdata, var_DBdata});
		tg.wait(1);
		tg_int var_ValueL = 0;
		var_ValueL = tg.saveToVariable(40, var_ValueL);
		tg.printLogs(var_DBdata);
		tg.wait(1);
		tg.printLogs(var_ra_DBR);
		var_JSONG = (JSONObject) tg.testFunction("TF05", new Object[]{var_FullName, var_FullName});
		tg.printLogs(var_JSONG);
		tg.wait("ele_EnteremailaddressEditText1781004199257", ComparisonType.IS_VISIBLE);
		tg.click("ele_EnteremailaddressEditText1781004199257", 1);
		tg.wait("ele_EnteremailaddressEditText1781004199257", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnteremailaddressEditText1781004199257", var_ra_TotalR, true);
		tg.wait(1);
		tg.type("ele_EnteremailaddressEditText1781004199257", var_FullName, true);
		tg.wait(1);
		tg.type("ele_EnteremailaddressEditText1781004199257", var_DBdata, true);
		var_FullName = (String) tg.testFunction("TF008", new Object[]{var_FullName, var_FullName});
		tg.printLogs(var_FullName);
		tg.close();
	}
}