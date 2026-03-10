package br.com.fiap.fynov.model;

public abstract class MovimentacaoFinanceira {
    private String date;
    private String description;
    private double value;
    private String category;
    private Long idUsuario;

    public MovimentacaoFinanceira() {}

    public MovimentacaoFinanceira(String date, String description, double value, String category, Long idUsuario) {
        this.date = date;
        this.description = description;
        this.value = value;
        this.category = category;
        this.idUsuario = idUsuario;
    }

    public abstract void registrar();

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
