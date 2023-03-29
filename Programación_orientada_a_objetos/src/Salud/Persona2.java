package Salud;

import java.util.Scanner;

public class Persona2 {
    
    // atributos 

     private String tipoDoc;
     private String Documento;
     private String Nombre;
     private String Apellido;
     private double Peso;
     private double Estatura;
     private int Edad;
     private String Sexo;    
     public double pesoActual;
     

     //metodos

     public void pedirDatos(){
     Scanner captura=new Scanner(System.in);
     System.out.println("por favor digite el tipo de documento que usted tiene");
     tipoDoc=captura.next();
     System.out.println("por favor digite su documento ");
     Documento=captura.next();
     System.out.println("por favor digite su Nombre");
     Nombre=captura.next();
     System.out.println("por favor digite su Apellido");
     Apellido=captura.next();
     System.out.println("por favor digite su Peso");
     Peso=captura.nextDouble();
     System.out.println("por favor digite Estatura");
     Estatura=captura.nextDouble();
     System.out.println("por favor digite su Edad");
     Edad=captura.nextInt();
     System.out.println("por favor digite su Sexo");
     Sexo=captura.next();
     }

     public void mostrarPersona(){

        System.out.println("Su tipo de documento es: " +tipoDoc);
        System.out.println("Su Docuemnto es: " +Documento);
        System.out.println("Su Nombre es: " +Nombre);
        System.out.println("Su Apellido es: " +Apellido);
        System.out.println("Su Peso es: " +Peso);
        System.out.println("Su Estaturaes: " +Estatura);
        System.out.println("Su Edad es: " +Edad);
        System.out.println("Su Sexo es: " +Sexo);
}

public int calcularIMc(int peso, double Estatura){

    pesoActual=(peso/Estatura)*2;
    
    if (pesoActual <20) {
        System.out.println("PESO BAJO");
        
     }    
        else if (pesoActual <=20 && pesoActual <=25) {
        System.out.println("PESO IDEAL ");
     }
         
        else {
            System.out.println(" SOBREPESO");
     }  
     return (int) pesoActual;
}

public void mayorEdad(){

    if (Edad<18) {
        System.out.println("Usted es menor de edad");
    }
    else{
        System.out.println("usted es mayor de edad");
    }
}
}
