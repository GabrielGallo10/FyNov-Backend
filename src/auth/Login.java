package br.com.fynov.auth;

/**
 * Representa a autenticação do usuário no sistema (credenciais de acesso).
 */
public class Login {

    private String username;
    private String password;

    public Login() {
    }

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void doLogin() {
        // TODO: implementar lógica de autenticação
        System.out.println("doLogin() executado");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
