package com.example.blogposting.license;

import com.example.blogposting.car.Car;
import com.example.blogposting.car.K5;
import com.example.blogposting.driver.Driver;

public class LicenseServiceImpl implements LicenseService {

    private final Car car;
    private final Driver driver;

    public LicenseServiceImpl(Car car, Driver driver) {
        this.car = car;
        this.driver = driver;
    }

    @Override
    public void printCarName() {
        System.out.println("car Name = " + car.getCarName());
    }

    @Override
    public void printDriverInfo() {
        System.out.println(driver.toString());
    }
}