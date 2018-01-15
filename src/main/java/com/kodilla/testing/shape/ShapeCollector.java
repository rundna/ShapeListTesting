package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.lang.*;

public class ShapeCollector {
    private Shape shape;
    private ArrayList<Shape> figure = new ArrayList<Shape>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape) {

        figure.add(shape);
        //System.out.println(figure);
    }

    public void removeFigure(Shape shape) {
        figure.remove(shape);
        //System.out.println(figure);
    }
    public void getFigure(Integer n){
        Shape s = figure.get(n);
        //System.out.println(s);
    }
    public void showFigures(){
        for(Shape shape:figure){
            String s = shape.getShapeName();
            Integer n = shape.getField();
            System.out.println("Figure: " +s + " area: " +n);
        }

    }
}