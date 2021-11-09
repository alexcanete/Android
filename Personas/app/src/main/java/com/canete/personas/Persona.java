package com.canete.personas;

public class Persona {
    private String sNombre;
    private byte bSexo;
    private byte bClase;
    private Double dNota;

    public Persona(String sNombre, byte bSexo, byte bClase, Float fNota) {
        this.sNombre = sNombre;
        this.bSexo = bSexo;
        this.bClase = bClase;
        this.fNota = fNota;
    }
    public Persona(){

    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public byte getbSexo() {
        return bSexo;
    }

    public void setbSexo(byte bSexo) {
        this.bSexo = bSexo;
    }

    public byte getbClase() {
        return bClase;
    }

    public void setbClase(byte bClase) {
        this.bClase = bClase;
    }

    public Float getfNota() {
        return fNota;
    }

    public void setfNota(Float fNota) {
        this.fNota = fNota;
    }
}
