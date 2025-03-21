import java.util.Random;

public class Speculateur extends Agent {
    private Random random = new Random();

    public Speculateur(World world, int x, int y) {
        super(world, x, y, 255, 165, 0); // Orange
    }


    public void deplacemenent() {
        
        int dx = random.nextInt(3) - 1;
        int dy = random.nextInt(3) - 1;
        int newX = x + dx;
        int newY = y + dy;

        if (world.isValidPosition(newX, newY)) {
            x = newX;
            y = newY;
        }
    }
    public void update(){
        this.deplacemenent();
    }

    
    public int getTaille() {
        return 6; 
    }
}
