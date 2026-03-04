package br.com.fiap.fynov;

import br.com.fiap.fynov.auth.Login;
import br.com.fiap.fynov.auth.Register;
import br.com.fiap.fynov.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sistemaRodando = true;
        boolean usuarioLogado = false;
        Usuario usuarioAtivo = null;

        System.out.println("======= SISTEMA FINANCEIRO FYNOV =======");

        while (!usuarioLogado) {
            System.out.println("\n1. Fazer Login");
            System.out.println("2. Cadastrar-se");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcaoAcesso = sc.nextInt();

            switch (opcaoAcesso) {
                case 1:
                    System.out.print("E-mail: ");
                    String emailLogin = sc.next() + sc.nextLine();
                    System.out.print("Senha: ");
                    String senhaLogin = sc.next() + sc.nextLine();

                    Login login = new Login(emailLogin, senhaLogin);
                    login.doLogin();

                    usuarioAtivo = new Usuario(1L, "Usuário Teste", emailLogin, senhaLogin);
                    System.out.println("Login realizado com sucesso!");
                    usuarioLogado = true;
                    break;

                case 2:
                    System.out.println("\n--- Cadastro ---");
                    System.out.print("Nome completo: ");
                    String nome = sc.next() + sc.nextLine();
                    System.out.print("E-mail: ");
                    String email = sc.next() + sc.nextLine();
                    System.out.print("Senha: ");
                    String senha = sc.next() + sc.nextLine();

                    Register registro = new Register(nome, email, senha);
                    registro.doRegister();

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
            System.out.println("Olá, " + usuarioAtivo.getName() + "!");
            System.out.println("1 - Ver Perfil");
            System.out.println("2 - Registrar Gasto");
            System.out.println("3 - Registrar Recebimento");
            System.out.println("4 - Criar Meta Financeira e Ver Progresso");
            System.out.println("5 - Chat");
            System.out.println("0 - Sair do Sistema");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    usuarioAtivo.showProfile();
                    break;

                case 2:
                    System.out.print("Descrição do gasto: ");
                    String descGasto = sc.next() + sc.nextLine();
                    System.out.print("Valor: R$ ");
                    double valorGasto = sc.nextDouble();
                    System.out.print("Categoria: ");
                    String categoriaGastos = sc.next() + sc.nextLine();
                    System.out.print("Forma de Pagamento: ");
                    String forma = sc.next() + sc.nextLine();

                    Gasto g = new Gasto(1L, "03/03/2026", descGasto, valorGasto, categoriaGastos, forma, usuarioAtivo.getId());
                    g.registerGasto();
                    break;

                case 3:
                    System.out.print("Descrição da entrada: ");
                    String descRec = sc.next() + sc.nextLine();
                    System.out.print("Valor: R$ ");
                    double valorRec = sc.nextDouble();
                    System.out.print("Categoria: ");
                    String categoriaRec = sc.next() + sc.nextLine();

                    Recebimento r = new Recebimento(1L, "03/03/2026", descRec, valorRec, categoriaRec, usuarioAtivo.getId());
                    r.registerRecebimento();
                    break;

                case 4:
                    System.out.print("Título da meta: ");
                    String titulo = sc.next() + sc.nextLine();
                    System.out.print("Valor Alvo: R$ ");
                    double alvo = sc.nextDouble();
                    System.out.print("Valor Atual: R$ ");
                    double atual = sc.nextDouble();

                    Meta m = new Meta(1L, titulo, alvo, atual, "2026", usuarioAtivo.getId());
                    double progresso = m.checkProgress();
                    break;

                case 5:
                    AgenteIA agente = AgenteIA.getInstancia();
                    Chat chat = new Chat(1L, usuarioAtivo.getId(), agente.getIdAgente());
                    boolean chatRodando = true;

                    while (chatRodando) {
                        System.out.println("\n----------- CHAT -----------");
                        System.out.println("1 - Enviar Mensagem");
                        System.out.println("0 - Sair");

                        int op = sc.nextInt();
                        switch (op) {
                            case 1:
                                System.out.println("Texto da mensagem: ");
                                String texto = sc.next() + sc.nextLine();

                                Mensagem msg = new Mensagem(usuarioAtivo.getId(), texto);
                                chat.sendMessage(msg);
                                break;

                            case 0:
                                System.out.println("Saindo do Chat...");
                                chatRodando = false;
                                break;

                            default:
                                System.out.println("Opção inválida!");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo do FyNov... Até logo!");
                    sistemaRodando = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}