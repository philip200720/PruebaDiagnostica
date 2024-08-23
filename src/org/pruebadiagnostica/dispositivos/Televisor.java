package org.pruebadiagnostica.dispositivos;

public class Televisor extends Dispositivos  {
    public String tamanioPantalla;

    public Televisor(String marca, String modelo, int anio, String tamanioPantalla) {
        super(marca, modelo, anio);
        this.tamanioPantalla = tamanioPantalla;
    }

    @Override
    public void encender() {
        System.out.println("Se ha encendido el televisor.");
    }

    public void encender(int volumen) {
        System.out.println("Se ha encendido el televisor con " + volumen + "de volumen.");
    }
}
