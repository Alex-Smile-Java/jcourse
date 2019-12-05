package edu.jcourse.Lesson4;

public class Vehicle {

    String name;
    int passenger;
    int tank;
    float fuelPer100km;

    Vehicle() {
        System.out.println(" Car parametrs ");

    }

         Vehicle(String name, int passenger, int tank, float fuelPer100km) {

        this.name = name;
        this.passenger = passenger;
        this.tank = tank;
        this.fuelPer100km = fuelPer100km;
    }
        public float distance() {
        return (tank * 100) / fuelPer100km;
        }

        public float distance(boolean isHighWay) {
        if (isHighWay) {
            return  (tank * 100) / (fuelPer100km - 1.5F);
        } else {
            return (tank * 100) / fuelPer100km;
        }
        }


}
