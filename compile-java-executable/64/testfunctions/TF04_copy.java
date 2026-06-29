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

class tf04_copy {

	public static Object tf04(String FName, String LName) {
		tg_String var_TGReturn = "";
		START_CUSTOM_SCRIPT;
		System.out.println("FName " + FName);
		    System.out.println("LName " + LName);
		    var_TGReturn = FName + " " + LName;
		    System.out.println("Full Name " + var_TGReturn);
		END_CUSTOM_SCRIPT;
		return var_TGReturn;
	}
}