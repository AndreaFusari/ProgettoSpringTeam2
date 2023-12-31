package com.Team2Java12.MechAppoint.entities;

import com.Team2Java12.MechAppoint.dataStatus.ValidationEnum;
import jakarta.persistence.*;

@Entity
@Table(name="Prenotazione")
public class Prenotazione {
    @Id
    @Column(name="prenotazioneid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer prenotazioneid;
    private String nomeCliente;
    private String data;
    private String orario;
    private ValidationEnum validation;

    public Prenotazione(String nomeCliente, String data, String orario) {
        this.nomeCliente = nomeCliente;
        this.data = data;
        this.orario = orario;

    }

    public Prenotazione(Integer prenotazioneid, String nomeCliente, String data, String orario, ValidationEnum validation) {
        this.prenotazioneid = prenotazioneid;
        this.nomeCliente = nomeCliente;
        this.data = data;
        this.orario = orario;
        this.validation = validation;
    }

    @ManyToOne
    @JoinColumn(name ="officina_id")
    private Officina officina;

    @ManyToOne
    @JoinColumn(name ="cliente_id")
    private Cliente cliente;

    public Prenotazione(String nomeCliente, String data, String orario, ValidationEnum validation) {
        this.nomeCliente = nomeCliente;
        this.data = data;
        this.orario = orario;
        this.validation = validation;
    }

    public ValidationEnum getValidation() {
        return validation;
    }

    public void setValidation(ValidationEnum validation) {
        this.validation = validation;
    }

    public Officina getOfficina() {
        return officina;
    }

    public void setOfficina(Officina officina) {
        this.officina = officina;
    }

    public Prenotazione() {
    }

    public Integer getPrenotazioneid() {
        return prenotazioneid;
    }

    public void setPrenotazioneid(Integer prenotazioneid) {
        this.prenotazioneid = prenotazioneid;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOrario() {
        return orario;
    }

    public void setOrario(String orario) {
        this.orario = orario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
