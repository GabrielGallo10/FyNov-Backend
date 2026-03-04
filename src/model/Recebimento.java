package br.com.fynov.model;

public class Recebimento {
    private Long id;
    private String data;
    private String descricao;
    private Double valor;
    private String categoria;

    public Recebimento() {}

    public Recebimento(Long id, String data, String descricao, Double valor, String categoria) {
        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    public void registrarRecebimento() {
        System.out.println("[FINANCEIRO] Registrando entrada: " + this.descricao + " | Valor: R$ " + this.valor);
    }

    public void listarRecebimentos() {
        System.out.println("[RELATÓRIO] Listando recebimentos da categoria: " + this.categoria);
    }


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