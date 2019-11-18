package modelo;

public class Tiro {
    private byte numJugador, valFila, valColumna;
    private boolean resaltar;

    public Tiro() {
    }

    public Tiro(byte numJugador, byte valFila, byte valColumna) {
        this.numJugador = numJugador;
        this.valFila = valFila;
        this.valColumna = valColumna;
        resaltar = false;
    }

    public byte getNumJugador() {
        return numJugador;
    }

    public void setNumJugador(byte numJugador) {
        this.numJugador = numJugador;
    }

    public byte getValFila() {
        return valFila;
    }

    public void setValFila(byte valFila) {
        this.valFila = valFila;
    }

    public byte getValColumna() {
        return valColumna;
    }

    public void setValColumna(byte valColumna) {
        this.valColumna = valColumna;
    }

    public boolean isResaltar() {
        return resaltar;
    }

    public void setResaltar(boolean resaltar) {
        this.resaltar = resaltar;
    }
    
}
