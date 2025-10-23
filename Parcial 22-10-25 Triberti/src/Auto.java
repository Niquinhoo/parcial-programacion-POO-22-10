public class Auto extends Vehiculo{
    private int cantidadPasajeros;
    
    public Auto(String patente, String marca, int capacidad, int cantidadPasajeros){
        super(patente, marca, capacidad);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    //get set auto cantidadpasjaeros
    public int getcantidadPasajeros(){
        return cantidadPasajeros;
    }

    public void setcantidadPasajeros(int cantidadPasajeros){
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    //sjowup
    public String mostrarDatos(){
        return "Auto: " + getMarca() + "Pasajeros: " + cantidadPasajeros;
    }
}
