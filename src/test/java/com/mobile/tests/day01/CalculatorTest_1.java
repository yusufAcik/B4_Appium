package com.mobile.tests.day01;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest_1 {

    AppiumDriver<MobileElement> driver;
   // AppiumDriver driver; after version 8
    @Test
    public void test1() throws MalformedURLException, InterruptedException {
        //Desire capabilities
        //hangi cihaz ve hangi uygulama
        DesiredCapabilities capabilities=new DesiredCapabilities();

        //hangi platformda test yapıyoruz -> android or ios
       // capabilities.setCapability("platformName","Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        //android version bilgisi
        capabilities.setCapability(MobileCapabilityType.VERSION,"11.0");
        //emulator adı
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2");
        //application package name
        capabilities.setCapability("appPackage","com.google.android.calculator");
        //application activity name
        capabilities.setCapability("appActivity","com.android.calculator2.Calculator");

       // driver=new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver=new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),capabilities);

        Thread.sleep(3000);
        driver.closeApp();
    }


}
