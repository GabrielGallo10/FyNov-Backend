package br.com.fiap.fynov.model;

import java.util.Collections;
import java.util.List;

public class Recebimento {
    private Long idRecebimento;
    private String date;
    private String description;
    private double value;
    private String category;
    private Long idUsuario;

    public Recebimento() {}

    public Recebimento(Long idRecebimento, String date, String description, double value, String category, Long idUsuario) {
        this.idRecebimento = idRecebimento;
        this.date = date;
        this.description = description;
        this.value = value;
        this.category = category;
        this.idUsuario = idUsuario;
    }

    public void registerRecebimento() {
        System.out.println("Aplicar a lógica de registrar o recebimento.");
    }

    public List<Recebimento> listRecebimentos() {
        System.out.println("Aplicar a lógica de listar os recebimentos.");
        return Collections.emptyList();
    }

    public Long getIdRecebimento() {
        return idRecebimento;
    }

    public void setIdRecebimento(Long idRecebimento) {
        this.idRecebimento = idRecebimento;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
}
