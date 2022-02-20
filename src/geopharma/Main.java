
package geopharma;

import geopharma.Repository.Hibernate;
import geopharma.entity.Pharmacie;
import geopharma.entity.User;
import geopharma.service.Service;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class Main {

    
    public static void main(String[] args) {
        Service s = new Service();
        //s.deletePharmacie(4);
        //s.deleteUser(3);
        //s.searchPharmacie("Pharmacie de Nkomo");
        //s.searchUser("iveschatelin@gmail.com");
        s.Ajouter_User("NZOKOU", "Ives Chatelin", "iveschatelin@gmail.com", "ives123", "17/20/1999", "Diplome", Boolean.FALSE);
        s.Ajouter_Pharmacie("Pharmacie de Nkomo", 3.827987, 11.537504, 696832168, "09h00", "18h00", "Lundi à Vendredi", "Garde","iveschatelin@gmail.com");
        s.connexion("NZOKOU", "ives123");
        
    }
    
}
