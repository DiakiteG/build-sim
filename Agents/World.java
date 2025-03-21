import java.util.ArrayList;
import java.util.Random;
public class World{
    public int longueur;
    public int largeur;
    public ArrayList<Agent> agents;
    private Marche marche;
    private boolean crise=false;
    private Random r=new Random();

     public World(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.agents = new ArrayList<>();
        this.marche=new Marche();
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



public void ajouterOffreEntreprises(){
    for(Agent a:agents){
        if(a instanceof Entreprise){
            marche.ajouterOffre(((Entreprise)a).creerOffre());
        }
    }
}

public Marche getMarche(){
    return marche;
}

public void updatew(){
    ajouterOffreEntreprises();
    for(Agent a:agents){
        a.update();
}

}

public void declelencherCrise(){
    crise=true;
    System.out.println(" ⚠️ CRISE BOURSIÈRE ");
    for(int i=0 ;i<3 ;i++){
        addAgent(new Speculateur(this,(int)Math.random()*longueur,(int)Math.random()*largeur));
    }
    for(int i=0 ;i<3 ;i++){
        addAgent(new Regulateur(this,(int)Math.random()*longueur,(int)Math.random()*largeur));
    }
}

public void transformerEnTrader(Investisseur investisseur) {
        agents.remove(investisseur);
        addAgent(new Trader(this, investisseur.getX(), investisseur.getY(),(int)Math.random()*1000));
    }



public Speculateur trouverSpeculateur() {
    for (Agent agent : agents) {
        if (agent instanceof Speculateur) {
            return (Speculateur) agent; 
        }
    }
    return null; 
}



}