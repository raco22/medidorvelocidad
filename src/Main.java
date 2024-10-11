public class Main {
    public static void main(String[] args) {
        MedidorVelocidad medidor = new MedidorVelocidadImpl();

        try {
            // Se Utiliza para Crear el vehículo
            Vehiculo vehiculo1 = new Vehiculo(1, "Toyota", "Corolla", 120);
            medidor.crearVehiculo(vehiculo1);

            // Se Utiliza para leer el vehículo
            Vehiculo vehiculoLeido = medidor.leerVehiculo(1);
            System.out.println("Vehículo leído: " + vehiculoLeido.getMarca() + " " + vehiculoLeido.getModelo() + " con velocidad " + vehiculoLeido.getVelocidad() + " km/h");

            // Se utiliza para Actualizar los vehículos
            Vehiculo vehiculoActualizar = new Vehiculo(1, "Toyota", "Corolla", 140);
            medidor.actualizarVehiculo(vehiculoActualizar);

            // Se Utiliza para leer vehículo actualizado
            Vehiculo vehiculoLeidoActualizado = medidor.leerVehiculo(1);
            System.out.println("Vehículo actualizado: " + vehiculoLeidoActualizado.getMarca() + " " + vehiculoLeidoActualizado.getModelo() + " con velocidad " + vehiculoLeidoActualizado.getVelocidad() + " km/h");

            // Eliminar vehículo
            medidor.eliminarVehiculo(1);

            // Se Utiliza para intentar leer el vehículo eliminado
            Vehiculo vehiculoEliminado = medidor.leerVehiculo(1);
            if (vehiculoEliminado == null) {
                System.out.println("Vehículo eliminado");
            } else {
                System.out.println("Vehículo no eliminado");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}