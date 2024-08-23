package org.pruebadiagnostica.Figuras;

public class Rectangulo extends Forma{
    private double ancho;
    private double largo;

    public Rectangulo(double ancho, double largo, String color) {
        this.ancho = ancho;
        this.largo = largo;
        this.color = color;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    double calcularArea() {
        return ancho * largo;
    }

    @Override
    public String toString() {
        return "color: " + color + ", ancho: " + ancho + ", largo: " + largo;
    }
}
