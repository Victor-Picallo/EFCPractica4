
public class Main {

    public static void main(String[] args) {

        NotificadorApp email = new Email();
        NotificadorApp sms = new Sms();
        NotificadorApp push = new Push();

        email.procesarNotificacion(email.categoria, "Hola por email");
        sms.procesarNotificacion(sms.categoria, "Hola por SMS");
        push.procesarNotificacion(push.categoria, "Hola por Push");
    }
}