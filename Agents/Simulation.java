
import javax.swing.*;
public class Simulation{
public static void main(String [] args){

    int longueur=100;
    int largeur=100;
    World w=new World(longueur,largeur);
    JFrame frame=new JFrame("la simulation boursiere");
    frame.add(new WorldView(w));
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    for (int i = 0; i < 50; i++) {
            w.addAgent(new Entreprise(w, (int) (Math.random() * longueur), (int) (Math.random() * largeur),(int) (Math.random() * 1000)));
        }

        for (int i = 0; i < 80; i++) {
            w.addAgent(new Investisseur(w, (int) (Math.random() * longueur), (int) (Math.random() * largeur),(int) (Math.random() * 1000)));
            //new Investisseur(w, (int) (Math.random() * longueur), (int) (Math.random() * largeur),(int) (Math.random() * 1000)).seDeplacer();
        }

        while (true) {
            w.update();
            frame.repaint();
            try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
        }
}



}