import java.util.ArrayList;
import java.util.Random;


public class Investisseur extends Agent{
     private ArrayList<Action> portefeuille=new ArrayList<>();
     private int capital;
     public Investisseur(World world,int x,int y, int capital){
        super(world,x,y,0,0,255);
        this.capital=capital;
     }
     public void update(){
       // move();
        OffreInvestissement meilleurOffre=world.getMarche().trouverMeilleurOffre();
        if(meilleurOffre !=null){
            investir(meilleurOffre);
        }
        this.move();
     }
     public void investir(OffreInvestissement offre){
        int quanteAchetable=capital/offre.prixAction;
        if(quanteAchetable > offre.quantite ){
            quanteAchetable=offre.quantite;
        }

          if(quanteAchetable > 0){


        capital-=quanteAchetable*offre.prixAction;
        for(int i=0; i<quanteAchetable;i++){

        portefeuille.add(new Action(offre.getEntreprise(),offre.prixAction));

    }
    offre.diminuerQuantite(quanteAchetable);
     }
     }

     public int getTaille(){
        return 5+(capital/1000);
     }


    // public void update(){
        //seDeplacer();



     public void seDeplacer(){
                 Random random = new Random();
                int direction = random.nextInt(4); 

		switch (direction) {
		    case 0:  // Haut
		        if (this.y == 0) {
		            this.y = world.longueur - 1; // Passe en bas (effet torique)
		        } else {
		            this.y--; // Décrémente y pour monter
		        }
		        break;

		    case 1:  // Bas
		        if (this.y == world.longueur - 1) {
		            this.y = 0; // Passe en haut
		        } else {
		            this.y++; // Incrémente y pour descendre
		        }
		        break;

		    case 2:  // Gauche
		        if (this.x == 0) {
		            this.x = world.largeur - 1; // Passe à droite
		        } else {
		            this.x--; // Décrémente x pour aller à gauche
		        }
		        break;  

		    case 3:  // Droite
		        if (this.x == world.largeur - 1) {
		            this.x = 0; // Passe à gauche
		        } else {
		            this.x++; // Incrémente x pour aller à droite
		        }
		        break;        
		}
    	}
}