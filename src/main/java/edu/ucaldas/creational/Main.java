package edu.ucaldas.creational;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape s1 = factory.createShape("circle");
        Shape s2 = factory.createShape("square");
        Shape s3 = factory.createShape("triangle"); // tipo no válido

        System.out.println(s1 != null ? s1.draw() : "Forma no reconocida.");
        System.out.println(s2 != null ? s2.draw() : "Forma no reconocida.");
        System.out.println(s3 != null ? s3.draw() : "Forma no reconocida.");
    }
}
