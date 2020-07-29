package Vehicles;

import Components.ElectricMotor;

public class ElectricCar extends Vehicles.Vehicle {
    String colour;
    ElectricMotor motor;

    public ElectricCar(String name, Double price, String colour, ElectricMotor motor) {
        super(name, price);
        this.colour = colour;
        this.motor = motor;

    }
    public double cost(){
        return this.getPrice() + motor.cost();
    }

}
