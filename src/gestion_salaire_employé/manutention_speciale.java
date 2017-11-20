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
public class manutention_speciale extends manutention implements interface_risque{

    public manutention_speciale(String nom, String prenom, String matricule, int age, double date_entre, int heures) {
        super(nom, prenom, matricule, age, date_entre, heures);
    }


public double calculer_Salaire(){
        return super.calculer_Salaire() + prime + Salaire_base + prime;
    }
 }
