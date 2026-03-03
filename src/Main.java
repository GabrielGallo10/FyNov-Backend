package br.com.fynov;

import br.com.fynov.auth.Login;
import br.com.fynov.model.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean sistemaRodando = true;
        boolean usuarioLogado = false;
        Usuario usuarioAtivo = null;

        System.out.println("======= SISTEMA FINANCEIRO FYNOV =======");

        while (!usuarioLogado) {
            System.out.println("\n1. Fazer Login");
            System.out.println("2. Cadastrar Novo Usuário");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcaoAcesso = leitor.nextInt();
            leitor.nextLine();

            switch (opcaoAcesso) {
                case 1:
                    System.out.print("E-mail: ");
                    String emailLogin = leitor.nextLine();
                    System.out.print("Senha: ");
                    String senhaLogin = leitor.nextLine();

                    Login login = new Login(emailLogin, senhaLogin);
                    login.doLogin();

                    usuarioAtivo = new Usuario(1L, "Usuário Teste", emailLogin, senhaLogin);
                    usuarioLogado = true;
                    break;

                case 2:
                    System.out.println("\n--- Cadastro ---");
                    System.out.print("Nome completo: ");
                    String nome = leitor.nextLine();
                    System.out.print("E-mail: ");
                    String email = leitor.nextLine();
                    System.out.print("Crie uma senha: ");
                    String senha = leitor.nextLine();

                    usuarioAtivo = new Usuario(1L, nome, email, senha);
                    System.out.println("Cadastro realizado com sucesso!");
                    usuarioLogado = true;
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        while (sistemaRodando) {
            System.out.println("\n----------- MENU PRINCIPAL -----------");
            System.out.println("Olá, " + usuarioAtivo.getNome() + "!");
            System.out.println("1. Ver Meu Perfil");
            System.out.println("2. Registrar Novo Gasto");
            System.out.println("3. Registrar Recebimento");
            System.out.println("4. Criar/Ver Meta Financeira");
            System.out.println("0. Sair do Sistema");
            System.out.print("Escolha uma opção: ");

            int opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    usuarioAtivo.exibirPerfil();
                    break;

                case 2:
                    System.out.print("Descrição do gasto: ");
                    String descGasto = leitor.nextLine();
                    System.out.print("Valor: R$ ");
                    double valorGasto = leitor.nextDouble();
                    leitor.nextLine();
                    System.out.print("Forma de Pagamento: ");
                    String forma = leitor.nextLine();

                    Gasto g = new Gasto(1L, "03/03/2026", descGasto, valorGasto, "Geral", forma);
                    g.registrarGasto();
                    break;

                case 3:
                    System.out.print("Descrição da entrada: ");
                    String descRec = leitor.nextLine();
                    System.out.print("Valor: R$ ");
                    double valorRec = leitor.nextDouble();
                    leitor.nextLine();

                    Recebimento r = new Recebimento(1L, "03/03/2026", descRec, valorRec, "Renda");
                    r.registrarRecebimento();
                    break;

                case 4:
                    System.out.print("Título da meta: ");
                    String titulo = leitor.nextLine();
                    System.out.print("Valor Alvo: R$ ");
                    double alvo = leitor.nextDouble();
                    System.out.print("Valor Atual: R$ ");
                    double atual = leitor.nextDouble();
                    leitor.nextLine();

                    Meta m = new Meta(1L, titulo, alvo, atual, "2026");
                    m.verificarProgresso();
                    break;

                case 0:
                    System.out.println("Saindo do FyNov... Até logo!");
                    sistemaRodando = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        leitor.close();
    }
}