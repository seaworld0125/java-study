package com.example.blogposting.car;

/**
 * The type K5.
 */
public class K5 implements Car {

    private final String carName = "K5";

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