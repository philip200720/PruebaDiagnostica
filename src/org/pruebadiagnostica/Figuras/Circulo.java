package org.pruebadiagnostica.Figuras;

public class Circulo extends Forma{
    private double radio;

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    @Override
    double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "color: " + color + ", radio: " + radio;
    }
}
