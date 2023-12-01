
package Lab8P2_BrandonHernandez;

import java.io.Serializable;

public class Jugador implements Serializable{
    private String name;
    private String correo;
    private String pais;
    private int fechaN;
    private String user;
    private String pass;
    private double saldo;

    public Jugador() {
    }

    public Jugador(String name, String correo, String pais, int fechaN, String user, String pass) {
        this.name = name;
        this.correo = correo;
        this.pais = pais;
        this.fechaN = fechaN;
        this.user = user;
        this.pass = pass;
        this.saldo = 150000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getFechaN() {
        return fechaN;
    }

    public void setFechaN(int fechaN) {
        this.fechaN = fechaN;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + "\nCorreo: " + correo + "\nPais: " + pais + "\nFecha Nacimiento: " + fechaN + "\nUsuario: " + user + "\nSaldo: " + saldo;
    }
}
