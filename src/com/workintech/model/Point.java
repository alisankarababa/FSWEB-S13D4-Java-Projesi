package com.workintech.model;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point p) {

        int dX = x - p.getX();
        int dY = y - p.getY();

        return Math.sqrt( dX * dX + dY * dY);
    }

    public double distance() {
        return distance(new Point(0, 0));
    }

    public double distance(int x0, int y0) {
        return distance(new Point(x0, y0));
    }
}
