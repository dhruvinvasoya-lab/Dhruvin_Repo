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
public class tgconn {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tgconn() {
		tg.openDevice();
				tg.wait("ele_SearchGoogleortypeURLEditText1790928688027", ComparisonType.IS_VISIBLE);
				tg.click("ele_SearchGoogleortypeURLEditText1790928688027", 1);
				tg.wait("ele_SearchGoogleortypeURLEditText1790928696080", ComparisonType.IS_VISIBLE);
				tg.type("ele_SearchGoogleortypeURLEditText1790928696080", "192.168.88.154:8000/Demo", false);
				tg.wait(2);
		START_CUSTOM_SCRIPT;
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.android.chrome:id/line_1']")).click();
		END_CUSTOM_SCRIPT;
				tg.wait(20);
		tg.close();
	}
}