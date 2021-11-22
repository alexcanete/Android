package com.example.examen;

public class Contacto {
    private String sNombre;
    private String sApellido;
    private int iNumero;

    public Contacto(String sNombre, String sApellido, int iNumero) {
        this.sNombre = sNombre;
        this.sApellido = sApellido;
        this.iNumero = iNumero;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public int getiNumero() {
        return iNumero;
    }

    public void setiNumero(int iNumero) {
        this.iNumero = iNumero;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "sNombre='" + sNombre + '\'' +
                ", sApellido='" + sApellido + '\'' +
                ", iNumero=" + iNumero +
                '}';
    }
}
