public abstract class NotificadorApp {

    protected CategoriaNotificacion categoria;

    enum CategoriaNotificacion {
        EMAIL, SMS, PUSH
    }

    public abstract void procesarNotificacion(CategoriaNotificacion categoria, String mensaje);

    public abstract void enviar(String mensaje);
}
