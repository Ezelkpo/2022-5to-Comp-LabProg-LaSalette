package prueba;

public class Operario {
    private String Nombre;
    private String Domicilio;
    private int Telefono;
    private int DNI;
    private String Constructor;
    private int Horas;

    public Operario(String Nombre, String Domicilio, int Telefono, int DNI, String Constructor, int Horas) {
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
        this.Telefono = Telefono;
        this.DNI = DNI;
        this.Constructor = Constructor;
        this.Horas = Horas;
    }
    
    public double tarifa_por_hora(){
        return 50 * Horas;
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

    public String getConstructor() {
        return Constructor;
    }

    public void setConstructor(String Constructor) {
        this.Constructor = Constructor;
    }

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }
    
    
}
