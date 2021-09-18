package edu.academy.jc.hw1;

import edu.academy.jc.hw1.model.Bike;
import edu.academy.jc.hw1.model.Car;

public class CarService {

    public static void main(String[] args) {

        Car car1 = new Car("bmw", "green");
        try {
            car1.accelerate();
            car1.accelerate();
            car1.accelerate();
            car1.accelerate();
            car1.accelerate();
        } catch (Exception e) {
            System.out.println("Exception: max speed");
        }
        Bike bike1 = new Bike();
        bike1.setColor("white");
        bike1.setSpeed(10);
    }
}
