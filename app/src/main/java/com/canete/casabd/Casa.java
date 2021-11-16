package com.canete.casabd;

public class Casa {
    private int idCasa;
    private String calle;
    private Integer nCasa;
    private Double superfice;

    public Casa(int idCasa, String calle, Integer nCasa, Double superfice) {
        this.idCasa = idCasa;
        this.calle = calle;
        this.nCasa = nCasa;
        this.superfice = superfice;
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

    public Integer getnCasa() {
        return nCasa;
    }

    public void setnCasa(Integer nCasa) {
        this.nCasa = nCasa;
    }

    public Double getsuperfice() {
        return superfice;
    }

    public void setsuperfice(Double superfice) {
        this.superfice = superfice;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "idCasa=" + idCasa +
                ", calle='" + calle + '\'' +
                ", nCasa=" + nCasa +
                ", spuerfice=" + superfice +
                '}';
    }
}
