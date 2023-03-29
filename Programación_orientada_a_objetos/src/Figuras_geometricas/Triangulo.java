package Figuras_geometricas;

public class Triangulo extends Figura {
    
    private double baset=0;
    private double alturat=0;



    
    public double getBaset() {
        return baset;
    }

    public void setBaset(double baset) {
        this.baset = baset;
    }

    public double getAlturat() {
        return alturat;
    }

    public void setAlturat(double alturat) {
        this.alturat = alturat;
    }

    

    public Triangulo(double baset, double alturat, double areaTriangulo) {
        this.baset = baset;
        this.alturat = alturat;
    }

    public void calcularArea() {
        double areaTriangulo=0;
        areaTriangulo= (baset * alturat) / 2;
        System.out.println("El area del Triangulo es: " +areaTriangulo);
    }
}

