//Logica de cliente

import java.util.List;

public class Cliente {

    private String nombre;
    private List<Notificacion> notificaciones;
    public void enviarAviso(String mensaje) {
        // Lógica para usar el notificador
        for (Notificacion notificador : notificaciones) {
            notificador.enviar(mensaje);
        }
    }
}