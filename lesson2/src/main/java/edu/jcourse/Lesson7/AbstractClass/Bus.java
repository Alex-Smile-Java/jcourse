package edu.jcourse.Lesson7.AbstractClass;

public class Bus  extends Vehicle{
    @Override
    public float distanceCityMode() {
        return (getTank() * 100) / (getFuelPer100km());
    }

    @Override
    public float distanceHighwayMode() {
        return (getTank() * 100) / (getFuelPer100km() - 3F);
    }
}
