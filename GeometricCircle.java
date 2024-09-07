/*Program Name: GeometricCircle.java
 * Authors: Austin P
 * Date last Updated: 9/6/2024
 * Purpose: This program is the driver for the GeometricObject and Circle classes that outputs
 * the test cases 
 */
public class GeometricCircle {
    public static void main(String[] args) {
        // Create two Circle objects with different radius and a 3rd with the same radius as the first
        Circle circle1 = new Circle(5.0, "red", true);
        Circle circle2 = new Circle(7.0, "blue", false);
        Circle circle3 = new Circle(5.0); // Same radius as circle1

        // Display the properties of circles 1 and 2 but not 3
        System.out.println("Circle 1: " + circle1);
        System.out.println("The area of Circle 1 is: " + circle1.getArea());
        System.out.println("The perimeter of Circle 1 is: " + circle1.getPerimeter());

        System.out.println("Circle 2: " + circle2);
        System.out.println("The area of Circle 2 is: " + circle2.getArea());
        System.out.println("The perimeter of Circle 2 is: " + circle2.getPerimeter());

        // Tests the equals method to see if Circle 1 and Circle 3 are equal
        System.out.println("Circle 1 equals Circle 3: " + circle1.equals(circle3));

        // Tests the compareTo method to see if Circle 1 is smaller than Circle 2
        if (circle1.compareTo(circle2) < 0) {
            System.out.println("Circle 1 is smaller than Circle 2.");
        } else if (circle1.compareTo(circle2) > 0) {
            System.out.println("Circle 1 is larger than Circle 2.");
        } else {
            System.out.println("Circle 1 is equal to Circle 2.");
        }
    }
}
