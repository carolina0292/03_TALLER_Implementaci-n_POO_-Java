package Figuras_geometricas;
import java.util.Scanner;

public class Principal {
    
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);
        
        double baset=0;
        double alturat=0;
        double areaTriangulo=0;
        double baser=0;
        double alturar=0;
        double arear=0;
        double pi =3.1416;
        double radioc=0;
        double areac=0;
        int opcion=0;

        while (opcion != 4) {
            System.out.println("Elige una figura geométrica: ");
            System.out.println("1. Triangulo");
            System.out.println("2. Rectangulo");
            System.out.println("3. Circulo");
            System.out.println("4. salir");


            opcion = lectura.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa la base del triángulo:");
                    baset = lectura.nextDouble();
                    System.out.println("Ingresa la altura del triángulo:");
                    alturat = lectura.nextDouble();
                   // System.out.println("su area es: "+ areaTriangulo);
                    Triangulo t1=new Triangulo(baset,alturat,areaTriangulo);
                    t1.calcularArea();
                    break;
                case 2:
                    System.out.println("Ingresa la base del rectángulo:");
                    baser= lectura.nextDouble();
                    System.out.println("Ingresa la altura del rectángulo:");
                    alturat = lectura.nextDouble();
                    //System.out.println("su area es: "+ arear);
                   Rectangulo r1=new Rectangulo(baser,alturar,arear);
                   r1.calcularArea();

                    break;
                case 3:
                    System.out.println("Ingresa el radio del círculo: ");
                    radioc= lectura.nextDouble();
                    System.out.println("este es el valor de pi "+pi);  
                    //System.out.println("su area es: "+areac);
                    Circulo c1=new Circulo(pi,radioc,areac);
                    c1.calcularArea();
                    break;

    }






}
    }
}
