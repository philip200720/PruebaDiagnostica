package org.pruebadiagnostica.figuras;

public class Cuadrado extends Forma{
    private double lado;

    
    public Cuadrado(double lado, String color) {
        this.lado = lado;
        this.color = color;
    }

    @Override
    double calcularArea() {
        return lado*lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "color: " + color + ", lado: " + lado;
    }

}
