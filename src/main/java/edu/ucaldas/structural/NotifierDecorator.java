package edu.ucaldas.structural;

// TODO: Implementa el patrón Decorator.
// 1. Crea una clase abstracta NotifierDecorator que implemente Notifier.
// 2. Debe tener un campo protegido Notifier wrappee y delegar la llamada a send().

public abstract class NotifierDecorator implements Notifier {
    // TODO: agrega el atributo y constructor.

    @Override
    public String send(String message) {
        // TODO: delegar la llamada al objeto envuelto.
        return null;
    }
}

// TODO: Crea la clase SMSNotifier que extienda NotifierDecorator
// Debe agregar el comportamiento adicional:
// "SMS enviado: " + message + " | " + resultado_del_email
