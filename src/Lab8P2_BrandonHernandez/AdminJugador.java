package Lab8P2_BrandonHernandez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminJugador {
    private ArrayList<Jugador> jugadores = new ArrayList();
    private File archivo = null;

    public AdminJugador(String path) {
        archivo = new File(path);
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setJugador(Jugador j){
        this.jugadores.add(j);
    }
    
    public void cargar(){
        try {
            jugadores = new ArrayList();
            Jugador temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp = (Jugador)objeto.readObject()) != null){
                        jugadores.add(temp);
                    }
                } catch (EOFException e) {
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribir(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Jugador t : jugadores) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
