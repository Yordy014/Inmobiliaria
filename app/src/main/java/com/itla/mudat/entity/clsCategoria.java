package com.itla.mudat.entity;

public class clsCategoria {

    Integer IdCategoria;
    String Nombre;

    public Integer getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        IdCategoria = idCategoria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public String toString() {
        return "clsCategoria{" +
                "IdCategoria=" + IdCategoria +
                ", Nombre='" + Nombre + '\'' +
                '}';
    }
}
