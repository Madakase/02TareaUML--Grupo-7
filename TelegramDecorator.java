public class TelegramDecorator extends NotificacionDecorator {

    public TelegramDecorator(Notificacion envoltura) {
        super(envoltura);
    }

    @Override
    public void enviar(String mensaje) {
        // Lógica propia de Telegram
        super.enviar(mensaje);
    }
}