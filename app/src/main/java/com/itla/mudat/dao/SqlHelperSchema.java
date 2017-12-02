package com.itla.mudat.dao;


public class SqlHelperSchema {
    public static final String USUARIO_TABLE = "CREATE TABLE USUARIO ( id_usuario INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                                                                        "nombre TEXT, " +
                                                                        "tipo_usuario TEXT, " +
                                                                        "identificacion TEXT, " +
                                                                        "email TEXT, " +
                                                                        "clave TEXT, " +
                                                                        "telefono TEXT )";
                                                                        //"ESTATUS TEXT, " +

    public static final String CATEGORIA_TABLE = "CREATE TABLE CATEGORIA (id_categoria INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                                                                            "descripcion TEXT)";

    public static final String ANUNCIO_TABLE = "CREATE TABLE ANUNCIO ( id_anuncio INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                                                                        "titulo TEXT, " +
                                                                        "detalle TEXT, " +
                                                                        "precio INTEGER, " +
                                                                        "condicion TEXT, " +
                                                                        "fecha TEXT, " +
                                                                        "categoria INTEGER, " +
                                                                        "usuario INTEGER, " +
                                                                        "ubicacion TEXT)";
}
