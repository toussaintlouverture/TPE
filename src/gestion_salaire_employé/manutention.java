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
  
public class manutention extends Employe{
    private final static int Salaire_horaire= 65;
    private int heures;

    public manutention(String nom, String prenom, String matricule, int age, double date_entre,int heures) {
        super(nom, prenom, matricule, age, date_entre);
        this.heures=heures;
    }
      
public double calculer_Salaire(){
        return (Salaire_horaire * heures) + Salaire_base;
    }
  }
