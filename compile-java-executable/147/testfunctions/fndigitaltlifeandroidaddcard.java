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

class fndigitaltlifeandroidaddcard {

	public static void fndigitaltlifeandroidaddcard() {
		tg.wait("ele_tlifeAnPaymentNameField", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_tlifeAnPaymentNameField", 1);
		tg.wait("ele_tlifeAnPaymentNameField", ComparisonType.IS_VISIBLE);
		tg.type("ele_tlifeAnPaymentNameField", "Master Card", true);
		tg.wait("ele_tlifeAnPaymentCardNumberField", ComparisonType.IS_VISIBLE);
		tg.click("ele_tlifeAnPaymentCardNumberField", 1);
		tg.wait("ele_tlifeAnPaymentCardNumberField", ComparisonType.IS_VISIBLE);
		tg.type("ele_tlifeAnPaymentCardNumberField", "5555 5555 5555 4444", true);
		tg.wait("ele_tlifeAnPaymentExpiryDateField", ComparisonType.IS_VISIBLE);
		tg.click("ele_tlifeAnPaymentExpiryDateField", 1);
		tg.wait("ele_tlifeAnPaymentExpiryDateField", ComparisonType.IS_VISIBLE);
		tg.type("ele_tlifeAnPaymentExpiryDateField", "330", true);
		tg.wait("ele_tlifeAnPaymentCVVField", ComparisonType.IS_VISIBLE, 6);
		tg.click("ele_tlifeAnPaymentCVVField", 1);
		tg.wait("ele_tlifeAnPaymentCVVField", ComparisonType.IS_VISIBLE);
		tg.type("ele_tlifeAnPaymentCVVField", "777", true);
		tg.wait("ele_tlifeAnPaymentNicknameField", ComparisonType.IS_VISIBLE);
		tg.click("ele_tlifeAnPaymentNicknameField", 1);
		tg.type("ele_tlifeAnPaymentNicknameField", "testcard", true);
		tg.click("ele_tlifeAnToggleSavetomywallet", 1);
		tg.click("ele_tlifeAnSelectToggleUsethisasmypaymentaddress", 1);
		tg.wait("ele_tlifeAnPaymentContinueButton", ComparisonType.IS_VISIBLE);
		tg.click("ele_tlifeAnPaymentContinueButton", 1);
		tg.wait(5);
	}
}