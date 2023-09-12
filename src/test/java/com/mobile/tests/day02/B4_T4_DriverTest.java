package com.mobile.tests.day02;

import com.mobile.utilities.App;
import com.mobile.utilities.Device;
import com.mobile.utilities.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;

public class B4_T4_DriverTest {
    By ldigit0 = By.id("com.google.android.calculator:id/digit_0");
    By ldigit1 = By.id("com.google.android.calculator:id/digit_1");
    By ldigit2 = By.id("com.google.android.calculator:id/digit_2");
    By ldigit3 = By.id("com.google.android.calculator:id/digit_3");
    By ldigit4 = By.id("com.google.android.calculator:id/digit_4");
    By ldigit5 = By.id("com.google.android.calculator:id/digit_5");
    By ldigit6 = By.id("com.google.android.calculator:id/digit_6");
    By ldigit7 = By.id("com.google.android.calculator:id/digit_7");
    By ldigit8 = By.id("com.google.android.calculator:id/digit_8");
    By ldigit9 = By.id("com.google.android.calculator:id/digit_9");
    By lplusBtn = By.id("com.google.android.calculator:id/op_add");
    By leqBtn = By.id("com.google.android.calculator:id/eq");
    By lresult = By.id("com.google.android.calculator:id/result_final");


    AppiumDriver<MobileElement> driver;

    @Before
    public void beforeTest() {
        Driver.runAppium();
        driver = Driver.getDriver(Device.PIXEL2, App.CALCULATOR);
    }

    @After
    public void afterTest() {
        driver.quit();
        Driver.stopAppium();
    }

    @Test
    public void test1() throws InterruptedException {
        //   Driver.runAppium();
        // driver=Driver.getDriver(Device.PIXEL2, App.CALCULATOR);


        MobileElement digit2 = driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
        MobileElement plusBtn = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
        MobileElement digit3 = driver.findElement(By.id("com.google.android.calculator:id/digit_3"));
        MobileElement equalBtn = driver.findElement(By.id("com.google.android.calculator:id/eq"));
        digit2.click();
        plusBtn.click();
        digit3.click();
        equalBtn.click();
        MobileElement result = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
        String actualResult = result.getText();
        Assert.assertEquals("5", actualResult);

        Thread.sleep(3000);
        driver.closeApp();

        //  Driver.stopAppium();
    }

    @Test
    public void test2() {
click(ldigit2);
click(lplusBtn);
click(ldigit4);
click(leqBtn);
Assert.assertEquals("6",getText(lresult));
    }


    void click(By locator) {
        Driver.getDriver().findElement(locator).click();
    }

    String getText(By locator){
        return Driver.getDriver().findElement(locator).getText();
    }
}
