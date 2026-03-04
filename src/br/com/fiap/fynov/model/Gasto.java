package br.com.fiap.fynov.model;

import java.util.Collections;
import java.util.List;

public class Gasto {
    private Long idGasto;
    private String date;
    private String description;
    private double value;
    private String category;
    private String paymentMethod;
    private Long idUsuario;

    public Gasto() {}

    public Gasto(Long idGasto, String date, String description, double value, String category, String paymentMethod, Long idUsuario) {
        this.idGasto = idGasto;
        this.date = date;
        this.description = description;
        this.value = value;
        this.category = category;
        this.paymentMethod = paymentMethod;
        this.idUsuario = idUsuario;
    }

    public void registerGasto() {
        System.out.println("Aplicar a lógica de registrar o gasto.");
    }

    public List<Gasto> listGastos() {
        System.out.println("Aplicar a lógica de listar os gastos.");
        return Collections.emptyList();
    }

    public Long getIdGasto() {
        return idGasto;
    }

    public void setIdGasto(Long idGasto) {
        this.idGasto = idGasto;
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

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
}
