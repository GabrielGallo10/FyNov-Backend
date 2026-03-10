package br.com.fiap.fynov.auth;

public class Register extends Autenticacao {
    private String name;

    public Register() {
        super();
    }

    public Register(String name, String email, String password) {
        super(email, password);
        this.name = name;
    }

    public void doRegister() {
        System.out.println("Aplicar lógica de fazer registro.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
