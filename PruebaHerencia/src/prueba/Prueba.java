package prueba;

import java.util.ArrayList;

public class Prueba {

    public static void main(String[] args) {
        Constructor ct1 = new Constructor (200,20,"Juan","Bolivia 1100","+54 11 3852-4782",46443107);
        Constructor ct2 = new Constructor (300,20,"Facundo","Deheza 2943","54 11 2709-2398",46579067);
        Consultor cl1 = new Consultor (6,50,"Santiago","Cramer 3407","54 11 2256-9891",46759593);
        Consultor cl2 = new Consultor (7,45,"Ezequiel","Aguero 1169","54 11 4487-1943",46522538);
        Operario op1 = new Operario ("Facundo",8,"Dulce","Vieytes 2393","54 11 5722-7745",44345266);
        Operario op2 = new Operario ("Juan",8,"Franco","Mariano Acha 2423","54 11 2223-3332", 44555666);
        
        ArrayList <Constructor>Constructores = new ArrayList ();
        ArrayList <Consultor>Consultores = new ArrayList ();
        ArrayList <Operario>Operarios = new ArrayList ();
        Constructores.add (ct1); Constructores.add (ct2);
        Consultores.add (cl1); Consultores.add (cl2);
        Operarios.add (op1); Operarios.add (op2);
        
        CalcularSueldos(Constructores,Consultores,Operarios);
        ConsultorMasHoras(Consultores);
        Informe(Operarios);
    }

    private static void CalcularSueldos(ArrayList<Constructor> Constructores, ArrayList<Consultor> Consultores, ArrayList<Operario> Operarios) {
        int SumaCt = Constructores.get(1).getSueldo() + Constructores.get(0).getSueldo();
        int SumaCl = (int) (Consultores.get(1).getTarifaxHora()* Consultores.get(1).getHorasTrabajadas() + Consultores.get(0).getTarifaxHora() * Consultores.get(0).getHorasTrabajadas());
        int SumaOp = Operarios.get(1).getHorasTrabajadas()* 50 + Operarios.get(0).getHorasTrabajadas()* 50;
        int SumaTt = SumaCt + SumaCl + SumaOp;
        System.out.println("Sueldo constructores: "+ SumaCt);
        System.out.println("Sueldo consultores: "+ SumaCl);
        System.out.println("Sueldo operarios: "+ SumaOp);
        System.out.println("Sueldo total: "+ SumaTt);
    }   

    private static void ConsultorMasHoras(ArrayList<Consultor> Consultores) {
    
        if (Consultores.get(0).getHorasTrabajadas()>Consultores.get(1).getHorasTrabajadas()){
            System.out.println(Consultores.get(0).getNombre() + " es el nuevo empleado del mes!");
        } else {
            System.out.println(Consultores.get(1).getNombre() + " es el nuevo empleado del mes!");
        }
    }

    private static void Informe(ArrayList<Operario> Operarios) {
        int SumaOp1 = Operarios.get(1).getHorasTrabajadas()* 50; 
        int SumaOp2 = Operarios.get(0).getHorasTrabajadas()* 50;
        System.out.println("Operario 1:\n"+ Operarios.get(0).getNombre());
        System.out.println(""+ SumaOp1);
        System.out.println("Operario 2:\n"+ Operarios.get(1).getNombre());
        System.out.println(""+ SumaOp2);
    }
    
}
