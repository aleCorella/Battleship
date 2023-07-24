
package Datos;
public class DatosBarcos {
    
    int col;//Columna es X
    int fil;//Fila es Y
    int tamañoC;
    boolean dañado=false;

    public boolean isDañado() {
        return dañado;
    }

    public void setDañado(boolean dañado) {
        this.dañado = dañado;
    }
    public DatosBarcos(int col, int fil, int tamañoC) {
        this.col = col;
        this.fil = fil;
        this.tamañoC = tamañoC;
        
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getFil() {
        return fil;
    }

    public void setFil(int fil) {
        this.fil = fil;
    }

    public int getTamañoC() {
        return tamañoC;
    }

    public void setTamañoC(int tamañoC) {
        this.tamañoC = tamañoC;
    }
}

