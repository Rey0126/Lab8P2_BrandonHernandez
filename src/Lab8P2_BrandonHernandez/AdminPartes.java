package Lab8P2_BrandonHernandez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminPartes {
    private ArrayList<Partes> partes = new ArrayList();
    private File archivo = null;

    public AdminPartes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Partes> getPartes() {
        return partes;
    }

    public void setPartes(ArrayList<Partes> partes) {
        this.partes = partes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setParte(Partes p){
        this.partes.add(p);
    }
    
    public void cargar(){
        try {
            partes = new ArrayList();
            Partes temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp = (Partes)objeto.readObject()) != null){
                        partes.add(temp);
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
            for (Partes t : partes) {
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
