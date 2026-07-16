import io.testgrid.listeners.TestListener;
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

@Listeners(TestListener.class)
public class Mytest {

    @Test
public void allaction() {
    tg.openBrowser();
    tg.wait("ele_Register", ComparisonType.IS_VISIBLE);
    tg.click("ele_input186", 1);
    tg.type("ele_input186", "Jhon");
    tg.click("ele_input239", 1);
    tg.type("ele_input239", "Doe");
    tg.click("ele_textarea097", 1);
    tg.type("ele_textarea097", "Demo Adress");
    tg.scrollToElement("ele_Submit", Direction.DOWN);
    tg.click("ele_Male", 1);
    tg.click("ele_Cricket", 1);
    tg.click("ele_Languages", 1);
    tg.click("ele_arabic", 1);
    tg.click("ele_firstpassword1", 1);
    tg.type("ele_firstpassword1", "+C8ViEFemQtayJOMEcXvuw==:MTIzNDU2Nzg5MTAxMTEyMQ==");
    tg.click("ele_secondpassword1", 1);
    tg.type("ele_secondpassword1", "+C8ViEFemQtayJOMEcXvuw==:MTIzNDU2Nzg5MTAxMTEyMQ==");
    tg.click("ele_Submit", 1);
    tg.openNewTab();
    tg.wait(5);
    tg.navigateToUrl("https://demo.automationtesting.in/Frames.html");
    tg.switchToTab(0);
    tg.switchToFrame("ele_pYourbrowserdoesnotsupportiframesp");
    tg.switchToParentFrame();
    tg.click("ele_IframewithinanIframe", 1);
    tg.switchToFrame("ele_NestediFrames");
    tg.switchToFrame("ele_ifram2");
    tg.click("ele_Inputboxifram");
    tg.type("ele_Inputboxifram", "Demo");
    tg.writeToCSV("CSVDemo", "CSVDemo", "");
    tg.close();
}
}
