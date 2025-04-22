package org.example.e2.entities;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }
}
