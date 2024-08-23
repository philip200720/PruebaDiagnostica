package org.pruebadiagnostica.dispositivos;

public class Telefono extends Dispositivos {
    private String tipo;

    public Telefono(String marca, String modelo, int anio, String tipo) {
        super(marca, modelo, anio);
        this.tipo = tipo;
    }

    @Override
    public void encender() {
        System.out.println("El teléfono se ha encendido.");
    }

    public void encender(String codigo) {
        System.out.println("El teléfono se ha encendido con el código " + codigo);
    }
}
