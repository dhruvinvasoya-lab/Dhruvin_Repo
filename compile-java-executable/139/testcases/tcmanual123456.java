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
public class tcmanual123456 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tcmanual123456() {
		tg.openDevice();
		tg.wait(1);
		tg.wait("ele_fullnamefield1795663612423", ComparisonType.IS_VISIBLE, 30);
		tg.click("ele_fullnamefield1795663612423", 1);
		tg.type("ele_fullnamefield1795663612423", "DemoFull", false);
		tg.wait(2);
		tg.click("ele_firstnamefield1795663632369", 1);
		tg.type("ele_firstnamefield1795663632369", "DemoFirst", false);
		tg.wait("ele_donekeyboardbutton1795663643812", ComparisonType.IS_VISIBLE, 30);
		tg.click("ele_donekeyboardbutton1795663643812", 1);
		tg.wait("ele_clearbutton1795663653600", ComparisonType.IS_VISIBLE, 30);
		tg.click("ele_clearbutton1795663653600", 1);
		tg.wait("ele_controlstab1795663661767", ComparisonType.IS_VISIBLE, 30);
		tg.click("ele_controlstab1795663661767", 1);
		tg.wait("ele_maleoption1795663669492", ComparisonType.IS_VISIBLE, 30);
		tg.click("ele_femaleradiobutton1795663672136", 1);
		tg.wait("ele_screenstab1795663676754", ComparisonType.IS_VISIBLE, 30);
		tg.click("ele_screenstab1795663676754", 1);
		tg.wait("ele_openmodalsheetbutton1795663686119", ComparisonType.IS_VISIBLE, 30);
		tg.click("ele_openmodalsheetbutton1795663686119", 1);
		tg.wait("ele_closebutton1795663698974", ComparisonType.IS_VISIBLE, 30);
		tg.swipe(Direction.DOWN);
		tg.wait("ele_opendetailscreenbutton1795663710346", ComparisonType.IS_VISIBLE, 30);
		tg.wait(2);
		tg.click("ele_opendetailscreenbutton1795663710346", 1);
		tg.wait("ele_pushanotherscreenbutton1795663723861", ComparisonType.IS_VISIBLE, 30);
		tg.click("ele_pushanotherscreenbutton1795663723861", 1);
		tg.wait("ele_nesteddetailscreentitle1795663733190", ComparisonType.IS_VISIBLE, 30);
		tg.click("ele_backnavigationbuttontodetailscree1795665695421", 1);
		tg.wait("ele_detailscreentitle1795663742600", ComparisonType.IS_VISIBLE, 30);
		tg.click("ele_backnavigationbuttontoscreens1795665704258", 1);
		tg.wait(2);
		tg.click("ele_formtab1795663755294", 1);
		tg.close();
	}
}