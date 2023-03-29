package Principal;
import java.util.Scanner;

import Salud.Empleado;
import Salud.Persona3;

public class Inicio3 {



public static void main(String[] args) {


    // crear objeto
    Persona3 per=new Persona3();


    // incocando un metodo


    per.pedirDatos();
    per.mostrarPersona(per.getTipoDoc(),per.getDocumento(),per.getNombre(),per.getApellido(),per.getPeso(),per.getEstatura(),per.getEdad(),per.getSexo(), per.getPesoActual());
    per.mayorEdad();
    per.calcularIMc(0, 0);
    



    Empleado em=new Empleado(per.getTipoDoc(), per.getDocumento(), per.getNombre(), per.getApellido(),per.getPeso(),per.getEstatura(),per.getEdad(), per.getSexo(),per.getPesoActual(), null, null, 0, 0, 0);
    
    em.pedirDatosem();
    em.mostrarEmpleado(em.getCargo(),em.getDepartamento(),em.getValorhora(),em.getHorasTrabajadas(),em.getTotalpagar(),em.getTotalpagarr(),em.getReteica());
    em.calcularHorarios(em.getValorhora(),em.getHorasTrabajadas(),em.getReteica(),em.getTotalpagar());
    }
}
     