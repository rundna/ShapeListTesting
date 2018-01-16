package com.kodilla.testing.shape;

class Triangle implements Shape {
    private String item;
    private Double n;

    public Triangle(String item, Double a, Double h) {
        this.item = item;
        this.n = (a * h)/2;
    }

    public String getShapeName(){
        return item;
    }
    public Double getField(){
        return n;
    }
    public String toString(){
        return item + " " +n;
    }
    @Override
    public boolean equals(Object o){
        final Triangle e = (Triangle) o;
        return this.item.equals(e.item) && this.n.equals(e.n);}

}

