package edu.ucaldas.creational;

// TODO: Implementa el patrón Factory Method.
// Crea un método createShape(String type) que devuelva:
// "Circle" → new Circle()
// "Square" → new Square()
// Si el tipo no existe, retorna null.

// TODO: Implementa las clases Circle y Square
// Circle → "Dibujando un círculo."
// Square → "Dibujando un cuadrado."

public class ShapeFactory {
    // Implementa el patrón Factory Method
    // Devuelve una forma según el tipo solicitado
    public Shape createShape(String type) {
        if (type == null) {
            return null;
        }

        return switch (type.toLowerCase()) {
            case "circle" -> new Circle();
            case "square" -> new Square();
            default -> null; // tipo no reconocido
        };
    }
}

