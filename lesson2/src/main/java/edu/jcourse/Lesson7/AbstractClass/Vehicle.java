package edu.jcourse.Lesson7.AbstractClass;

public abstract class Vehicle {
    private int tank;
    private float fuelPer100km;

    public float distance(boolean isHighway) {
        if (isHighway) {
            return distanceHighwayMode();
        } else {
            return distanceCityMode();
        }
    }


    public int getTank() {
        return tank;
    }

    public abstract float distanceCityMode();

    public abstract float distanceHighwayMode();


    public void setTank(int tank) {
        this.tank = tank;
    }

    public float getFuelPer100km() {
        return fuelPer100km;
    }

    public void setFuelPer100km(float fuelPer100km) {
        this.fuelPer100km = fuelPer100km;
    }
}
