package com.canete.casacondb;

public class Casa {
    private int idCasa;
    private String calle;
    private Integer NCasa;
    private Double superficie;



    public Casa() {

    }

    public Casa(int idCasa, String calle, Integer NCasa, Double superficie) {
        this.idCasa = idCasa;
        this.calle = calle;
        this.NCasa = NCasa;
        this.superficie = superficie;
    }

    public int getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNCasa() {
        return NCasa;
    }

    public void setNCasa(Integer NCasa) {
        this.NCasa = NCasa;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "idCasa=" + idCasa +
                ", calle='" + calle + '\'' +
                ", NCasa=" + NCasa +
                ", superficie=" + superficie +
                '}';
    }
}
