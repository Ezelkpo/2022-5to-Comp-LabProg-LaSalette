package prueba;

public class Operario extends Persona{
    String ConstructoraCargo;
    int HorasTrabajadas;

    public Operario(String ConstructoraCargo, int HorasTrabajadas, String Nombre, String Domicilio, String Telefono, int DNI) {
        super(Nombre, Domicilio, Telefono, DNI);
        this.ConstructoraCargo = ConstructoraCargo;
        this.HorasTrabajadas = HorasTrabajadas;
    }

    public String getConstructoraCargo() {
        return ConstructoraCargo;
    }

    public int getHorasTrabajadas() {
        return HorasTrabajadas;
    }
    
}
