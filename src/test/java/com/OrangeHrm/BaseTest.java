package com.OrangeHrm;

import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {
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

