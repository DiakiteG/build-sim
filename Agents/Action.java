public class Action{
    private Entreprise entreprise;
    private int prixAchat;
    public Action(Entreprise e, int prixAchat){
        this.entreprise=e;
        this.prixAchat=prixAchat;
        
    }
public Entreprise getEntrepriseA(){
    return entreprise;
}
public int getPrixAction(){
    return prixAchat;
}

}