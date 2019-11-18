package modelo;

public class ValidacionEntrada {
    public static boolean validarUsername(String nombre){
        return nombre.matches("([a-z]|[A-Z])+");
    }
}
