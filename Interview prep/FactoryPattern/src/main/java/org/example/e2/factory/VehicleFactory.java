package org.example.e2.factory;

import org.example.e2.entities.Auto;
import org.example.e2.entities.Bike;
import org.example.e2.entities.Car;
import org.example.e2.entities.Vehicle;

public class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        switch(type.toLowerCase()) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            case "auto":
                return new Auto();
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}
