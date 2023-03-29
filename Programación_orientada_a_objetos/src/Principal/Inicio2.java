package Principal;

import Salud.Persona2;

public class Inicio2 {
public static void main(String[] args) {
        
    // crear objeto
    Persona2 per=new Persona2();
    // incocando un metodo

    per.pedirDatos();
    per.mostrarPersona();
    per.mayorEdad();
    per.calcularIMc(0, 0);

    }
}
