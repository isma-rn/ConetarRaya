package modelo;

public class Utilidad {
    public final static String scripBD= "CREATE TABLE usuario (\n" +
"    usuario_id                  INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1) PRIMARY KEY,\n" +
"    usuario_username            VARCHAR(30),\n" +
"    usuario_no_victorias 	INTEGER NOT NULL,\n" +
"    CONSTRAINT username_unique UNIQUE(usuario_username)\n" +
")";
}
