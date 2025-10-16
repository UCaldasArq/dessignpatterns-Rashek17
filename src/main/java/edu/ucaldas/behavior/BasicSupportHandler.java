package edu.ucaldas.behavior;

public class BasicSupportHandler extends Handler {
    @Override
    public String handleRequest(String request) {
        if (request.equalsIgnoreCase("básica")) {
            return "✅ Solicitud básica atendida por Soporte Básico.";
        } else if (next != null) {
            return next.handleRequest(request);
        } else {
            return "❌ Ningún nivel pudo manejar la solicitud.";
        }
    }
}
