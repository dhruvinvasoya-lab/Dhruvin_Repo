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

@Listeners(TestListener.class);
public class tcverifysuccessfulworkflownavigationandformsubmissionpositivescenario {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tcverifysuccessfulworkflownavigationandformsubmissionpositivescenario() {
		tg.openBrowser();
				tg.wait(1);
				tg.navigateToUrl("https://ultimateqa.com/automation/");
				tg.wait("ele_learnhowtoautomateanapplic1793858402933", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_learnhowtoautomateanapplic1793858402933", 1);
				tg.wait("ele_sprint11793857680757", ComparisonType.IS_VISIBLE, 30);
				tg.type("ele_firstnamegoto17938576893561", "FirstDemo");
				tg.click("ele_gotothenextsprint1793857690952", 1);
				tg.wait("ele_iteration21793857699482", ComparisonType.IS_VISIBLE, 30);
				tg.type("ele_firstnamegoto17938576893561", "FirstDemo");
				tg.type("ele_firstnamelastna17938577023401", "LastDemo");
				tg.click("ele_gotosprint317938577039071", 1);
				tg.wait("ele_iteration31793858443575", ComparisonType.IS_VISIBLE, 30);
				tg.click("ele_malefemaleother17938584372481", 1);
				tg.wait("ele_malefemaleother17938584372481", ComparisonType.IS_VISIBLE, 30);
				tg.check.isSelected("ele_malefemaleother17938584372481");
				tg.type("ele_malefemaleother17938577441961", "FirstDemo");
				tg.type("ele_malefemaleother17938577457661", "LastDemo");
				tg.click("ele_gotosprint41793857747356", 1);
		tg.close();
	}
}