package com.itla.mudat.dao;


public class SqlHelperSchema {
    public static final String USUARIO_TABLE = "CREATE TABLE USUARIO ( ID_USUARIO INTEGER, " +
                                                                        "NOMBRE TEXT, " +
                                                                        "TIPO_USUARIO TEXT, " +
                                                                        "IDENTIFICACION TEXT, " +
                                                                        "EMAIL TEXT, " +
                                                                        "CLAVE TEXT, " +
                                                                        "TELEFONO TEXT, " +
                                                                        //"ESTATUS TEXT, " +
                                                                        "PRIMARY KEY(ID_USUARIO))";
}
