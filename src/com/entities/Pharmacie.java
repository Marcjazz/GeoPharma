/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kuidja Marco
 */
@Entity
@Table(name = "pharmacie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pharmacie.findAll", query = "SELECT p FROM Pharmacie p")
    , @NamedQuery(name = "Pharmacie.findByIdpharmacie", query = "SELECT p FROM Pharmacie p WHERE p.idpharmacie = :idpharmacie")
    , @NamedQuery(name = "Pharmacie.findByNom", query = "SELECT p FROM Pharmacie p WHERE p.nom = :nom")
    , @NamedQuery(name = "Pharmacie.findByDescription", query = "SELECT p FROM Pharmacie p WHERE p.description = :description")
    , @NamedQuery(name = "Pharmacie.findByLomgitude", query = "SELECT p FROM Pharmacie p WHERE p.lomgitude = :lomgitude")
    , @NamedQuery(name = "Pharmacie.findByLatitude", query = "SELECT p FROM Pharmacie p WHERE p.latitude = :latitude")
    , @NamedQuery(name = "Pharmacie.findByHeureOuverture", query = "SELECT p FROM Pharmacie p WHERE p.heureOuverture = :heureOuverture")
    , @NamedQuery(name = "Pharmacie.findByHeureFermeture", query = "SELECT p FROM Pharmacie p WHERE p.heureFermeture = :heureFermeture")
    , @NamedQuery(name = "Pharmacie.findByJourOuverture", query = "SELECT p FROM Pharmacie p WHERE p.jourOuverture = :jourOuverture")
    , @NamedQuery(name = "Pharmacie.findByMode", query = "SELECT p FROM Pharmacie p WHERE p.mode = :mode")})
public class Pharmacie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpharmacie")
    private Integer idpharmacie;
    @Column(name = "nom")
    private String nom;
    @Column(name = "description")
    private String description;
    @Column(name = "lomgitude")
    private BigInteger lomgitude;
    @Column(name = "latitude")
    private BigInteger latitude;
    @Column(name = "heure_ouverture")
    @Temporal(TemporalType.TIME)
    private Date heureOuverture;
    @Column(name = "heure_fermeture")
    @Temporal(TemporalType.TIME)
    private Date heureFermeture;
    @Column(name = "jour_ouverture")
    @Temporal(TemporalType.DATE)
    private Date jourOuverture;
    @Column(name = "mode")
    private String mode;
    @JoinColumn(name = "iduser", referencedColumnName = "iduser")
    @ManyToOne(optional = false)
    private User iduser;

    public Pharmacie() {
    }

    public Pharmacie(Integer idpharmacie) {
        this.idpharmacie = idpharmacie;
    }

    public Integer getIdpharmacie() {
        return idpharmacie;
    }

    public void setIdpharmacie(Integer idpharmacie) {
        this.idpharmacie = idpharmacie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigInteger getLomgitude() {
        return lomgitude;
    }

    public void setLomgitude(BigInteger lomgitude) {
        this.lomgitude = lomgitude;
    }

    public BigInteger getLatitude() {
        return latitude;
    }

    public void setLatitude(BigInteger latitude) {
        this.latitude = latitude;
    }

    public Date getHeureOuverture() {
        return heureOuverture;
    }

    public void setHeureOuverture(Date heureOuverture) {
        this.heureOuverture = heureOuverture;
    }

    public Date getHeureFermeture() {
        return heureFermeture;
    }

    public void setHeureFermeture(Date heureFermeture) {
        this.heureFermeture = heureFermeture;
    }

    public Date getJourOuverture() {
        return jourOuverture;
    }

    public void setJourOuverture(Date jourOuverture) {
        this.jourOuverture = jourOuverture;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public User getIduser() {
        return iduser;
    }

    public void setIduser(User iduser) {
        this.iduser = iduser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpharmacie != null ? idpharmacie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pharmacie)) {
            return false;
        }
        Pharmacie other = (Pharmacie) object;
        if ((this.idpharmacie == null && other.idpharmacie != null) || (this.idpharmacie != null && !this.idpharmacie.equals(other.idpharmacie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Pharmacie[ idpharmacie=" + idpharmacie + " ]";
    }
    
}
