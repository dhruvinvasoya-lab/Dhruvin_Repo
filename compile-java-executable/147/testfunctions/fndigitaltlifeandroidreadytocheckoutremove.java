import org.openqa.selenium.support.ui.Select;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import java.time.MonthDay;
import org.testng.Assert;
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

class fndigitaltlifeandroidreadytocheckoutremove {

	public static void fndigitaltlifeandroidreadytocheckoutremove() {
		tg.wait(5);
		if(tg.performAssert("ele_tlifeAnReadytoCheckout", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAnReadytoCheckout", 1);
		tg.wait(10);
		tg.wait("ele_MenuButton1773294044176", ComparisonType.IS_VISIBLE);
		tg.click("ele_MenuButton1773294044176", 1);
		tg.wait(2);
		tg.wait("ele_RemovedeviceTextView1773574735446", ComparisonType.IS_VISIBLE);
		tg.click("ele_RemovedeviceTextView1773574735446", 1);
		tg.wait(2);
		tg.wait("ele_tlifeAnRemovecartdevice", ComparisonType.IS_VISIBLE);
		tg.click("ele_tlifeAnRemovecartdevice", 1);
		tg.wait(5);
		tg.wait("ele_tlifeAnShopForMore", ComparisonType.IS_VISIBLE);
		tg.click("ele_tlifeAnShopForMore", 1);
		tg.wait(5);
		}
	}
}