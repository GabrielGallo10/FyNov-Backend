package br.com.fiap.fynov.model;

public class Mensagem {
    private Long idRemetente;
    private String text;

    public Mensagem() {}

    public Mensagem(Long idRemetente, String text) {
        this.idRemetente = idRemetente;
        this.text = text;
    }

    public Long getIdRemetente() {
        return idRemetente;
    }

    public void setIdRemetente(Long idRemetente) {
        this.idRemetente = idRemetente;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
