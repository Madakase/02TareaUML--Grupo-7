

public class AdaptadorWhatsApp implements Notificacion {

    // Atributo del diagrama
    private WhatsAppAPI servicio;

    public AdaptadorWhatsApp(WhatsAppAPI servicio) {
        this.servicio = servicio;
    }

    @Override
    public void enviar(String mensaje) {
        // Adaptación: Traduce la llamada
        servicio.sendWhatsAppMessage(mensaje);
    }
}