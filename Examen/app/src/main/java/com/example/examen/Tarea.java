package com.example.examen;

public class Tarea {
    private int idTarea;
    private String sNombre;
    private String sFecha;
    private String sHora;
    private String sCategoria;

    public Tarea(int idTarea, String sNombre, String sFecha, String sHora, String sCategoria) {
        this.idTarea = idTarea;
        this.sNombre = sNombre;
        this.sFecha = sFecha;
        this.sHora = sHora;
        this.sCategoria = sCategoria;
    }

    public Tarea(){

    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsFecha() {
        return sFecha;
    }

    public void setsFecha(String sFecha) {
        this.sFecha = sFecha;
    }

    public String getsHora() {
        return sHora;
    }

    public void setsHora(String sHora) {
        this.sHora = sHora;
    }

    public String getsCategoria() {
        return sCategoria;
    }

    public void setsCategoria(String sCategoria) {
        this.sCategoria = sCategoria;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "idContacto=" + idTarea +
                ", sNombre='" + sNombre + '\'' +
                ", sFecha='" + sFecha + '\'' +
                ", sHora='" + sHora + '\'' +
                ", sCategoria='" + sCategoria + '\'' +
                '}';
    }
}


