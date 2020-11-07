package com.job.finderr.bean;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Anonce {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String  code;
    private String niveau;
    private String experiance;
    private String information;
    @OneToOne
    private Entreprise entreprise;
    @OneToMany
    private List<Individu> IndividuInterese;

    public Anonce() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getExperiance() {
        return experiance;
    }

    public void setExperiance(String experiance) {
        this.experiance = experiance;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public List<Individu> getIndividuInterese() {
        return IndividuInterese;
    }

    public void setIndividuInterese(List<Individu> individuInterese) {
        IndividuInterese = individuInterese;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anonce anonce = (Anonce) o;
        return id.equals(anonce.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        return "Anonce{" +
                "id=" + id +
                ", niveau='" + niveau + '\'' +
                ", experiance='" + experiance + '\'' +
                ", information='" + information + '\'' +
                ", entreprise=" + entreprise +
                ", IndividuInterese=" + IndividuInterese +
                '}';
    }
}
