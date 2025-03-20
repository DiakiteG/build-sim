import javax.swing.*;
import java.awt.*;

public class WorldView extends JPanel {
    World world;

    public WorldView(World world) {
        this.world = world;
        setPreferredSize(new Dimension(world.longueur * 10, world.largeur * 10));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Agent agent : world.getAgents()) {
            g.setColor(new Color(agent.getColorR(), agent.getColorG(), agent.getColorB()));

            int taille = agent.getTaille(); // Taille dynamique
            int x = agent.getX() * 10 + (10 - taille) / 2;
            int y = agent.getY() * 10 + (10 - taille) / 2;

            if (agent instanceof Investisseur) {
                g.fillOval(x, y, taille, taille); // Cercle pour investisseur
            } else if (agent instanceof Entreprise) {
                g.fillRect(x, y, taille, taille); // Carré pour entreprise
            }
        }
    }
}
