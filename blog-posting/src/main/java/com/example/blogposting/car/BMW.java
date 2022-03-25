package com.example.blogposting.car;

/**
 * The type Bmw.
 */
public class BMW implements Car {

    private final String carName = "BMW i8";

    @Override
    public String getCarName() {
        return carName;
    }

    @Override
    public void engineStart() {
        System.out.println(carName + " 엔진 스타뜨");
    }

    @Override
    public void drive() {
        System.out.println(carName + " 드라이브");
    }

    @Override
    public void engineStop() {
        System.out.println(carName + " 엔진 스탑");
    }
}
