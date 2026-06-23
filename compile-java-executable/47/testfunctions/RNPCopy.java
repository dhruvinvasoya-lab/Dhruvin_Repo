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

class rnpcopy {

	public static Object rnpcopy(String FirstName, String LastName, Integer amount) {
		tg_String var_TGReturn = "";
		START_CUSTOM_SCRIPT;
		System.out.println("FName " + FirstName);
		    System.out.println("LName " + LastName);
		    var_TGReturn = FirstName + " " + LastName + " " + amount;
		    System.out.println("Full Name " + var_TGReturn);
		END_CUSTOM_SCRIPT;
		return var_TGReturn;
	}
}