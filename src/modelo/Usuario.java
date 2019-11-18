package modelo;

public class Usuario {
    private int id, noVictorias;
    private String name;

    public Usuario() {
    }

    public Usuario(int id, int noVictorias, String name) {
        this.id = id;
        this.noVictorias = noVictorias;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNoVictorias() {
        return noVictorias;
    }

    public void setNoVictorias(int noVictorias) {
        this.noVictorias = noVictorias;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
