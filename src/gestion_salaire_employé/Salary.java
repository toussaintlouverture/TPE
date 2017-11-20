/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_salaire_employé;

public class Salary {
    public static void main(String[] args){  
                
Personnel per = new Personnel();

per.ajouterEmploye(new manutention_speciale("kapo","moussa","17a412fs",12,2017,500));
per.ajouterEmploye(new manutention("abakar abdou","fodouer","11a412fs",12,2015,2500));
per.ajouterEmploye(new production("kapo","moussa","17a412fs",12,2017,5000));
per.ajouterEmploye(new production_speciale("abakar abdou","saleh","12a412fs",40,2101,400));
per.ajouterEmploye(new manutention_speciale("kapo","moussa","17a412fs",124,2017,5800));
per.ajouterEmploye(new manutention("ousfgfg sadou","fodghghouer","11a4254412fs",112,2015,1400));
per.ajouterEmploye(new production("bello","mamouduo","15a41hjhj2fs",112,2017,5220));
per.ajouterEmploye(new production_speciale("ousmahjhjhjnou sahjhjdou","fodhjhjouer","11a412fs",40,2101,2540));
per.ajouterEmploye(new production_speciale("ousmanou sadou","fodouer","11a412fs",40,2101,400));
per.ajouterEmploye(new manutention_speciale("kapo","moussa","17a412fs",124,2017,5800));
per.ajouterEmploye(new manutention("ousfgfg sadou","ronaldo","11a4254412fs",112,2015,1400));
per.ajouterEmploye(new production("louvertture","moussa","17a41hjhj2fs",112,2017,5220));
per.afficherSalaire();
System.out.println("Les salaire moyen de cette Entreprise est :" + per.Salaire_moyen());
}   


}

