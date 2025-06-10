public class Email extends NotificadorApp {

    public Email() {
        this.categoria = CategoriaNotificacion.EMAIL;
    }
    
    
    @Override
    public void procesarNotificacion(NotificadorApp.CategoriaNotificacion categoria, String mensaje) {
        System.out.println("📧 Procesando notificación por EMAIL...");
        enviar(mensaje);
    }
    
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando EMAIL: " + mensaje);
    }

}
