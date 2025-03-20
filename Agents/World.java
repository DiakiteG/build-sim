import java.util.ArrayList;
public class World{
    public int longueur;
    public int largeur;
    public ArrayList<Agent> agents;

     public World(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.agents = new ArrayList<>();
    }
    public boolean isValidPosition(int x, int y) {
        return x >= 0 && x < longueur && y >= 0 && y < largeur;
    }

    public void setCellState(int x,int y,int r,int g,int b  ){

    //
 }

 public void addAgent(Agent a){
    agents.add(a);

 }

 public void update(){
    for(Agent agent: agents){
        agent.update();
    }
 }
 public ArrayList<Agent> getAgents() {
        return agents;
    }

}