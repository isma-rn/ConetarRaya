package modelo;

import java.util.ArrayList;

public final class Tablero {
    
    private byte columnas, filas;
    public final ArrayList<Tiro> tiros;
    
    public Tablero() {
        columnas = 7;
        filas = 6;
        tiros = new ArrayList<>((filas*columnas));
    }
    
    public Tablero(byte c, byte f) {
        setFilas(f);
        setColumnas(c);
        tiros = new ArrayList<>((filas*columnas));
    }

    public byte getColumnas() {
        return columnas;
    }

    public void setColumnas(byte c) {
        if(c>=4 && c<=11){
            columnas = c;
        }else{
            if(c<4)
                columnas = 4;
            else if(c>11)
                columnas = 11;
        }
    }

    public byte getFilas() {
        return filas;
    }

    public void setFilas(byte f) {
        if(f>=4 && f<=10){
            filas = f;
        }else{
            if(f<4)
                filas = 4;
            else if(f>10)
                filas = 10;
        }
    }
    
    public void reiniciarTablero(){
        tiros.clear();
    }
    
}
