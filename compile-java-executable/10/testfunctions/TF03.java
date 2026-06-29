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

class tf03 {

	public static Object tf03(Double DB1, Double DB2) {
		tg_Double var_TGReturn = 0.00;
		START_CUSTOM_SCRIPT;
		System.out.println("D " + DB1);
		    System.out.println("D1 " + DB2);
		    var_TGReturn = DB1 + DB2;
		    System.out.println("Total Value " + var_TGReturn);
		END_CUSTOM_SCRIPT;
		return var_TGReturn;
	}
}