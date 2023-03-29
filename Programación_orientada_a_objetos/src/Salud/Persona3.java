package Salud;

import java.util.Scanner;

public class Persona3 {
    
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

     public Persona3(){

     }
    public Persona3(String tipoDoc, String documento, String nombre, String apellido, double peso, double estatura,
            int edad, String sexo, double pesoActual) {
        this.tipoDoc = tipoDoc;
        Documento = documento;
        Nombre = nombre;
        Apellido = apellido;
        Peso = peso;
        Estatura = estatura;
        Edad = edad;
        Sexo = sexo;
        this.pesoActual = pesoActual;
    }


     public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public void setDocumento(String documento) {
        Documento = documento;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public void setPeso(double peso) {
        Peso = peso;
    }
    public void setEstatura(double estatura) {
        Estatura = estatura;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public void setSexo(String sexo) {
        Sexo = sexo;
    }
    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }
    public String getTipoDoc() {
        return tipoDoc;
    }
    public String getDocumento() {
        return Documento;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public double getPeso() {
        return Peso;
    }
    public double getEstatura() {
        return Estatura;
    }
    public int getEdad() {
        return Edad;
    }
    public String getSexo() {
        return Sexo;
    }
    public double getPesoActual() {
        return pesoActual;
    }
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


     public void mostrarPersona(String tipoDoc, String documento, String nombre, String apellido, double peso, double estatura,
     int edad, String sexo, double pesoActua){

     System.out.println("Su tipo de documento es : " +tipoDoc+ " Su Docuemnto es : " +Documento+ " Su Nombre es : " +Nombre+"Su Apellido es: " +Apellido+"Su Peso es: " +Peso+"Su Estaturaes: " +Estatura+ "Su Edad es: " +Edad+" Sexo es: " +Sexo);
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
