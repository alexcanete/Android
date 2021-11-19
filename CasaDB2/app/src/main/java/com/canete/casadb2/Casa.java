package com.canete.casadb2;

public class Casa {
    private String calle;
    private Integer NCasa;
    private Double superficie;



    public Casa() {

    }

    public Casa(String calle, Integer NCasa, Double superficie) {

        this.calle = calle;
        this.NCasa = NCasa;
        this.superficie = superficie;
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
                ", calle='" + calle + '\'' +
                ", NCasa=" + NCasa +
                ", superficie=" + superficie +
                '}';
    }
}