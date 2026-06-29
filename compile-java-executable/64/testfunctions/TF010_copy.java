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

class tf010_copy {

	public static Object tf010(String FirstName, String LastName) {
		tg_String var_TGReturn = "";
		START_CUSTOM_SCRIPT;
		System.out.println("FName: " + FirstName);
		        System.out.println("LName: " + LastName);
		        var_TGReturn = FirstName + " " + LastName;
		        System.out.println("Full Name: " + var_TGReturn);
		END_CUSTOM_SCRIPT;
				tg.wait(2);
		return var_TGReturn;
	}
}