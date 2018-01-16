package com.kodilla.testing.shape;

class Square implements Shape {
    private String item;
    private Double n;

    public Square(String item, Double n) {
        this.item = item;
        this.n = n*n;
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
        final Square e = (Square) o;
       return this.item.equals(e.item) && this.n.equals(e.n);}


}

