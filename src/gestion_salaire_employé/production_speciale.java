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
 public class production_speciale extends production implements interface_risque{

    public production_speciale(String nom, String prenom, String matricule, int age, double date_entre, int unite_produit) {
        super(nom, prenom, matricule, age, date_entre, unite_produit);
    }

   
    public double calculer_Salaire(){
        return super.calculer_Salaire() + prime + Salaire_base;
    } 
 }
