package com.example.blogposting.driver;

/**
 * The type Driver.
 */
public class Driver {

    private final String driverName;
    private final int driverAge;
    private final String driverAddress;

    /**
     * Instantiates a new Driver.
     *
     * @param driverName    the driver name
     * @param driverAge     the driver age
     * @param driverAddress the driver address
     */
    public Driver(String driverName, int driverAge, String driverAddress) {
        this.driverName = driverName;
        this.driverAge = driverAge;
        this.driverAddress = driverAddress;
    }

    @Override
    public String toString() {
        return "DriverImpl{" +
                "driverName='" + driverName + '\'' +
                ", driverAge=" + driverAge +
                ", driverAddress='" + driverAddress + '\'' +
                '}';
    }
}
