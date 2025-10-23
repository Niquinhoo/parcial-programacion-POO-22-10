public class Camion extends Vehiculo{
    private double capacidadCarga;
    
    public Camion(String patente, String marca, int capacidad, double capacidadCarga){
        super(patente, marca, capacidad);
        this.capacidadCarga = capacidadCarga;
    }

    //get set Camion cantidadccarga
    public double getcapacidadCarga(){
        return capacidadCarga;
    }

    public void setcapacidadCarga(double capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    //sHowup
    public String mostrarDatos(){
        return "Camion: " + getMarca() + "Carga: " + capacidadCarga + "Toneladas";
    }
}
