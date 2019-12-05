package edu.jcourse.Lesson5;

import java.util.concurrent.Callable;

public class Circle {

    private float radius;
    private final float PI = 3.14F;
    private final int MY_CONST = 10;

    public float area() {
        return PI * (radius * radius);
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
