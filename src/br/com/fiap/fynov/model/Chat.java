package br.com.fiap.fynov.model;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    private Long idChat;
    private Long idUsuario;
    private Long idAgente;
    private List<Mensagem> messages;

    public Chat() {
        this.messages = new ArrayList<>();
    }

    public Chat(Long idChat, Long idUsuario, Long idAgente) {
        this.idChat = idChat;
        this.idUsuario = idUsuario;
        this.idAgente = idAgente;
        this.messages = new ArrayList<>();
    }

    public void sendMessage(Mensagem message) {
        System.out.println("Aplicar lógica de enviar message(adicionar a mensagem na lista)!");
    }

    public Long getIdChat() {
        return idChat;
    }

    public void setIdChat(Long idChat) {
        this.idChat = idChat;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(Long idAgente) {
        this.idAgente = idAgente;
    }

    public List<Mensagem> getMessages() {
        return messages;
    }

    public void setMessages(List<Mensagem> messages) {
        this.messages = messages != null ? messages : new ArrayList<>();
    }
}
