package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Partida {
    
    private final ArrayList<Integer> valorCeldaTiro_J1;
    private final ArrayList<Integer> valorCeldaTiro_J2;
    public ArrayList<Integer> comGanadora;
    //
    public boolean enCurso;
    public byte totalTiros, maxTiros, turnoJugador, auxNColumnas, sizeRaya;
        
    private final Comparator<Integer> comparador = Collections.reverseOrder();
    
    public Partida() {
        sizeRaya = 0;
        enCurso = false;
        turnoJugador = 0;
        maxTiros = 0;
        totalTiros = 0;
        auxNColumnas = 0;
        valorCeldaTiro_J1 = new ArrayList(maxTiros/2);
        valorCeldaTiro_J2 = new ArrayList(maxTiros/2);
        comGanadora = new ArrayList<>(sizeRaya);
    }
        
    public void addValorCelda_J1(int valor){
        valorCeldaTiro_J1.add(valor);
        
        if(valorCeldaTiro_J1.size()>3){
            Collections.sort(valorCeldaTiro_J1, comparador);
        }
        
        totalTiros++;
    }
    
    public void addValorCelda_J2(int valor){
        valorCeldaTiro_J2.add(valor);
        
        if(valorCeldaTiro_J2.size()>3){
            Collections.sort(valorCeldaTiro_J2, comparador);
        }
        
        totalTiros++;
    }
        
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    public boolean hayVictoria(){
        boolean result = false;
        ArrayList<Integer> valorCeldaTiroAux = ( turnoJugador==1? valorCeldaTiro_J1 : valorCeldaTiro_J2 );
        
        for (Integer valor : valorCeldaTiroAux) {
            for (ArrayList arreglo : buscarRaya(valor)) {
                //
                if (valorCeldaTiroAux.containsAll(arreglo)){
                    comGanadora = arreglo;
                    result = true;
                }
                //
            }
            if(result) break;
        }
        return result;
    }
        
    private ArrayList<ArrayList> buscarRaya(int valor){
        ArrayList<ArrayList> result = new ArrayList<>(4);        
        int i = valor/auxNColumnas;
        int j = valor-i*auxNColumnas;
        
        if(j>=(sizeRaya-1)){//←
            result.add( calcularValoresRaya(valor, (byte)1) );
        }
        if((i>=(sizeRaya-1)) && (j>=(sizeRaya-1))){//↖
            result.add( calcularValoresRaya(valor, (byte)(auxNColumnas+1)));
        }
        if((i>=(sizeRaya-1))){//↑
            result.add( calcularValoresRaya(valor, (byte)(auxNColumnas)));
        }
        if((i>=(sizeRaya-1)) && (j<=auxNColumnas-sizeRaya)){//↗
            result.add( calcularValoresRaya(valor, (byte)(auxNColumnas-1)));
        }
                
        return result;
    }
    
    private ArrayList calcularValoresRaya(int valorInicial, byte diferencia){
        ArrayList<Integer> result = new ArrayList<>(sizeRaya);
        for (int i = 0; i < sizeRaya; i++) {
            result.add( valorInicial-(i*diferencia) );
        }        
        return result;
    }
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
        
    public void reiniciarValoresCelda(){
        valorCeldaTiro_J1.clear();
        valorCeldaTiro_J2.clear();
        comGanadora.clear();        
    }
    
}