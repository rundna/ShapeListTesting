package com.kodilla.testing.shape;

class Circle implements Shape {
    private String item;
    private Double n;

    public Circle(String item, Double n) {
        this.item = item;
        this.n = 3.14 * n *n;
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
        final Circle e = (Circle) o;
        return this.item.equals(e.item) && this.n.equals(e.n);}


}

