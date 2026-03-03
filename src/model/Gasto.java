package br.com.fynov.model;

/**
 * Representa uma saída financeira (conta, compra, etc.).
 */
public class Gasto {

    private Long id;
    private String data;
    private String descricao;
    private Double valor;
    private String categoria;

    public Gasto() {
    }

    public Gasto(Long id, String data, String descricao, Double valor, String categoria) {
        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    public void registrarGasto() {
        // TODO: implementar registro de gasto
        System.out.println("registrarGasto() executado");
    }

    public void listarGastos() {
        // TODO: implementar listagem de gastos
        System.out.println("listarGastos() executado");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
