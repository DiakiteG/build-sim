public class Regulateur extends Agent {


    public Regulateur(World world, int x, int y) {
        super(world, x, y, 255, 255, 0); 
    }




public void update(){
        Speculateur cible=world.trouverSpeculateur();
        if (cible != null){
            deplacerVers(cible.getX(),cible.getY());
        }
    
}

private void deplacerVers(int cibleX, int cibleY) {
        if (x < cibleX) x++;
        else if (x > cibleX) x--;
        if (y < cibleY) y++;
        else if (y > cibleY) y--;
    }

    public int getTaille() {
        return 6; 
    }



}