package modelo;

public class Juego extends Partida{
        
    public final Tablero objTablero;
    
    public Juego() {
        objTablero = new Tablero();
        //objTablero = new Tablero((byte)7, (byte)3);
        sizeRaya = 4;
    }
    
    public void iniciar(){
        enCurso = true;
        totalTiros = 0;
        auxNColumnas = objTablero.getColumnas();
        maxTiros = (byte)(objTablero.getFilas()*objTablero.getColumnas());
        turnoJugador = (byte)((Math.random() * 2) + 1);
    }
    
    public void detener(){
        enCurso = false;
        turnoJugador = 0;
    }
    
    public void reiniciar(){
        objTablero.reiniciarTablero();
        reiniciarValoresCelda();
        totalTiros = 0;
    }
    
    public boolean verificar_Y_tirar(int corX, int ancho){
        boolean result = false;
        if(enCurso){
            //
            byte auxColumna = calcular_Columna(corX, ancho);
            byte auxFila = calcular_Fila(auxColumna);
            //
            if(auxFila != -1){
                if(turnoJugador==1){
                    addValorCelda_J1(calcularNoCelda(auxFila, auxColumna));
                }else{
                    addValorCelda_J2(calcularNoCelda(auxFila, auxColumna));
                }
                objTablero.tiros.add(new Tiro(turnoJugador, auxFila, auxColumna));
                result = true;
            }
        }
        return result;
    }
    
    public boolean hayGanador(){        
        return (totalTiros >= (sizeRaya*2)-1)? hayVictoria() : false;
    }
    
    public void resaltarCombinacionGanadora(){
        for(Integer aux : comGanadora){
            for (Tiro tiro : objTablero.tiros) {
                if(aux == calcularNoCelda(tiro.getValFila(), tiro.getValColumna())){
                    tiro.setResaltar(true);
                }
            }
        }
    }
    
    public void cambiarTurno(){
        if(turnoJugador==1)
            turnoJugador=2;
        else
            turnoJugador=1;
    }
    //--------------------------------------------------------------------------
    
    private byte calcular_Columna(int corX, int ancho){
        byte result = 0;
        result = (byte)(corX / (ancho/objTablero.getColumnas()));
        return result >= objTablero.getColumnas() ? (byte)(objTablero.getColumnas()-1) : result;
    }
    
    private byte calcular_Fila(byte auxColumna){
        byte result = -1, contador = (byte)(objTablero.getFilas()-1);
        
        if(objTablero.tiros.size()>0){
            for (Tiro tiro : objTablero.tiros) {
                if(tiro.getValColumna()==auxColumna){
                    contador--;
                }else{
                    result = (byte)(objTablero.getFilas()-1);
                }                
            }
            if(contador != (byte)(objTablero.getFilas()-1)){
                result = contador;
            }
        }else{
            result = (byte)(objTablero.getFilas()-1);
        }
            
        return result;
    }
    
    private int calcularNoCelda(byte f, byte c){
        return ( objTablero.getColumnas()*f+c );
    }

    //--------------------------------------------------------------------------    
    
    public void validar_y_Asignar_SizeRaya(byte size){
        if(size>=4 && size<=7){
            if(size>objTablero.getColumnas()){
                sizeRaya = objTablero.getColumnas();
            }else if(size>objTablero.getFilas()){
                sizeRaya = objTablero.getFilas();
            }else
                sizeRaya = size;
        }else{
            if(size<4)
                sizeRaya = 4;
            else if(size>7)
                sizeRaya = 7;
        }        
    }
    
}