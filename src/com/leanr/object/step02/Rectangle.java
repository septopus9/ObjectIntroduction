package com.leanr.object.step02;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int area(){
        return width*length;
    }
    public int perimeter(){
        return  2*(width+length);
    }

    @Override
    public String toString() {
        return String.format("length - %d, width - %d, area -%d, - perimeter -%d",length,width,area(),perimeter());
    }
}
