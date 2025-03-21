

public class Entreprise extends Agent{
    private int prixAction;
    private int stockActions;
    private int capital;

     public Entreprise(World world, int x, int y,int capital) {
        super(world, x, y, 255, 0, 0); // Rouge
        this.prixAction = (int) (Math.random() * 100) + 1;
        this.stockActions = (int) (Math.random() * 50) + 10;
        this.capital=capital;
    }
    public int getTaille(){
        return 5+(capital/1000);
    }
    public void update(){

    }
}