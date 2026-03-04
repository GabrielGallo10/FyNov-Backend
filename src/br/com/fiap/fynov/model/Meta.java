package br.com.fiap.fynov.model;

import java.util.Collections;
import java.util.List;

public class Meta {
    private Long idMeta;
    private String title;
    private double targetValue;
    private double currentValue;
    private String term;
    private Long idUsuario;

    public Meta() {}

    public Meta(Long idMeta, String title, double targetValue, double currentValue, String term, Long idUsuario) {
        this.idMeta = idMeta;
        this.title = title;
        this.targetValue = targetValue;
        this.currentValue = currentValue;
        this.term = term;
        this.idUsuario = idUsuario;
    }

    public void createMeta() {
        System.out.println("Aplicar a lógica de criar meta.");
    }

    public List<Meta> listMetas() {
        System.out.println("Aplicar a lógica de listar as metas.");
        return Collections.emptyList();
    }

    public double checkProgress() {
        double percentual = 0.0;
        System.out.println("Aplicar a lógica de verificar o progresso da meta em porcentagem.");
        return percentual;
    }

    public Long getIdMeta() {
        return idMeta;
    }

    public void setIdMeta(Long idMeta) {
        this.idMeta = idMeta;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(double targetValue) {
        this.targetValue = targetValue;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
}
