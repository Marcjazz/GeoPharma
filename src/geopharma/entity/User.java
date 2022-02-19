
package geopharma.entity;


import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduser")
    private int iduser;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "datenaiss")
    private String datenaiss;
    @Column(name = "fichier_preuve")
    private String fichier_preuve;
    @Column(name = "isAdmin")
    private Boolean isAdmin;
    
    public User(){
        
    }
    
    public User(String nom, String prenom, String email, String password, String datenaiss, String fichier_preuve, Boolean isAdmin){
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.datenaiss = datenaiss;
        this.fichier_preuve = fichier_preuve;
        this.isAdmin = isAdmin;
    }
    
    
    @Override
    public String toString(){
        return iduser+" : "+nom;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDatenaiss() {
        return datenaiss;
    }

    public void setDatenaiss(String datenaiss) {
        this.datenaiss = datenaiss;
    }

    public String getFichier_preuve() {
        return fichier_preuve;
    }

    public void setFichier_preuve(String fichier_preuve) {
        this.fichier_preuve = fichier_preuve;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
