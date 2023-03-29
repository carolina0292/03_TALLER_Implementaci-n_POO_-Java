package Interfaz;

import java.util.Random;
import java.util.Scanner;
public class PiedraPapelotijeras implements Juego{

//Atributos
private String nombre;
private int jugador;
private int maquina;

//objeto para capturar los datos
Scanner captura=new Scanner(System.in);
Random rand = new Random();
//solicitar los datos

   public void inicio() {
       System.out.println("Ingrese el nombre del jugador");
       nombre=captura.next();
   }

 
   public void jugar() {
    System.out.println("Seleccione su jugada: 1 - Piedra, 2 - Papel, 3 - Tijera");
    jugador = captura.nextInt();
    maquina = rand.nextInt(3) + 1;
   }


   public void finalizar() {
    if (jugador == maquina) {
        System.out.println("Empate!");
    } else if ((jugador == 1 && maquina == 3) || (jugador == 2 && maquina == 1) || (jugador == 3 && maquina == 2)) {
        System.out.println("¡Felicidades " + nombre + "! Ganó el juego");
    } else {
        System.out.println("La máquina ganó el juego");
    }
   }
   
}

