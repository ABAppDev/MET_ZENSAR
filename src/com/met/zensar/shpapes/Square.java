package com.met.zensar.shpapes;

public class Square extends Shape implements AreaCalculation, Printable {

    private float side_length;

    Square(String name, float side) {
        super(name);
        side_length = side;
    }


    @Override
    public float getArea() {
        return side_length * side_length;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getShape_name());
        System.out.println("Side: " + side_length);
    }


}
