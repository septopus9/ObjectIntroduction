package com.leanr.object;

public class Square {
    private int side;

    public Square(int side) {
       if (side < 0){
           this.side=-1;
       }else {
           this.side=side;
       }
    }

    public int calculateArea() {
        // TODO: Calculate and return the area of the square
        return side*side;


    }

    public int calculatePerimeter() {
        // TODO: Calculate and return the perimeter of the square

            return 4*side;


    }

    public static void main(String[] args) {



    }
}
