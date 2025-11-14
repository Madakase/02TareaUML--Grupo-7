public abstract class NotificacionDecorator implements Notificacion {

    private Notificacion envoltura;

    public NotificacionDecorator(Notificacion envoltura) {
        this.envoltura = envoltura;
    }

    @Override
    public void enviar(String mensaje) {
        // Delega la llamada al objeto envuelto
        envoltura.enviar(mensaje);
    }
}