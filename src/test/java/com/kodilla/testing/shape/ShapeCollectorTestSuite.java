package com.kodilla.testing.shape;

import org.junit.*;
import java.util.*;


public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure(){
        Circle c = new Circle("circle", 2.0);
        Triangle t = new Triangle("triangle", 2.0, 3.0);
        Square s = new Square("square", 4.0);
        ShapeCollector drawer = new ShapeCollector();

        drawer.addFigure(c);
        drawer.addFigure(t);
        drawer.addFigure(s);

        Assert.assertEquals(c,drawer.getList().get(0));
        Assert.assertEquals(t,drawer.getList().get(1));
        Assert.assertEquals(s,drawer.getList().get(2));
    }
    @Test
    public void testRemoveFigure(){
        Circle c = new Circle("circle", 2.0);
        Triangle t = new Triangle("triangle", 2.0, 3.0);
        Square s = new Square("square", 4.0);
        ShapeCollector drawer = new ShapeCollector();

        drawer.addFigure(c);
        drawer.addFigure(t);
        drawer.addFigure(s);
        //System.out.println(drawer.getList().size());
        drawer.removeFigure(s);
        int size = drawer.getList().size(); //had to change from Integer
        //System.out.println(size);

        Assert.assertEquals(c,drawer.getList().get(0));
        Assert.assertEquals(t,drawer.getList().get(1));
        Assert.assertEquals(2,size);
    }
    @Test
    public void testGetFigure(){
        Circle c = new Circle("circle", 2.0);
        Triangle t = new Triangle("triangle", 2.0, 3.0);
        Square s = new Square("square", 4.0);
        ShapeCollector drawer = new ShapeCollector();

        drawer.addFigure(c);
        drawer.addFigure(t);
        drawer.addFigure(s);
        Shape checkItem = drawer.getFigure(drawer.getList().size() - 1);

        Assert.assertEquals(s,checkItem);
    }
    @Test
    public void testShowFigures(){
        Circle c = new Circle("circle", 2.0);
        Triangle t = new Triangle("triangle", 2.0, 3.0);
        Square s = new Square("square", 4.0);
        ShapeCollector drawer = new ShapeCollector();

        drawer.addFigure(c);
        drawer.addFigure(t);
        drawer.addFigure(s);

        Assert.assertEquals("circle 12.56",c.toString());
        Assert.assertEquals("triangle 3.0",t.toString());
        Assert.assertEquals("square 16.0",s.toString());


    }
}