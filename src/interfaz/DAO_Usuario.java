package interfaz;

public interface DAO_Usuario {
    public void insertar(String obj) throws Exception;
    public void modificar(String obj, int id) throws Exception;
    public Object[][] listar() throws Exception;
    public String[] listarXNombre() throws Exception;
    
    public void agregarVictoria(String username) throws Exception;
    public String[] listarNombreXvictorias(int victorias) throws Exception;
    public int[] obtener3primerosPuntajes() throws Exception;    
}
