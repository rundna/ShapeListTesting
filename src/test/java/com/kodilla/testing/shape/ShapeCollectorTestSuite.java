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

}