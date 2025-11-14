package Factory;
public class FabricaTarjetaVIP implements FabricaTarjeta {

    @Override
    public TarjetaCredito crearTarjeta() {
        // Lógica para instanciar y retornar una TarjetaVIP
        return new TarjetaVIP();
    }
}
