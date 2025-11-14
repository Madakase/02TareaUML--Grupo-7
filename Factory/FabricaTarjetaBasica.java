package Factory;

public class FabricaTarjetaBasica implements FabricaTarjeta {

    @Override
    public TarjetaCredito crearTarjeta() {
        // Lógica para instanciar y retornar una TarjetaBasica
        return new TarjetaBasica();
    }
}
