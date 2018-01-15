package com.kodilla.testing.shape;

public class App {

    public static void main(String[] args) {
        Circle c = new Circle("circle", 10);
        Triangle t = new Triangle("triangle", 100);
        Square s = new Square("square", 130);

        ShapeCollector drawer = new ShapeCollector(c);
        drawer.addFigure(c);
        drawer.addFigure(t);
        drawer.addFigure(s);
        drawer.removeFigure(s);
        drawer.getFigure(1);
        drawer.showFigures();
    }
    }
