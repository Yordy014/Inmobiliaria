package com.itla.mudat.entity;

import java.util.Date;

public class clsAnuncio {

    Integer idAnuncio;
    String titulo;
    String detalle;
    double precio;
    String condicion;
    Date fecha;
    clsCategoria categoria;
    clsUsuario usuario;
    String ubicacion;

    public Integer getIdAnuncio() {
        return idAnuncio;
    }

    public void setIdAnuncio(Integer idAnuncio) {
        this.idAnuncio = idAnuncio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public clsCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(clsCategoria categoria) {
        this.categoria = categoria;
    }

    public clsUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(clsUsuario usuario) {
        this.usuario = usuario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "clsAnuncio{" +
                "idAnuncio=" + idAnuncio +
                ", titulo='" + titulo + '\'' +
                ", detalle='" + detalle + '\'' +
                ", precio=" + precio +
                ", condicion='" + condicion + '\'' +
                ", fecha=" + fecha +
                ", categoria=" + categoria +
                ", usuario=" + usuario +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }
}
