package com.met.zensar.shpapes;


public class EquilateralTriangle extends Shape implements AreaCalculation, Printable {

    private float side_length;

    EquilateralTriangle(String name, float side) {
        super(name);
        side_length = side;
    }


    @Override
    public float getArea() {
        return (float) ((Math.sqrt(3)/4)*side_length*side_length);
    }

    @Override
    public void print() {
        System.out.println("Name: " + getShape_name());
        System.out.println("Side: " + side_length);
    }

}
