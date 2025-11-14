
public class SignalDecorator extends NotificacionDecorator {

    public SignalDecorator(Notificacion envoltura) {
        super(envoltura);
    }

    @Override
    public void enviar(String mensaje) {
        // Lógica propia de Signal
        super.enviar(mensaje);
    }
}