import java.util.ArrayList;




public class Marche{
private ArrayList <OffreInvestissement> loffres=new ArrayList<>();

public void ajouterOffre(OffreInvestissement o){
  
    loffres.add(o);
}



public OffreInvestissement trouverMeilleurOffre(){
    OffreInvestissement meilleur=null;
    int meilleurPrix=Integer.MAX_VALUE;
    for(OffreInvestissement ofre: loffres){
        if(ofre.quantite > 0 && ofre.prixAction < meilleurPrix){
            meilleur=ofre;
            meilleurPrix=ofre.prixAction;
        }
    }
    return meilleur;
}

}