package br.com.fiap.fynov.model;

import java.util.Collections;
import java.util.List;

public class Recebimento extends MovimentacaoFinanceira {
    private Long idRecebimento;

    public Recebimento() {
        super();
    }

    public Recebimento(Long idRecebimento, String date, String description, double value, String category, Long idUsuario) {
        super(date, description, value, category, idUsuario);
        this.idRecebimento = idRecebimento;
    }

    @Override
    public void registrar() {
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
}
