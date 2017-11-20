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
public class commerciale extends Employe{
    private double Chiffre_affaire;
    private static final double Pourcentage= 0.2;
    private static final int Bonus_vendeur= 100;

    public commerciale(String nom, String prenom, String matricule, int age, double date_entre,double Chiffre_affaire) {
        super(nom, prenom, matricule, age, date_entre);
    }
       public double getChiffre_affaire() {
        return Chiffre_affaire;
        }
    public double calculer_Salaire() {
        return (Chiffre_affaire * Pourcentage) + Bonus_vendeur + Salaire_base;   
    }  
    } 