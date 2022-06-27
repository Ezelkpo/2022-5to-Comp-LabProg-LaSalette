package prueba;

public class Constructor extends Persona{
    int Sueldo;
    int Impuestos;

    public Constructor(int Sueldo, int Impuestos, String Nombre, String Domicilio, String Telefono, int DNI) {
        super(Nombre, Domicilio, Telefono, DNI);
        this.Sueldo = Sueldo;
        this.Impuestos = Impuestos;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public int getImpuestos() {
        return Impuestos;
    }

    
    }
    
