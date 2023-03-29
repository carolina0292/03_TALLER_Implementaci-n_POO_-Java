package Figuras_geometricas;

public class Circulo extends Figura{

    //atributos 
     double pi =3.1416;
     double radioc=0;
     
    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRadioc() {
        return radioc;
    }

    public void setRadioc(double radioc) {
        this.radioc = radioc;
    }

    //metodo contrustor 
    public Circulo(double pi, double radioc, Double areac) {
        this.pi = pi;
        this.radioc = radioc;

    }

    //metodo propio 
    public void calcularArea(){
        double areac=0;
        areac=(pi*radioc*radioc);
       System.out.println("el area del circulo es:" + areac );
    }
    


}
