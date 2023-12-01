package Lab8P2_BrandonHernandez;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;

public class Carro implements Serializable{

    private String marca;
    private String modelo;
    private String tipo;
    private Color color;
    private double precio;
    private ArrayList<String> mejoras = new ArrayList();
    private String pais;
    private String añoF;
    private int hp;
    private int vp;
    private int tiempo;
    private ArrayList<Partes> partes = new ArrayList();
    
    private static final long serialUID = 712L;

    public Carro() {
    }

    public Carro(String marca, String modelo, String tipo, Color color, double precio, String pais, String añoF, int hp, int vp,int tiempo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
        this.precio = precio;
        this.pais = pais;
        this.añoF = añoF;
        this.hp = hp;
        this.vp = vp;
        this.tiempo = tiempo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<String> getMejoras() {
        return mejoras;
    }

    public void setMejoras(ArrayList<String> mejoras) {
        this.mejoras = mejoras;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getAñoF() {
        return añoF;
    }

    public void setAñoF(String añoF) {
        this.añoF = añoF;
    }

    public ArrayList<Partes> getPartes() {
        return partes;
    }

    public void setPartes(ArrayList<Partes> partes) {
        this.partes = partes;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getVp() {
        return vp;
    }

    public void setVp(int vp) {
        this.vp = vp;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nTipo: " + tipo + "\nColor: " + color + "\nPrecio: " + precio + "\nMejoras: " + mejoras + "\nPais: " + pais + "\nAño de fabricacion: " + añoF + "\nPartes instaladas: " + partes;
    }
}
