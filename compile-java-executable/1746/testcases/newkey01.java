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
public class newkey01 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void newkey01() {
		tg.openDevice();
		tg.wait(2);
		tg.printPageSource();
		tg.pageLoadStart("LoginPg");
		tg.wait("ele_UsernameorEmailEditText", ComparisonType.IS_VISIBLE);
		tg.click("ele_UsernameorEmailEditText", 1);
		tg.type("ele_UsernameorEmailEditText", "username", true);
		tg.wait("ele_PasswordEditText", ComparisonType.IS_VISIBLE);
		tg.click("ele_PasswordEditText", 1);
		tg.type("ele_PasswordEditText", "••••s", true);
		tg.pageLoadEnd("LoginPg");
		tg.pageLoadStart("GuestPg");
		tg.wait("ele_EnterasGuestButton", ComparisonType.IS_VISIBLE);
		tg.click("ele_EnterasGuestButton", 1);
		tg.wait(3);
		tg.swipe(Direction.UP);
		tg.swipe(Direction.DOWN);
		tg.pageLoadEnd("GuestPg");
		tg.pageLoadStart("Rotation");
		tg.wait(2);
		tg.setOrientation("LANDSCAPE");
		tg.wait(2);
		tg.setOrientation("PORTRAIT");
		tg.wait(2);
		tg.pageLoadEnd("Rotation");
		tg.deactivateApp("com.nestdesign.nestforms");
		tg.wait(2);
		tg.activateApp("com.app.urunner");
		tg.wait(2);
		tg.clearAppData("com.nestdesign.nestforms");
		tg.wait(2);
		tg.activateApp("com.nestdesign.nestforms");
		tg.wait(5);
		tg.close();
	}
}