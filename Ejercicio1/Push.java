public class Push extends NotificadorApp {

    public Push() {
        this.categoria = CategoriaNotificacion.PUSH;
    }

    @Override
    public void procesarNotificacion(NotificadorApp.CategoriaNotificacion categoria, String mensaje) {
        System.out.println("🔔 Procesando notificación por PUSH...");
        enviar(mensaje);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando PUSH: " + mensaje);
    }
}
