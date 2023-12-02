package Lab8P2_BrandonHernandez;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class BuscarUser extends Thread {

    private JProgressBar jp;
    private JDialog vBuscarUser;
    private JDialog vUser;
    private JFrame main;

    public BuscarUser(JProgressBar jp, JDialog vBuscarUser, JDialog vUser, JFrame main) {
        this.jp = jp;
        this.vBuscarUser = vBuscarUser;
        this.vUser = vUser;
        this.main = main;
    }

    public void run() {
        
        main.setVisible(false);
        vBuscarUser.pack();
        vBuscarUser.setLocationRelativeTo(null);
        vBuscarUser.setVisible(true);
        
        AdminJugador ad = new AdminJugador("./Jugadores.usr");
        ad.cargar();  
        
        for (int i = 1; i <= jp.getMaximum(); i++) {
            
            jp.setValue(i);           
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            
        }
        vBuscarUser.setVisible(false);
        vUser.pack();
        vUser.setLocationRelativeTo(null);
        vUser.setVisible(true);
        return;
    }

}
