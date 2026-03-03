package br.com.fynov.model;

public class Gasto {
    private Long id;
    private String data;
    private String descricao;
    private Double valor;
    private String categoria;
    private String formaPagamento; // Campo novo para dar um "plus"

    public Gasto() {}

    public Gasto(Long id, String data, String descricao, Double valor, String categoria, String formaPagamento) {
        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
        this.formaPagamento = formaPagamento;
    }

    public void registrarGasto() {
        System.out.println("[FINANCEIRO] Registrando gasto: " + this.descricao + " | Valor: R$ " + this.valor + " | Pago via: " + this.formaPagamento);
    }

    public void listarGastos() {
        System.out.println("[RELATÓRIO] Listando gastos da categoria: " + this.categoria);
    }

    public String getFormaPagamento() { return formaPagamento; }
    public void setFormaPagamento(String formaPagamento) { this.formaPagamento = formaPagamento; }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
}