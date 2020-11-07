package com.job.finderr.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
public class Individu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    @OneToMany
    private List<Anonce> anonces;


    public Individu() {

    }


    public Individu(Long id,String reference, String nom, String prenom, String email, String telephone) {
        this.id=id;
        this.reference = reference;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @JsonIgnore
    public List<Anonce> getAnonces() {
        return anonces;
    }
    @JsonSetter
    public void setAnonces(List<Anonce> anonces) {
        this.anonces = anonces;
    }

    @Override
    public String toString() {
        return "individu{" +
                "id=" + id +
                ", reference='" + reference + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Individu individu = (Individu) o;
        return id == individu.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
