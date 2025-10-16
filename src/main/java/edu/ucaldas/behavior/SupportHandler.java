package edu.ucaldas.behavior;

public class SupportHandler {
    public static Handler createChain() {
        // TODO: Implementa el patrón Chain of Responsibility.
        // Crea tres manejadores concretos:
        // 1. BasicSupportHandler → maneja solicitudes "básicas"
        // 2. SupervisorHandler → maneja solicitudes "intermedias"
        // 3. ManagerHandler → maneja solicitudes "avanzadas"
        // Si no puede manejar, debe pasar al siguiente en la cadena.

        Handler basic = new BasicSupportHandler();
        Handler supervisor = new SupervisorHandler();
        Handler manager = new ManagerHandler();

        // Enlazamos la cadena: Basic → Supervisor → Manager
        basic.setNext(supervisor);
        supervisor.setNext(manager);

        return basic; // Retornamos el inicio de la cadena
    }
}
