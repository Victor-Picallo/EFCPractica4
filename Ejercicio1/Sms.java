public class Sms extends NotificadorApp {

    public Sms() {
        this.categoria = CategoriaNotificacion.SMS;
    }

    @Override
    public void procesarNotificacion(NotificadorApp.CategoriaNotificacion categoria, String mensaje) {
        System.out.println("📱 Procesando notificación por SMS...");
        enviar(mensaje);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }

}
