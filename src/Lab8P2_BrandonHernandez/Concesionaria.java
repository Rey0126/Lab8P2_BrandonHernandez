
package Lab8P2_BrandonHernandez;

import java.io.Serializable;
import java.util.ArrayList;

public class Concesionaria implements Serializable{
    private String name;
    private String ubi;
    private ArrayList<Carro> carrosVenta = new ArrayList();
    
    private static final long serialUID = 333L;

    public Concesionaria() {
    }

    public Concesionaria(String name, String ubi) {
        this.name = name;
        this.ubi = ubi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUbi() {
        return ubi;
    }

    public void setUbi(String ubi) {
        this.ubi = ubi;
    }

    public ArrayList<Carro> getCarrosVenta() {
        return carrosVenta;
    }

    public void setCarrosVenta(ArrayList<Carro> carrosVenta) {
        this.carrosVenta = carrosVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + "\nUbicación: " + ubi + "\nCarros en Venta: " + carrosVenta;
    }
}
