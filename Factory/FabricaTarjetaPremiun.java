package Factory;

public class FabricaTarjetaPremiun implements FabricaTarjeta {

    @Override
    public TarjetaCredito crearTarjeta() {
        // Lógica para instanciar y retornar una TarjetaPremium
        return new TarjetaPremium();
    }
}