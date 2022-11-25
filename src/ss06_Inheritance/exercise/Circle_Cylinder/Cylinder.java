package ss06_Inheritance.exercise.Circle_Cylinder;

import ss06_Inheritance.exercise.Circle_Cylinder.Circle;

public class Cylinder extends Circle {
    private double height ;

    public double getVolume(){
        return getArea()*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", color='" + color +
                ", height=" + height +
                '}';
    }
}
