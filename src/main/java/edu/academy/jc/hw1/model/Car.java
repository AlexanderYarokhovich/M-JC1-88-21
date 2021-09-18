package edu.academy.jc.hw1.model;

public class Car {
    private String model;
    private String color;
    private int speed;

    private Car() {
    }

    public Car(String model, String color) {

        this(model, color, 200);
        this.model = model;
        this.color = color;
    }

    private Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //    public static int accelerate(int x){
//        return  ;
//    }
//    public static int slowDown(int x){
//        return  x=x-1;
//    }
    public int accelerate() throws Exception {
        this.speed += 10;
        System.out.println(speed);
        if (this.speed >= 250){
            throw new Exception();
        }
            return this.speed;
    }
}
