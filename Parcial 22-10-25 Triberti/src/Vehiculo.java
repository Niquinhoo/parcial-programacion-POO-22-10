public class Vehiculo {
    private String patente;
    private String marca;
    private int capacidad;

    public Vehiculo(String patente, String marca, int capacidad){
        this.patente = patente;
        this.marca = marca;
        this.capacidad = capacidad;
    }

    //get set patente
    public String getPatente(){
        return patente;
    }

    public void setPatente(String patente){
        this.patente = patente;
    }

    //get set marca
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    //get set capacidad
    public int getCapacidad(){
        return capacidad;
    }

    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

    //showwwwwup
    public String mostrarDatos(){
        return "Vehiculo: " + patente + "Marca: " + marca + "Capacidad: " + capacidad;
    }
}
