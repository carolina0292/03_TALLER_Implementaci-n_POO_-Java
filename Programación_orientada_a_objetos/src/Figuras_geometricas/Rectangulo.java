package Figuras_geometricas;

public class Rectangulo extends Figura {
    //atributos
    private double baser=0;
    private double alturar=0;


//métodos accesores


public double getBaser() {
    return baser;
}


public void setBaser(double baser) {
    this.baser = baser;
}


public double getAlturar() {
    return alturar;
}


public void setAlturar(double alturar) {
    this.alturar = alturar;
}
    

    //constructor
    
    public Rectangulo(double baser, double alturar, double arear) {
        this.baser = baser;
        this.alturar = alturar;

    }

// métodos propios
public void calcularArea(){
    double arear=0;
    arear=baser*alturar;
    System.out.println("El area del Rectangulo es: "+arear);
    }

}

