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

class func_param_string {

	public static Object func_param_string(String FName, String LName, String City, String Company, String Job, String Email, String Status) {
		tg_String var_TGReturn = "";
		START_CUSTOM_SCRIPT;
		System.out.println("FirstName : " + FName); 
				System.out.println("LastName : " + LName); 
				System.out.println("City : " + City); 
				System.out.println("Company : " + Company); 
				System.out.println("JobTitle : " + Job); 
				System.out.println("Email : " + Email); 
				System.out.println("Status : " + Status); 
				// Create sentence 
				String finalResultStr = "My name is " + FName + " " + LName + ". I live in " + City + " and I work at " + Company + " as a " + Job + ". My email address is " + Email + " and my current status is " + Status + "."; 
				// Return the sentence 
				var_TGReturn = finalResultStr; 
				System.out.println("Final Sentence : " + var_TGReturn);
				System.out.println("\n");
		END_CUSTOM_SCRIPT;
		return var_TGReturn;
	}
}