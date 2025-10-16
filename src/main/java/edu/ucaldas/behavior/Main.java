package edu.ucaldas.behavior;

public class Main {
    public static void main(String[] args) {
        Handler chain = SupportHandler.createChain();

        System.out.println(chain.handleRequest("básica"));
        System.out.println(chain.handleRequest("intermedia"));
        System.out.println(chain.handleRequest("avanzada"));
        System.out.println(chain.handleRequest("desconocida"));
    }
}
