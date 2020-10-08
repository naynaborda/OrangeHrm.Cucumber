package testRunner;

import com.OrangeHrm.BasePage;
import com.OrangeHrm.BrowserSelector;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {
    BrowserSelector browserSelector=new BrowserSelector();
    @Before
    public void openBrowser(){

        browserSelector.selectBrowser("FireFox");
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @After
    public  void closeBrowser(){
       // driver.quit();
    }
}
