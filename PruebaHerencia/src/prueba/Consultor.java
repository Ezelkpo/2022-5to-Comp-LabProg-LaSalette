package prueba;

public class Consultor extends Persona{
    int HorasTrabajadas;
    int TarifaxHora;

    public Consultor(int HorasTrabajadas, int TarifaxHora, String Nombre, String Domicilio, String Telefono, int DNI) {
        super(Nombre, Domicilio, Telefono, DNI);
        this.HorasTrabajadas = HorasTrabajadas;
        this.TarifaxHora = TarifaxHora;
    }

    public int getHorasTrabajadas() {
        return HorasTrabajadas;
    }

    public double getTarifaxHora() {
        return TarifaxHora;
    }

}
