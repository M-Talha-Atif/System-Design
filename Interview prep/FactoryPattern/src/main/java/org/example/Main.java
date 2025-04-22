package org.example;

import org.example.e1.entities.Os;
import org.example.e1.factory.OsFactory;
import org.example.e2.entities.Vehicle;
import org.example.e2.factory.VehicleFactory;

public class Main {
    public static void main(String[] args) {

        // using the factory pattern for OS
        Os os = OsFactory.makeObject("windows");
        os.features();

        os = OsFactory.makeObject("android");
        os.features();

        os = OsFactory.makeObject("apple");
        os.features();

        os = OsFactory.makeObject("linux");
        os.features();



        // using the factoyr pattern for Ride sharing real time system

        Vehicle v1 = VehicleFactory.getVehicle("car");
        Vehicle v2 = VehicleFactory.getVehicle("bike");

        v1.start(); // Car started
        v2.start(); // Bike started
    }
}