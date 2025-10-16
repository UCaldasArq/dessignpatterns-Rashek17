package edu.ucaldas.behavior;

public class ManagerHandler extends Handler {
    @Override
    public String handleRequest(String request) {
        if (request.equalsIgnoreCase("avanzada")) {
            return "✅ Solicitud avanzada atendida por el Gerente.";
        } else if (next != null) {
            return next.handleRequest(request);
        } else {
            return "❌ Ningún nivel pudo manejar la solicitud.";
        }
    }
}
