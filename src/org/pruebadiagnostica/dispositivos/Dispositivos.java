package org.pruebadiagnostica.dispositivos;

public abstract class Dispositivos {
    public String marca;
    public String modelo;
    public int anio;

    public Dispositivos(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    abstract void encender();

    void encender(int voltaje) {
        System.out.println("Encendido con " + voltaje + "Volts.");
    }

    void mostrarInformacion() {
        System.out.println("Marca: " + marca +
        "\n Modelo: " + modelo +
        "\n Año:" + anio);
    }
}
