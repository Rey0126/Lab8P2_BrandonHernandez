package Lab8P2_BrandonHernandez;

import java.io.Serializable;

public class Circuito implements Serializable{
    private int longitud;
    private int curvas;
    private String tipo;
    private String locacion;

    public Circuito() {
    }

    public Circuito(int longitud, int curvas, String tipo, String locacion) {
        this.longitud = longitud;
        this.curvas = curvas;
        this.tipo = tipo;
        this.locacion = locacion;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getCurvas() {
        return curvas;
    }

    public void setCurvas(int curvas) {
        this.curvas = curvas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    @Override
    public String toString() {
        return "Longitud: " + longitud + " Curvas: " + curvas + " Tipo:" + tipo + " Locacion: " + locacion;
    }
    
    
}
