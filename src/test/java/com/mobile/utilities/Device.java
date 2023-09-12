package com.mobile.utilities;

public enum Device {

    /**
     * {
     *   "appium:udid": "emulator-5554",
     *   "appium:version": "11",
     *   "appium:deviceName": "Pixel 2",
     *   "appium:realDevice": "false",
     *   "platformName": "Android"
     * }
     */

    PIXEL2(
            "emulator-5554",
            "11",
            "Pixel 2",
            "Android"
    );

   public String udid;
   public String version;
   public String deviceName;
    public String platformName;
    Device(String udid, String version, String deviceName, String platformName) {
        this.udid=udid;
        this.version=version;
        this.deviceName=deviceName;
        this.platformName=platformName;
    }
}
