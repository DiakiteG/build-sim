import java.util.Random;




public class Trader extends Agent{
    private Random random=new Random();
     
    private int capital;

     public Trader(World world, int x,int y ,int capital){
        super(world,x,y,0,255,0);
        this.capital=capital;
     }


     public void sedeplacer(){
        int dx=random.nextInt(5)-2;
        int dy=random.nextInt(5)-2;
        int ax=x+dx;
        int ay=y+dy;
        if(world.isValidPosition(ax,ay)){
            x=ax;
            y=ay;
        }

     }
     public void update(){
        this.sedeplacer();
     }

     public int getTaille(){
        return 7;
     }

}