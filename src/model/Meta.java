package br.com.fynov.model;

public class Meta {
    private Long id;
    private String titulo;
    private Double valorAlvo;
    private Double valorAtual;
    private String prazo;

    public Meta() {}

    public Meta(Long id, String titulo, Double valorAlvo, Double valorAtual, String prazo) {
        this.id = id;
        this.titulo = titulo;
        this.valorAlvo = valorAlvo;
        this.valorAtual = valorAtual;
        this.prazo = prazo;
    }

    public void criarMeta() {
        System.out.println("[PLANEJAMENTO] Nova meta '" + this.titulo + "' criada com objetivo de R$ " + this.valorAlvo);
    }

    public void verificarProgresso() {
        double percentual = (this.valorAtual / this.valorAlvo) * 100;
        System.out.println("[PLANEJAMENTO] Meta: " + this.titulo + " | Progresso: " + percentual + "% concluído.");
    }


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public Double getValorAlvo() { return valorAlvo; }
    public void setValorAlvo(Double valorAlvo) { this.valorAlvo = valorAlvo; }
    public Double getValorAtual() { return valorAtual; }
    public void setValorAtual(Double valorAtual) { this.valorAtual = valorAtual; }
    public String getPrazo() { return prazo; }
    public void setPrazo(String prazo) { this.prazo = prazo; }
}