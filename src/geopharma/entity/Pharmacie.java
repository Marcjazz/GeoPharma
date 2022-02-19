/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geopharma.entity;

import com.sun.istack.NotNull;
import java.sql.Date;
import java.sql.Time;
import javax.persistence.*;

/**
 *
 * @author media
 */
@Entity
@Table(name = "PHARMACIE")
public class Pharmacie{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpharmacie")
    private int idpharmacie;
    @Column(name = "nom")
    private String nom;
    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "contact")
    private int contact;
    @Column(name = "heure_ouverture")
    private String heure_ouverture;
    @Column(name = "heure_fermeture")
    private String heure_fermeture;
    @Column(name = "jour_ouverture")
    private String jour_ouverture;
    @Column(name = "mode")
    private String mode;
    @ManyToOne
    @JoinColumn(name="iduser", unique=true)
    @NotNull
    private User user;
    
    public Pharmacie(){
        
    }
    
    public Pharmacie(String nom, Double longitude, Double latitude, int contact, String heure_ouverture, String heure_fermeture,String jour_ouverture, String mode, User user){
        this.nom = nom;
        this.longitude = longitude;
        this.latitude = latitude;
        this.contact = contact;
        this.heure_ouverture = heure_ouverture;
        this.heure_fermeture = heure_fermeture;
        this.mode = mode;
        this.user = user;
        this.jour_ouverture = jour_ouverture;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
    
    public int getIdpharmacie() {
        return idpharmacie;
    }

    public void setIdpharmacie(int idpharmacie) {
        this.idpharmacie = idpharmacie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getHeure_ouverture() {
        return heure_ouverture;
    }

    public void setHeure_ouverture(String heure_ouverture) {
        this.heure_ouverture = heure_ouverture;
    }

    public String getHeure_fermeture() {
        return heure_fermeture;
    }

    public void setHeure_fermeture(String heure_fermeture) {
        this.heure_fermeture = heure_fermeture;
    }

    public String getJour_ouverture() {
        return jour_ouverture;
    }

    public void setJour_ouverture(String jour_ouverture) {
        this.jour_ouverture = jour_ouverture;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
