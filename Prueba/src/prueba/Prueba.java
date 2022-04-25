package prueba;
import java.util.Scanner;
public class Prueba {

    public static void main(String[] args) {
        int e1 = 0;
        int e2 = 0;
        int e3 = 0;
        int e4 = 0;
        int e5 = 0;
        int e6 = 0;
        String nom;
        String dom;
        int tel;
        int dni;
        double sueldo;
        double imp;
        double tar;
        String con;
        int hor;
        Scanner sc=new Scanner (System.in);
        System.out.println("1-Constructor 2-Consultor 3-Operario");
        System.out.println("Ingrese la clase");
        e1=sc.nextInt();
        if (e1==1){
            System.out.println("Ingrese el nombre del Constructor");
            sc.nextLine();
            nom= sc.nextLine();
            System.out.println("Ingrese el domicilio del Constructor");
            dom= sc.nextLine();
            System.out.println("Ingrese el telefono del Constructor");
            tel= sc.nextInt();
            System.out.println("Ingrese el dni del Constructor");
            dni= sc.nextInt();
            System.out.println("Ingrese el sueldo del Constructor");
            sueldo= sc.nextDouble();
            System.out.println("Ingrese el impuestos del Constructor");
            imp= sc.nextDouble();
            Constructor ct=new Constructor (nom,dom,tel,dni,sueldo,imp);
            System.out.println("Sueldo a pagar: "+sueldo);
            System.out.println("El suedo menos los impuestos es: "+ct.aguinaldo());
        }
        if (e1==2){
            System.out.println("Ingrese el nombre del Consultor");
            sc.nextLine();
            nom= sc.nextLine();
            System.out.println("Ingrese el domicilio del Consultor");
            dom= sc.nextLine();
            System.out.println("Ingrese el telefono del Consultor");
            tel= sc.nextInt();
            System.out.println("Ingrese el dni del Consultor");
            dni= sc.nextInt();
            System.out.println("Ingrese el tarifa del Consultor");
            tar= sc.nextDouble();
            System.out.println("Ingrese el horas del Consultor");
            hor= sc.nextInt();
            Consultor cl=new Consultor (nom,dom,tel,dni,tar,hor);
            System.out.println("La tarifa por hora es: "+cl.tarifa_por_hora());
        }
        if (e1==3){
            System.out.println("Ingrese el nombre del Operario");
            sc.nextLine();
            nom= sc.nextLine();
            System.out.println("Ingrese el domicilio del Operario");
            dom= sc.nextLine();
            System.out.println("Ingrese el telefono del Operario");
            tel= sc.nextInt();
            System.out.println("Ingrese el dni del Operario");
            dni= sc.nextInt();
            System.out.println("Ingrese el constructor del Operario");
            sc.nextLine();
            con= sc.nextLine();
            System.out.println("Ingrese el horas del Operario");
            hor= sc.nextInt();
            Operario op=new Operario (nom,dom,tel,dni,con,hor);
        }
        
        System.out.println("1-Constructor 2-Consultor 3-Operario");
        System.out.println("Ingrese la clase");
        e2=sc.nextInt();
        if (e2==1){
            System.out.println("Ingrese el nombre del Constructor");
            sc.nextLine();
            nom= sc.nextLine();
            System.out.println("Ingrese el domicilio del Constructor");
            dom= sc.nextLine();
            System.out.println("Ingrese el telefono del Constructor");
            tel= sc.nextInt();
            System.out.println("Ingrese el dni del Constructor");
            dni= sc.nextInt();
            System.out.println("Ingrese el sueldo del Constructor");
            sueldo= sc.nextDouble();
            System.out.println("Ingrese el impuestos del Constructor");
            imp= sc.nextDouble();
            Constructor ct=new Constructor (nom,dom,tel,dni,sueldo,imp);
            System.out.println("Sueldo a pagar: "+sueldo);
            System.out.println("El suedo menos los impuestos es: "+ct.aguinaldo());
        }
        if (e2==2){
            System.out.println("Ingrese el nombre del Consultor");
            sc.nextLine();
            nom= sc.nextLine();
            System.out.println("Ingrese el domicilio del Consultor");
            dom= sc.nextLine();
            System.out.println("Ingrese el telefono del Consultor");
            tel= sc.nextInt();
            System.out.println("Ingrese el dni del Consultor");
            dni= sc.nextInt();
            System.out.println("Ingrese el tarifa del Consultor");
            tar= sc.nextDouble();
            System.out.println("Ingrese el horas del Consultor");
            hor= sc.nextInt();
            Consultor cl=new Consultor (nom,dom,tel,dni,tar,hor);
            System.out.println("La tarifa por hora es: "+cl.tarifa_por_hora());
        }
        if (e2==3){
            System.out.println("Ingrese el nombre del Operario");
            sc.nextLine();
            nom= sc.nextLine();
            System.out.println("Ingrese el domicilio del Operario");
            dom= sc.nextLine();
            System.out.println("Ingrese el telefono del Operario");
            tel= sc.nextInt();
            System.out.println("Ingrese el dni del Operario");
            dni= sc.nextInt();
            System.out.println("Ingrese el constructor del Operario");
            sc.nextLine();
            con= sc.nextLine();
            System.out.println("Ingrese el horas del Operario");
            hor= sc.nextInt();
            Operario op=new Operario (nom,dom,tel,dni,con,hor);
        }
        System.out.println("1-Constructor 2-Consultor 3-Operario");
        System.out.println("Ingrese la clase");
        e3=sc.nextInt();
        if (e3==1){
            System.out.println("Ingrese el nombre del Constructor");
            sc.nextLine();
            nom= sc.nextLine();
            System.out.println("Ingrese el domicilio del Constructor");
            dom= sc.nextLine();
            System.out.println("Ingrese el telefono del Constructor");
            tel= sc.nextInt();
            System.out.println("Ingrese el dni del Constructor");
            dni= sc.nextInt();
            System.out.println("Ingrese el sueldo del Constructor");
            sueldo= sc.nextDouble();
            System.out.println("Ingrese el impuestos del Constructor");
            imp= sc.nextDouble();
            Constructor ct=new Constructor (nom,dom,tel,dni,sueldo,imp);
            System.out.println("Sueldo a pagar: "+sueldo);
            System.out.println("El suedo menos los impuestos es: "+ct.aguinaldo());
        }
        if (e3==2){
            System.out.println("Ingrese el nombre del Consultor");
            sc.nextLine();
            nom= sc.nextLine();
            System.out.println("Ingrese el domicilio del Consultor");
            dom= sc.nextLine();
            System.out.println("Ingrese el telefono del Consultor");
            tel= sc.nextInt();
            System.out.println("Ingrese el dni del Consultor");
            dni= sc.nextInt();
            System.out.println("Ingrese el tarifa del Consultor");
            tar= sc.nextDouble();
            System.out.println("Ingrese el horas del Consultor");
            hor= sc.nextInt();
            Consultor cl=new Consultor (nom,dom,tel,dni,tar,hor);
            System.out.println("La tarifa por hora es: "+cl.tarifa_por_hora());
        }
        if (e3==3){
            System.out.println("Ingrese el nombre del Operario");
            sc.nextLine();
            nom= sc.nextLine();
            System.out.println("Ingrese el domicilio del Operario");
            dom= sc.nextLine();
            System.out.println("Ingrese el telefono del Operario");
            tel= sc.nextInt();
            System.out.println("Ingrese el dni del Operario");
            dni= sc.nextInt();
            System.out.println("Ingrese el constructor del Operario");
            sc.nextLine();
            con= sc.nextLine();
            System.out.println("Ingrese el horas del Operario");
            hor= sc.nextInt();
            Operario op=new Operario (nom,dom,tel,dni,con,hor);
        }
        System.out.println("1-Constructor 2-Consultor 3-Operario");
        System.out.println("Ingrese la clase");
        e4=sc.nextInt();
        if (e4==1){
            System.out.println("Ingrese el nombre del Constructor");
            sc.nextLine();
            nom= sc.nextLine();
            System.out.println("Ingrese el domicilio del Constructor");
            dom= sc.nextLine();
            System.out.println("Ingrese el telefono del Constructor");
            tel= sc.nextInt();
            System.out.println("Ingrese el dni del Constructor");
            dni= sc.nextInt();
            System.out.println("Ingrese el sueldo del Constructor");
            sueldo= sc.nextDouble();
            System.out.println("Ingrese el impuestos del Constructor");
            imp= sc.nextDouble();
            Constructor ct=new Constructor (nom,dom,tel,dni,sueldo,imp);
            System.out.println("Sueldo a pagar: "+sueldo);
            System.out.println("El suedo menos los impuestos es: "+ct.aguinaldo());
        }
        if (e4==2){
            System.out.println("Ingrese el nombre del Consultor");
            sc.nextLine();
            nom= sc.nextLine();
            System.out.println("Ingrese el domicilio del Consultor");
            dom= sc.nextLine();
            System.out.println("Ingrese el telefono del Consultor");
            tel= sc.nextInt();
            System.out.println("Ingrese el dni del Consultor");
            dni= sc.nextInt();
            System.out.println("Ingrese el tarifa del Consultor");
            tar= sc.nextDouble();
            System.out.println("Ingrese el horas del Consultor");
            hor= sc.nextInt();
            Consultor cl=new Consultor (nom,dom,tel,dni,tar,hor);
            System.out.println("La tarifa por hora es: "+cl.tarifa_por_hora());
        }
        if (e4==3){
            System.out.println("Ingrese el nombre del Operario");
            sc.nextLine();
            nom= sc.nextLine();
            System.out.println("Ingrese el domicilio del Operario");
            dom= sc.nextLine();
            System.out.println("Ingrese el telefono del Operario");
            tel= sc.nextInt();
            System.out.println("Ingrese el dni del Operario");
            dni= sc.nextInt();
            System.out.println("Ingrese el constructor del Operario");
            sc.nextLine();
            con= sc.nextLine();
            System.out.println("Ingrese el horas del Operario");
            hor= sc.nextInt();
            Operario op=new Operario (nom,dom,tel,dni,con,hor);
        }
        System.out.println("1-Constructor 2-Consultor 3-Operario");
        System.out.println("Ingrese la clase");
        e5=sc.nextInt();
        if (e5==1){
            System.out.println("Ingrese el nombre del Constructor");
            sc.nextLine();
            nom= sc.nextLine();
            System.out.println("Ingrese el domicilio del Constructor");
            dom= sc.nextLine();
            System.out.println("Ingrese el telefono del Constructor");
            tel= sc.nextInt();
            System.out.println("Ingrese el dni del Constructor");
            dni= sc.nextInt();
            System.out.println("Ingrese el sueldo del Constructor");
            sueldo= sc.nextDouble();
            System.out.println("Ingrese el impuestos del Constructor");
            imp= sc.nextDouble();
            Constructor ct=new Constructor (nom,dom,tel,dni,sueldo,imp);
            System.out.println("Sueldo a pagar: "+sueldo);
            System.out.println("El suedo menos los impuestos es: "+ct.aguinaldo());
        }
        if (e5==2){
            System.out.println("Ingrese el nombre del Consultor");
            sc.nextLine();
            nom= sc.nextLine();
            System.out.println("Ingrese el domicilio del Consultor");
            dom= sc.nextLine();
            System.out.println("Ingrese el telefono del Consultor");
            tel= sc.nextInt();
            System.out.println("Ingrese el dni del Consultor");
            dni= sc.nextInt();
            System.out.println("Ingrese el tarifa del Consultor");
            tar= sc.nextDouble();
            System.out.println("Ingrese el horas del Consultor");
            hor= sc.nextInt();
            Consultor cl=new Consultor (nom,dom,tel,dni,tar,hor);
            System.out.println("La tarifa por hora es: "+cl.tarifa_por_hora());
        }
        if (e5==3){
            System.out.println("Ingrese el nombre del Operario");
            sc.nextLine();
            nom= sc.nextLine();
            System.out.println("Ingrese el domicilio del Operario");
            dom= sc.nextLine();
            System.out.println("Ingrese el telefono del Operario");
            tel= sc.nextInt();
            System.out.println("Ingrese el dni del Operario");
            dni= sc.nextInt();
            System.out.println("Ingrese el constructor del Operario");
            sc.nextLine();
            con= sc.nextLine();
            System.out.println("Ingrese el horas del Operario");
            hor= sc.nextInt();
            Operario op=new Operario (nom,dom,tel,dni,con,hor);
        }
        System.out.println("1-Constructor 2-Consultor 3-Operario");
        System.out.println("Ingrese la clase");
        e6=sc.nextInt();
        if (e6==1){
            System.out.println("Ingrese el nombre del Constructor");
            sc.nextLine();
            nom= sc.nextLine();
            System.out.println("Ingrese el domicilio del Constructor");
            dom= sc.nextLine();
            System.out.println("Ingrese el telefono del Constructor");
            tel= sc.nextInt();
            System.out.println("Ingrese el dni del Constructor");
            dni= sc.nextInt();
            System.out.println("Ingrese el sueldo del Constructor");
            sueldo= sc.nextDouble();
            System.out.println("Ingrese el impuestos del Constructor");
            imp= sc.nextDouble();
            Constructor ct=new Constructor (nom,dom,tel,dni,sueldo,imp);
            System.out.println("Sueldo a pagar: "+sueldo);
            System.out.println("El suedo menos los impuestos es: "+ct.aguinaldo());
        }
        if (e6==2){
            System.out.println("Ingrese el nombre del Consultor");
            sc.nextLine();
            nom= sc.nextLine();
            System.out.println("Ingrese el domicilio del Consultor");
            dom= sc.nextLine();
            System.out.println("Ingrese el telefono del Consultor");
            tel= sc.nextInt();
            System.out.println("Ingrese el dni del Consultor");
            dni= sc.nextInt();
            System.out.println("Ingrese el tarifa del Consultor");
            tar= sc.nextDouble();
            System.out.println("Ingrese el horas del Consultor");
            hor= sc.nextInt();
            Consultor cl=new Consultor (nom,dom,tel,dni,tar,hor);
            System.out.println("La tarifa por hora es: "+cl.tarifa_por_hora());
        }
        if (e6==3){
            System.out.println("Ingrese el nombre del Operario");
            sc.nextLine();
            nom= sc.nextLine();
            System.out.println("Ingrese el domicilio del Operario");
            dom= sc.nextLine();
            System.out.println("Ingrese el telefono del Operario");
            tel= sc.nextInt();
            System.out.println("Ingrese el dni del Operario");
            dni= sc.nextInt();
            System.out.println("Ingrese el constructor del Operario");
            sc.nextLine();
            con= sc.nextLine();
            System.out.println("Ingrese el horas del Operario");
            hor= sc.nextInt();
            Operario op=new Operario (nom,dom,tel,dni,con,hor);
        }
        
    }
    }
    
