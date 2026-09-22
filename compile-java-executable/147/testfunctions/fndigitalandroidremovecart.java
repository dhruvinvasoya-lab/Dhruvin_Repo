import org.openqa.selenium.support.ui.Select;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import java.time.MonthDay;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import org.openqa.selenium.html5.Location;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.Pause;
import java.time.Duration;
import static org.openqa.selenium.interactions.PointerInput.Kind.TOUCH;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;
import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
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

class fndigitalandroidremovecart {

	public static void fndigitalandroidremovecart() {
		tg.wait(10);
		if(tg.performAssert("ele_tlifeAnReadytoCheckout", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAnReadytoCheckout", 1);
		tg.wait(2);
		tg.testFunction("fnDigitalTlifehandleReviewCartPaymentAdjustPopUp");
		tg.click("ele_tlifeAnCartHeader", 1);
		while(tg.verify.isInvisible("ele_tlifeAnShopForMoreButtonn")){
		tg.testFunction("fnDigitalTlifehandleReviewCartPaymentAdjustPopUp");
		if(tg.performAssert("ele_tlifeAnCartDeviceMenuButton", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAnCartDeviceMenuButton", 1);
		tg.wait(2);
		tg.click("ele_tlifeAnRemoveDeviceOption", 1);
		tg.wait(1);
		tg.click("ele_tlifeAnDialogRemoveButton", 1);
		tg.wait(2);
		}
		if(tg.performAssert("ele_tlifeAnCartLineCardChevron", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAnCartLineCardChevron", 1);
		tg.wait(2);
		tg.click("ele_tlifeAnCartDeviceMenuButton", 1);
		tg.wait(2);
		tg.click("ele_tlifeAnRemoveDeviceOption", 1);
		tg.wait(1);
		tg.click("ele_tlifeAnDialogRemoveButton", 1);
		tg.wait(2);
		}
		}
		tg.click("ele_tlifeAnShopForMoreButton", 1);
		tg.wait(2);
		}
	}
}