package org.pruebadiagnostica.dispositivos;

public class Computadora extends Dispositivos {
    public String systemaOperativo;

    public Computadora(String marca, String modelo, int anio, String systemaOperativo) {
        super(marca, modelo, anio);
        this.systemaOperativo = systemaOperativo;
    }

    @Override
    public void encender() {
        System.out.println("La computadora se ha encendido.");
    }

    public void encender(String clave) {
        System.out.println("La computadora se ha encendico con la clave " + clave);
    }
}
