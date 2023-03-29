package Salud;
import java.util.Scanner;
public class Empleado extends Persona3{

    private String Cargo;
    private String Departamento;
    private double Valorhora=0;
    private double HorasTrabajadas=0;
    public  double Totalpagar=0;
    public  double Totalpagarr=0;
    private double Reteica=0;

    Scanner captura=new Scanner(System.in);
    
    public Empleado() {
    }
   public Empleado(String tipoDoc, String documento, String nombre, String apellido, double peso, double estatura,
            int edad, String sexo, double pesoActual, String Cargo,String Departamento, double horasTrabajadas , double Valorhora, double Totalpagar ) {
    super(tipoDoc, documento, nombre, apellido, peso, estatura, edad, sexo, pesoActual);
          this.Cargo=Cargo;
          this.Departamento=Departamento;
          this.Valorhora=Valorhora;
          this.HorasTrabajadas=horasTrabajadas;
          this.Totalpagar=Totalpagar;
            }




    public double getTotalpagarr() {
    return Totalpagarr;
}
public void setTotalpagarr(double totalpagarr) {
    Totalpagarr = totalpagarr;
}
public double getReteica() {
    return Reteica;
}
public void setReteica(double reteica) {
    Reteica = reteica;
}
public Scanner getCaptura() {
    return captura;
}
public void setCaptura(Scanner captura) {
    this.captura = captura;
}
    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }
    public String getDepartamento() {
        return Departamento;
    }
    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }
    public double getValorhora() {
        return Valorhora;
    }
    public void setValorhora(double valorhora) {
        Valorhora = valorhora;
    }
    public double getHorasTrabajadas() {
        return HorasTrabajadas;
    }
    public void setHorasTrabajadas(double horasTrabajadas) {
        HorasTrabajadas = horasTrabajadas;
    }
    

    public double getTotalpagar() {
        return Totalpagar;
    }


    public void setTotalpagar(double totalpagar) {
        Totalpagar = totalpagar;
    }
        
  
    public void pedirDatosem(){
        System.out.println("por favor digite su Cargo");
        Cargo=captura.next();
        System.out.println("por favor digite su Departamento");
        Departamento=captura.next();
        System.out.println("por favor digite sus Horas trabajadas");
        HorasTrabajadas=captura.nextDouble();
        System.out.println("digite si valor por hora");
        Valorhora=captura.nextDouble();

    }
    public void mostrarEmpleado(String Cargo,String Departamento,double Valorhora,double HorasTrabajadas,double Totalpagar,double Totalpagarr,double Reteic){
        System.out.println("Su tipo de documento es : " +getTipoDoc()+ "\nSu Docuemnto es : " +getDocumento()+  "\nSu Nombre es : " +getNombre() + "\nSu Apellido es : " +getApellido()+ "\nSu cargo es: " +Cargo+ "\nSus Horas trabajadas son : " +HorasTrabajadas+ "\nSu Valor por hora es: " +Valorhora);

}
    public int calcularHorarios(double valorhora, double HorasTrabajadas, double Reteica, double Totalpagarr){
        
        Totalpagarr= Valorhora * HorasTrabajadas;
        Reteica = Totalpagarr * 0.00966;
        Totalpagar = Totalpagarr - Reteica;
        System.out.println("El valor a pagar es: "+Totalpagar);
    return (int) Totalpagar;
        
    }  
}