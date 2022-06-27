package prueba;

public class Persona {
    String Nombre;
    String Domicilio;
    String Telefono;
    int DNI;

    public Persona(String Nombre, String Domicilio, String Telefono, int DNI) {
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
        this.Telefono = Telefono;
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public String getTelefono() {
        return Telefono;
    }

    public int getDNI() {
        return DNI;
    }

}

