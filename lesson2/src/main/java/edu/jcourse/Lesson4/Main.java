package edu.jcourse.Lesson4;

public class Main {
    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle();
        miniVan.passenger = 7;
        miniVan.tank = 70;
        miniVan.fuelPer100km = 8.5F;
        miniVan.name = "MiniVan";
        miniVan.distance();

        Vehicle Sedan = new Vehicle("Sedan", 5, 70, 7F);
        System.out.println("Sedan Distance: " + Sedan.distance());

       // System.out.println("MiniVan: " + miniVan.passenger + " " + miniVan.tank + " " + miniVan.fuelPer100km);

        Vehicle sportCar = new Vehicle();

        sportCar.passenger = 2;
        sportCar.tank = 50;
        sportCar.fuelPer100km = 18.5F;
        sportCar.name = "SportCar";
        sportCar.distance();

       // System.out.println("SportCar: " + sportCar.passenger + " " + sportCar.tank + " " + sportCar.fuelPer100km);
    }
}
