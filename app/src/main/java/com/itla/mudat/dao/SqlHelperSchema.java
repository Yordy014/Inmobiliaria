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
}
