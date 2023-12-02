
package Lab8P2_BrandonHernandez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminConcesionaria {
    private ArrayList<Concesionaria> concesionarias = new ArrayList();
    private File archivo = null;

    public AdminConcesionaria(String path) {
        archivo = new File(path);
    }

    public ArrayList<Concesionaria> getConcecionarias() {
        return concesionarias;
    }

    public void setConcesionarias(ArrayList<Concesionaria> concesionarias) {
        this.concesionarias = concesionarias;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setConcesionaria(Concesionaria c){
        this.concesionarias.add(c);
    }
    
    public void cargar(){
        try {
            concesionarias = new ArrayList();
            Concesionaria temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp = (Concesionaria)objeto.readObject()) != null){
                        concesionarias.add(temp);
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
            for (Concesionaria t : concesionarias) {
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
