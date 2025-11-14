
public class EmailDecorator extends NotificacionDecorator {

    public EmailDecorator(Notificacion envoltura) {
        super(envoltura);
    }

    @Override
    public void enviar(String mensaje) {
        // Lógica propia de Email (ej. enviar correo)
        super.enviar(mensaje);
    }
}
