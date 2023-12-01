package Lab8P2_BrandonHernandez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminCircuitos {
    private ArrayList<Circuito> circuitos = new ArrayList();
    private File archivo = null;

    public AdminCircuitos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Circuito> getCircuitos() {
        return circuitos;
    }

    public void setCircuitos(ArrayList<Circuito> circuitos) {
        this.circuitos = circuitos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setCircuito(Circuito c){
        this.circuitos.add(c);
    }
    
     public void cargar(){
        try {
            circuitos = new ArrayList();
            Circuito temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp = (Circuito)objeto.readObject()) != null){
                        circuitos.add(temp);
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
            for (Circuito t : circuitos) {
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
