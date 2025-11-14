
public class WhatsAppDecorator extends NotificacionDecorator {

    public WhatsAppDecorator(Notificacion envoltura) {
        super(envoltura);
    }

    @Override
    public void enviar(String mensaje) {
        // Lógica propia de WhatsApp
        super.enviar(mensaje);
    }
}
