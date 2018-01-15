package com.kodilla.testing.shape;

class Triangle implements Shape {
    private String item;
    private Integer n;

    public Triangle(String item, Integer n) {
        this.item = item;
        this.n = n;
    }

    public String getShapeName(){
        return item;
    }
    public Integer getField(){
        return n;
    }
    public String toString(){
        return item + " " +n;
    }


}

