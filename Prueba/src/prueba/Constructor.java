package prueba;

public class Constructor {
    private String Nombre;
    private String Domicilio;
    private int Telefono;
    private int DNI;
    private double Sueldo;
    private double Impuestos;

    public Constructor(String Nombre, String Domicilio, int Telefono, int DNI, double Sueldo, double Impuestos) {
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
        this.Telefono = Telefono;
        this.DNI = DNI;
        this.Sueldo = Sueldo;
        this.Impuestos = Impuestos;
    }

       public double aguinaldo (){
           return Sueldo - Impuestos;
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

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public double getImpuestos() {
        return Impuestos;
    }

    public void setImpuestos(double Impuestos) {
        this.Impuestos = Impuestos;
    }
    
    
}
