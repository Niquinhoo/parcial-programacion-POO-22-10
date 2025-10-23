public class App {
    public static void main(String[] args) throws Exception {
        Vehiculo chata1 = new Vehiculo("AD470WG ", " Ford ", 1000);
        Vehiculo auto1 = new Vehiculo("DJZ673 ", " Chevrolet ", 150);
        Vehiculo camion1 = new Vehiculo("AH469VI ", " Scania ", 20000);

        EmpresaTransporte empresa = new EmpresaTransporte("JuanCamionera", 3);
        //asignar vehiculos
        empresa.agregarVehiculo(camion1);
        empresa.agregarVehiculo(chata1);
        empresa.agregarVehiculo(auto1);
        //cargar flota original
        empresa.mostrarFlota();
        //ordenamineto
        empresa.ordenarPorCapacidad();
        System.out.println("Flota ordenada por capacidad de kilos: ");
        empresa.mostrarFlota();
        //busqueda vehiculos
        empresa.buscarPorTipo("Auto");
        empresa.buscarPorTipo("Camion");
        //calculo capacidad
        int totalCapacidad = empresa.calcularCapacidadTotal();
        System.out.println("\nCapacidad total operativa en la empresa: " + totalCapacidad + " kg");
    }
}
