package com.kodilla.testing.shape;

public class App {

    public static void main(String[] args) {
        Circle c = new Circle("circle", 2.0);
        Triangle t = new Triangle("triangle", 2.0, 3.0);
        Square s = new Square("square", 4.0);
        //System.out.println(c.getField());
        ShapeCollector drawer = new ShapeCollector();
        drawer.addFigure(c);
        drawer.addFigure(t);
        drawer.addFigure(s);
        drawer.showFigures();
        drawer.removeFigure(s);
        drawer.getFigure(1);
        drawer.showFigures();

        //System.out.println(drawer.addFigure());

    }
    }
