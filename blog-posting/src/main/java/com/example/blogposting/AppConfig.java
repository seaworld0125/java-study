package com.example.blogposting;

import com.example.blogposting.car.Car;
import com.example.blogposting.car.K5;
import com.example.blogposting.driver.Driver;
import com.example.blogposting.license.LicenseService;
import com.example.blogposting.license.LicenseServiceImpl;

public class AppConfig {

    public LicenseService licenseService(Driver driver) {
        return new LicenseServiceImpl(car(), driver);
    }

    public Car car() {
        return new K5();
    }
}
