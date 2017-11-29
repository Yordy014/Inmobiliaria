package com.itla.mudat.entity;

public class clsUsuario {

    Integer idUsuario;
    String nombre;
    enumTipoUsuario tipoUsuario;
    String identificacion;
    String email;
    String telefono;
    String clave;
    //boolean estatus;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public enumTipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getClave() {
        return clave;
    }

    /*public boolean isEstatus() {
        return estatus;
    }*/

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoUsuario(enumTipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

   /* public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }*/

    @Override
    public String toString() {
        return "clsUsuario{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", tipoUsuario=" + tipoUsuario +
                ", identificacion='" + identificacion + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", clave='" + clave + '\'' +
                //", estatus=" + estatus +
                '}';
    }
}
