/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_salaire_employé;

/**
 *
 * @author bello
 */

public  abstract class Employe {
     //Declaratin des variables
    public String nom;
 
    public String prenom;  
    public String matricule;
    public int age;
    public double date_entre;
    public int  Salaire_base=110000; 

    public Employe(String nom, String prenom, String matricule, int age, double date_entre) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.age = age;
        this.date_entre = date_entre;
    }
 

  public String  getNom() 
// methode d'affichage des noms a l'ecran
  { 
     return " L'employé " + this.nom + " " + this.prenom ;      
   } 
  public abstract double calculer_Salaire();

}