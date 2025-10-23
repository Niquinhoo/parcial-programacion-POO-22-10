
public class EmpresaTransporte {
    private String nombre;
    private Vehiculo[] flota;
    private int cantidad;

    public EmpresaTransporte(String nombre, int cantidad) {
        this.nombre = nombre;
        this.flota = new Vehiculo[cantidad];
        this.cantidad = 0;
    }
    
    public void agregarVehiculo(Vehiculo v){
        if (cantidad < flota.length){
            flota[cantidad] = v;
            //cntador
            cantidad++;
        }else{
            System.out.println("Error, no podes agregar más vehiculos");
        }
    }

    public void mostrarFlota(){
        System.out.println("Flota de: " + nombre);
        
        for(int i = 0; i < cantidad ; i++){
            System.out.println(flota[i].mostrarDatos());
        }
    }

    public int calcularCapacidadTotal(){
        int total = 0;

        for(int i = 0; i < cantidad; i++){
            total += flota[i].getCapacidad();
        }

        return total;
    }
    //bbble sort
    public void ordenarPorCapacidad(){
        for(int i = 0; i < cantidad - 1; i++){
            for(int j = 0; j < cantidad - 1; j++){
                if (flota[j].getCapacidad() < flota[j+1].getCapacidad()){
                    Vehiculo aux = flota[j];
                    flota[j] = flota[j+1];
                    flota[j+1] = aux;
                }
            }
        }
    }
 
    //lineal
    public void buscarPorTipo(String tipoVehBuscado){
        System.out.println("Vehiculos tipo: " + tipoVehBuscado);
        //set encontrado falso para darle paso al algoritmo
        boolean encontrado = false;

        for (int i = 0; i < cantidad; i++){
            Vehiculo v = flota[i];
            //setea q es auto si la capacidad es menor igual a 300kg
            boolean isAuto = v.getCapacidad() >= 300;

            if(tipoVehBuscado.equals("Auto") && isAuto){
                //printea y mueve encontrado a verdadero
                System.out.println(v.mostrarDatos());
                encontrado = true;
                //determino que es camion cuando auto da falso
            } else if (tipoVehBuscado.equals("Camion") && !isAuto){
                System.out.println(v.mostrarDatos());
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("No se encontro ningun vehiculo " + tipoVehBuscado);
        }
    }
}