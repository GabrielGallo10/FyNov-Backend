package br.com.fiap.fynov.auth;

public class Login extends Autenticacao {

    public Login() {
        super();
    }

    public Login(String email, String password) {
        super(email, password);
    }

    public void doLogin() {
        System.out.println("Aplicar a lógica de fazer login.");
    }
}
