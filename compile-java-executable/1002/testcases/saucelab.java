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
public class saucelab {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void saucelab() {
		tg.openDevice();
				tg.wait(2);
				tg.pageLoadStart("saucelab");
				tg.wait("ele_UsernameEditText1781774153873", ComparisonType.IS_VISIBLE, 2);
				tg.click("ele_UsernameEditText1781774153873", 1);
				tg.type("ele_UsernameEditText1781774153873", "#TGITVAR.User", true);
		// [DISABLED] 		tg.type("ele_UsernameEditText1781774153873", "standard_user", true);
				tg.wait("ele_PasswordEditText1781774220066", ComparisonType.IS_VISIBLE, 2);
				tg_String var_password = "";
				var_password = tg.saveToVariable("#TGITVAR.Password", var_password);
				tg.type("ele_PasswordEditText1781774220066", var_password, false);
		// [DISABLED] 		tg.type("ele_PasswordEditText1781774220066", "secret_sauce", true);
				tg.wait("ele_testLOGINViewGroup1781774279072", ComparisonType.IS_VISIBLE, 2);
		// [DISABLED] 		tg.click("ele_testLOGINViewGroup1781774279072", 1);
				tg.tapByImage("ele_testLOGINViewGroup1781774279072", 0.65);
				tg.scroll("ele_ImageView1781774435327", Direction.DOWN);
				tg.click("ele_ImageView1781774435327", 1);
				tg.scroll("ele_ADDTOCARTTextView1781774563741", Direction.DOWN);
				tg.click("ele_ADDTOCARTTextView1781774563741", 1);
				tg.wait(2);
				tg.click("ele_ViewGroup1781774701724", 1);
				tg.wait(2);
				tg.click("ele_CHECKOUTTextView1781774762960", 1);
				tg.wait(2);
				tg_String var_Fname = "uvaish";
				tg.click("ele_FirstNameEditText1781774888679", 1);
				tg.type("ele_FirstNameEditText1781774888679", var_Fname, true);
		START_CUSTOM_SCRIPT;
		System.out.println("Starting secure block============================================================================================================================================================================================================================================");
		END_CUSTOM_SCRIPT;
				tg.startSecureBlock();
				tg.type("ele_LastNameEditText1781777838525", "sindhi", true);
				tg.endSecureBlock();
		START_CUSTOM_SCRIPT;
		System.out.println("Ending secure block============================================================================================================================================================================================================================================");
		END_CUSTOM_SCRIPT;
		// this is testing
				tg_int var_zicode = 1234;
				tg.type("ele_ZipPostalCodeEditText1781777875703", var_zicode, true);
				tg.check.isEqualTo(var_zicode,"1234");
				tg.check.isNotEqualTo("ele_ZipPostalCodeEditText1781777875703","12");
				tg.check.isGreaterThanOrEqualTo(var_zicode,"123");
				tg.check.isLessThanOrEqualTo(var_zicode,"123456");
				tg.check.isGreaterThan(var_zicode,"123");
				tg.check.isLessThan(var_zicode,"123456");
				tg.click("ele_CONTINUETextView1781778419189", 1);
		START_CUSTOM_SCRIPT;
		System.out.println("😀😂😍🥳😎🤩😊😁😄😃😉😇🤗🙌👏👍👌💪🔥⭐🌟✨🎉🎊🎈❤️💙💚💛🧡💜🤍🖤🤎💯🚀🌈🍕🍔🍟🌮🍩🍎☕🎵🎮📚💻📱");
		END_CUSTOM_SCRIPT;
				tg.pageLoadEnd("saucelab");
		tg.printPageSource();
				tg.printLogs("==========================================================================================================================================================");
				tg.testFunction("date_utility", new Object[]{});
		tg.close();
	}
}