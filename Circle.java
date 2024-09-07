/*Program Name:Circle.java
 * Authors: Austin P
 * Date last Updated: 9/6/2024
 * Purpose: This program is meant to override the GeometricObject class just like a previous
 * code called Triangle.java to calculate a circle's radius, area, and permimeter
 */
public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    // No-arg constructor
    public Circle() {
        this.radius = 1.0;
    }

    // Constructor with specified radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor with specified radius, color, and filled
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter method for the radius
    public double getRadius() {
        return radius;
    }

    // Setter method for the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Overrides getArea from GeometricObject 
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Overrides getPerimeter from GeometricObject
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Implements the compareTo method from the Comparable interface
    @Override
    public int compareTo(Circle o) {
        if (this.radius > o.radius) {
            return 1;
        } else if (this.radius < o.radius) {
            return -1;
        } else {
            return 0;
        }
    }

    // Override the equals method from Object class
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle other = (Circle) obj;
        return Double.compare(radius, other.radius) == 0;
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }
}

