import java.util.Random;

public abstract class Agent {
    protected int x, y;
    protected int r, g, b; 
    protected World world;
    protected Random random = new Random();

    public Agent(World world, int x, int y, int r, int g, int b) {
        this.world = world;
        this.x = x;
        this.y = y;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    // Déplacement aléatoire de base
    public void move() {
        int newX = x + random.nextInt(3) - 1;
        int newY = y + random.nextInt(3) - 1;

        if (world.isValidPosition(newX, newY)) {
            x = newX;
            y = newY;
        }
    }

    // Méthode abstraite pour le comportement de chaque agent
    public abstract void update();
    public abstract int  getTaille();

    public int getX() { return x; }
    public int getY() { return y; }
    public int getColorR() { return r; }
    public int getColorG() { return g; }
    public int getColorB() { return b; }

}
