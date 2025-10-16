package edu.ucaldas.structural;

public class Main {
    public static void main(String[] args) {
        // Notificador base: solo email
        Notifier emailNotifier = new EmailNotifier();
        System.out.println(emailNotifier.send("Hola desde soporte."));

        // Notificador decorado con SMS
        Notifier smsEmailNotifier = new SMSNotifier(emailNotifier);
        System.out.println(smsEmailNotifier.send("Actualización del sistema."));
    }
}
