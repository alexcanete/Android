package com.canete.casadb2;

public class Casa {
    private int id_casa;
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

    public Casa( int id_casa, String calle, Integer NCasa, Double superficie) {
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

    public int getId_casa() {
        return id_casa;
    }

    public void setId_casa(int id_casa) {
        this.id_casa = id_casa;
    }


    @Override
    public String toString() {
        return "Casa{" +
                "id_casa=" + id_casa +
                ", calle='" + calle + '\'' +
                ", NCasa=" + NCasa +
                ", superficie=" + superficie +
                '}';
    }
}