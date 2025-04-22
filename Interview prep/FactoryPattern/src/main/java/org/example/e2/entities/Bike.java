package org.example.e2.entities;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started");
    }
}
