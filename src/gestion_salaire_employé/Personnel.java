package gestion_salaire_employé;

public class Personnel {
     
    private Employe[] collection;
    private int nbreEmploye; // nombre des employés de l'entreprise
    private final static int nbremaxemploye=100;//nombre maximal d'employés que peut comtenir l'entreprise 
    
    public Personnel(){
        //mon tableau est appelé colection.
        
        collection= new Employe[nbremaxemploye];
        nbreEmploye=0;
    }
    
    public void ajouterEmploye(Employe e){
        
        ++nbreEmploye;
        
         if(nbreEmploye<=nbremaxemploye)
        {
            collection[nbreEmploye-1]=e;
        } 
        else 
            System.out.println("pas plus de "+nbremaxemploye+" employés ");
        
    }
    
    public double Salaire_moyen(){
        double som=0.0;
        
        for(int i=0;i<nbreEmploye;i++){
            som += collection[i].calculer_Salaire();
        }
        
        return som/nbreEmploye;
    }
    
    public void afficherSalaire(){
        
        for(int i=0; i<nbreEmploye; i++){
            System.out.println(collection[i].getNom()+" gagne "+collection[i].calculer_Salaire()+ "FCFA");
        }
    }
}

    