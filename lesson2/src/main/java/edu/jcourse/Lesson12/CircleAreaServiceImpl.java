package edu.jcourse.Lesson12;

public class CircleAreaServiceImpl implements CircleAreaService {
    @Override
    public float calculateArea(float radius) {

        float circleArea = Pi * radius * radius;

        return circleArea;
    }

    @Override
    public float rectangleArea(float a, float b) {
        float rectangleArea = a * b;

        return rectangleArea;
    }
}
