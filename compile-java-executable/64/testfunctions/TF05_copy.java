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

class tf05_copy {

	public static Object tf05(String First, String Last) {
		JSONObject var_TGReturn = tg.getJsonData("");
		START_CUSTOM_SCRIPT;
		 System.out.println("First Name : " + First);
		        System.out.println("Last Name  : " + Last);
		        var_TGReturn.put("FirstName", First);
		        var_TGReturn.put("LastName", Last);
		        var_TGReturn.put("FullName", First + " " + Last);
		        var_TGReturn.put("Status", "Success");
		        System.out.println("JSON Response : " + var_TGReturn.toString());
		END_CUSTOM_SCRIPT;
		return var_TGReturn;
	}
}