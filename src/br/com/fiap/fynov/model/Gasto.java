package br.com.fiap.fynov.model;

import java.util.Collections;
import java.util.List;

public class Gasto extends MovimentacaoFinanceira {
    private Long idGasto;
    private String paymentMethod;

    public Gasto() {
        super();
    }

    public Gasto(Long idGasto, String date, String description, double value, String category, String paymentMethod, Long idUsuario) {
        super(date, description, value, category, idUsuario);
        this.idGasto = idGasto;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public void registrar() {
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

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
