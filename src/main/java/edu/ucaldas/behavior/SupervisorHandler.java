package edu.ucaldas.behavior;

public class SupervisorHandler extends Handler {
    @Override
    public String handleRequest(String request) {
        if (request.equalsIgnoreCase("intermedia")) {
            return "✅ Solicitud intermedia atendida por el Supervisor.";
        } else if (next != null) {
            return next.handleRequest(request);
        } else {
            return "❌ Ningún nivel pudo manejar la solicitud.";
        }
    }
}
