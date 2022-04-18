
package prueba;

public class Consultor {
    private String Nombre;
    private String Domicilio;
    private int Telefono;
    private int DNI;
    private double Tarifa;
    private int Horas;

    public Consultor(String Nombre, String Domicilio, int Telefono, int DNI, double Tarifa, int Horas) {
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
        this.Telefono = Telefono;
        this.DNI = DNI;
        this.Tarifa = Tarifa;
        this.Horas = Horas;
    }
    public double tarifa_por_hora(){
        return Tarifa * Horas;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getTarifa() {
        return Tarifa;
    }

    public void setTarifa(double Tarifa) {
        this.Tarifa = Tarifa;
    }

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }
    

    
    }
