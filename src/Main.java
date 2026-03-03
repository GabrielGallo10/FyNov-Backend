package br.com.fynov;

import br.com.fynov.auth.Login;
import br.com.fynov.model.Gasto;
import br.com.fynov.model.Meta;
import br.com.fynov.model.Recebimento;
import br.com.fynov.model.Usuario;

/**
 * Classe principal para execução do sistema FyNov.
 */
public class Main {

    public static void main(String[] args) {
        // Exemplo de uso - substitua pela sua lógica
        Login login = new Login("joao@email.com", "senha123");
        login.doLogin();

        Usuario usuario = new Usuario(1L, "João Silva", "joao@email.com", "senha123");
        usuario.exibirPerfil();
    }
}