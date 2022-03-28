package ej10array;

import java.util.ArrayList;

public class Ej10Array {

    public static void main(String[] args) {
        ArrayList <Empleado> lista= new ArrayList ();
        Empleado e1 = new Empleado ("Pepe", 9, 500);
        Empleado e2 = new Empleado ("Tilin", 20, 1500);
        Empleado e3 = new Empleado ("Jose", 12, 1000);
        Empleado e4 = new Empleado ("Ana", 42, 4000);
        Empleado e5 = new Empleado ("Napo", 60, 2500);
        lista.add (e1);
        lista.add (e2);
        lista.add (e3);
        lista.add (e4);
        lista.add (e5);
       
        for (int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).sueldoBruto());
        }
    }
}
    
    

