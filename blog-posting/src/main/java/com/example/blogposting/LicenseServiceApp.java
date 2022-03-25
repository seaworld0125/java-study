package com.example.blogposting;

import com.example.blogposting.driver.Driver;
import com.example.blogposting.license.LicenseService;

public class LicenseServiceApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        Driver driver = new Driver("taeKyoung", 25, "suwon-si");

        LicenseService licenseService = appConfig.licenseService(driver);
        licenseService.printCarName();
        licenseService.printDriverInfo();
    }
}
