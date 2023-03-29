package Principal;

import Salud.Persona;

public class Inicio {
public static void main(String[] args) {
        
    // crear objeto
    Persona per=new Persona();
    // incocando un metodo

    per.pedirDatos();
    per.mostrarPersona();
    per.calcularIMc();
    per.mayorEdad();
    }
}
