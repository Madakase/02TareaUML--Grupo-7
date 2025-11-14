
public class SMSDecorator extends NotificacionDecorator {

    public SMSDecorator(Notificacion envoltura) {
        super(envoltura);
    }

    @Override
    public void enviar(String mensaje) {
        // Lógica propia de SMS (ej. enviar SMS)
        
        // Llamada al método padre (que llamará a la envoltura)
        super.enviar(mensaje);
    }
}