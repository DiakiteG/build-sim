public class Regulateur extends Agent {


    public Regulateur(World world, int x, int y) {
        super(world, x, y, 255, 255, 0); 
    }




public void update(){
        Speculateur cible=world.trouverSpeculateur();
        if (cible != null){
          this.deplacerVers(cible.getX(),cible.getY());
        }
    
}



    public int getTaille() {
        return 6; 
    }



}