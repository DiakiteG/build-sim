public class OffreInvestissement{
    private Entreprise ent;
    public  int prixAction;
    public int quantite;

    public OffreInvestissement(Entreprise e,int prixa,int q){
        this.ent=e;
        this.prixAction=prixa;
        this.quantite=q;
    }

    public Entreprise getEntreprise(){
        return ent;

    }
    
    public void diminuerQuantite(int qvendue){
        this.quantite-=qvendue;
        if(this.quantite<0){
            this.quantite=0;
        }
    }
    }