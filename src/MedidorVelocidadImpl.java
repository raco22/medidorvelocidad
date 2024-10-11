import java.util.ArrayList;
import java.util.List;

public class MedidorVelocidadImpl implements MedidorVelocidad {
    private List<Vehiculo> vehiculos;

    public MedidorVelocidadImpl() {
        this.vehiculos = new ArrayList<Vehiculo>();
    }

    @Override
    public void crearVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    @Override
    public Vehiculo leerVehiculo(int id) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getId() == id) {
                return vehiculo;
            }
        }
        return null;
    }

    @Override
    public void actualizarVehiculo(Vehiculo vehiculo) {
        for (Vehiculo v : vehiculos) {
            if (v.getId() == vehiculo.getId()) {
                v.setMarca(vehiculo.getMarca());
                v.setModelo(vehiculo.getModelo());
                v.setVelocidad(vehiculo.getVelocidad());
                return;
            }
        }
    }

    @Override
    public void eliminarVehiculo(int id) {
        vehiculos.removeIf(v -> v.getId() == id);
    }
}
