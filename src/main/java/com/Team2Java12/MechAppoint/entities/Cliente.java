package com.Team2Java12.MechAppoint.entities;


import com.Team2Java12.MechAppoint.dataStatus.ValidationEnum;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Clienti")
public class Cliente {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String cellulare;
    private ValidationEnum validation;

    @ManyToMany
    @JoinTable(name = "Clienti_Officine",
            joinColumns = @JoinColumn(name = "cliente_Id"),
            inverseJoinColumns = @JoinColumn(name = "officina_Id"))
    private List<Officina> officine;
    @OneToMany(mappedBy = "cliente")
    private List<Veicolo> veicoli;

    @OneToMany(mappedBy = "cliente")
    private List<Prenotazione> prenotazioni;

    public Cliente(Integer id, String username, String password, String email, String cellulare, ValidationEnum validation) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.cellulare = cellulare;
        this.validation = validation;

    }

    public Cliente(String username, String password, String email, String cellulare, ValidationEnum validation) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.cellulare = cellulare;
        this.validation = validation;
    }

    public Cliente() {
    }


    public List<Veicolo> getVeicoli() {
        return veicoli;
    }


    public void setVeicoli(List<Veicolo> veicoli) {
        this.veicoli = veicoli;
    }

    public List<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }

    public void setPrenotazioni(List<Prenotazione> prenotazioni) {
        this.prenotazioni = prenotazioni;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Officina> getOfficine() {
        return officine;
    }

    public void setOfficine(List<Officina> officine) {
        this.officine = officine;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellulare() {
        return cellulare;
    }

    public void setCellulare(String cellulare) {
        this.cellulare = cellulare;
    }


    public ValidationEnum getValidation() {
        return validation;
    }

    public void setValidation(ValidationEnum validation) {
        this.validation = validation;
    }

}
