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

class testfunctionhandleenvironmentswitcherandlogin {

	public static void testfunctionhandleenvironmentswitcherandlogin() {
		tg.wait(5);
		START_CUSTOM_SCRIPT;
		((io.appium.java_client.android.AndroidDriver) driver).setLocation(new org.openqa.selenium.html5.Location(25.276987, 55.296249, 0));
		END_CUSTOM_SCRIPT;
		tg.deactivateApp("com.tmobile.tmte");
		tg.clearAppData("com.tmobile.tmte");
		tg.activateApp("com.tmobile.tmte");
		tg.wait(30);
		tg.testFunction("fnDigitaltlifeAndroidHandleEnvironmentSwitcher");
		if(tg.performAssert("ele_tlifeAnFingerprintSetupUseFingerprintLabel", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAnFingerprintSetupCloseButton", 1);
		}
		if(tg.performAssert("ele_tlifeAnWelcomeContinueButton", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAnWelcomeContinueButton", 1);
		}
		if(tg.performAssert("ele_tlifeButtonSkipForNow", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeButtonSkipForNow", 1);
		tg.wait(2);
		tg.click("ele_tlifeButtonYesSkip", 1);
		}
		if(tg.performAssert("ele_tlifeAnWelcomeContinueButton", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAnWelcomeContinueButton", 1);
		}
		if(tg.performAssert("ele_tlifeAndroidDataChoicesScreen", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAndroidDataChoicesContinueButton", 1);
		tg.scroll("ele_tlifeAndroidDataChoicesAcceptButton", Direction.DOWN);
		tg.click("ele_tlifeAndroidDataChoicesAcceptButton", 1);
		}
		if(tg.performAssert("ele_tlifeAndroidNextButton", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAndroidNextButton", 1);
		tg.wait(2);
		tg.click("ele_tlifeAnAllowButton", 1);
		}
		// [DISABLED] if(tg.performAssert("ele_tlifeAndroidNextButton", ComparisonType.IS_VISIBLE)){
		// [DISABLED] tg.click("ele_tlifeAndroidNextButton", 1);
		// [DISABLED] tg.wait(10);
		// [DISABLED] tg.click("ele_tlifeAllownotificationsLabel", 1);
		// [DISABLED] }
		if(tg.performAssert("ele_tlifeAndroidNextButton", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAndroidNextButton", 1);
		tg.wait(2);
		tg.click("ele_tlifeAnLocationWhileUsingTheAppButton", 1);
		}
		if(tg.performAssert("ele_tlifeAnBtnChangeSettings", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAnNoThanksButton", 1);
		}
		if(tg.performAssert("ele_tlifeAndroidIntelligentHubCancel", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAnCancelBtn", 1);
		}
		if(tg.performAssert("ele_tlifeAndroidWelcomeToMagentaStatusPage", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAndroidWelcomeToMagentaStatusPageCloseButton", 1);
		}
		tg.wait(15);
		if(tg.performAssert("ele_tlifeAnSnackbarRetryButton", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAnSnackbarRetryButton", 1);
		}
		// [DISABLED] if(tg.performAssert("ele_BOWISCheckinCTA", ComparisonType.IS_VISIBLE)){
		// [DISABLED] tg.click("ele_ClosePopUp", 1);
		// [DISABLED] }
		// [DISABLED] if(tg.performAssert("ele_tlifeAnButtonPersonaliseShortcutCloseIcon", ComparisonType.IS_VISIBLE)){
		// [DISABLED] tg.click("ele_tlifeAnButtonPersonaliseShortcutCloseIcon", 1);
		// [DISABLED] }
		// [DISABLED] if(tg.performAssert("ele_tlifeAndBtnContinueWelcome", ComparisonType.IS_VISIBLE)){
		// [DISABLED] tg.click("ele_tlifeAndBtnContinueWelcome", 1);
		// [DISABLED] }
		tg.wait("ele_ManageTab", ComparisonType.IS_VISIBLE);
		if(tg.performAssert("ele_ManageTab", ComparisonType.IS_VISIBLE)){
		tg.click("ele_ManageTab", 1);
		}
		tg.wait("ele_tlifeAnSettingsButtonn", ComparisonType.IS_VISIBLE);
		if(tg.performAssert("ele_tlifeAnNotnowButton", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAnNotnowButton", 1);
		}
		if(tg.performAssert("ele_tlifeAnSettingsButtonn", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAnSettingsButtonn", 1);
		tg.click("ele_tlifeAnBtnLogInWithTmoID", 1);
		if(tg.performAssert("ele_tlifeAnLogInWithPasswordButton", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAnLogInWithPasswordButton", 1);
		}
		}
		if(tg.performAssert("ele_tlifeAnUsePasswordButton", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAnUsePasswordButton", 1);
		}
		tg.wait("ele_tlifeAnTmobileIDTextBox", ComparisonType.IS_VISIBLE);
		tg.type("ele_tlifeAnTmobileIDTextBox", var_TLifeUserName, true);
		tg.type("ele_tlifePasswordAnTextBox", var_TLifePassword, true);
		tg.click("ele_tlifeAnLoginButton", 1);
		if(tg.performAssert("ele_tlifeAnWelcomeContinueButton", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAnWelcomeContinueButton", 1);
		}
		if(tg.performAssert("ele_tlifeAnWelcomeContinueButton", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAnWelcomeContinueButton", 1);
		}
		if(tg.performAssert("ele_tlifeAndroidDataChoicesScreen", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAndroidDataChoicesContinueButton", 1);
		tg.scroll("ele_tlifeAndroidDataChoicesAcceptButton", Direction.DOWN);
		tg.click("ele_tlifeAndroidDataChoicesAcceptButton", 1);
		}
		if(tg.performAssert("ele_tlifeAnSettingsBackButton", ComparisonType.IS_VISIBLE)){
		tg.click("ele_tlifeAnSettingsBackButton", 1);
		}
		// [DISABLED] if(tg.performAssert("ele_tlifeAnNotnowButton", ComparisonType.IS_VISIBLE)){
		// [DISABLED] tg.click("ele_tlifeAnNotnowButton", 1);
		// [DISABLED] }
		// [DISABLED] if(tg.performAssert("ele_tlifeAnAccountAccessReviewLabel", ComparisonType.IS_VISIBLE)){
		// [DISABLED] tg.click("ele_tlifeAnNotnowButton", 1);
		// [DISABLED] }
	}
}