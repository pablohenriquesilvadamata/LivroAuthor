import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    ArrayList<LivroCadastro> ListaLc = new ArrayList<>();
    LivroCadastro metodosLC = new LivroCadastro();

        System.out.println("Bem vindo(a) ao sistema de cadastro de Livro e Listagem de Livro");

    Scanner scanner = new Scanner(System.in);
    int opcao;

        do {

            System.out.println("Escolha um opcao: 1 - Para Cadastrar Livro / 2 - Listagem de Livro / 0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    int opcaoLC;
                    do {

                        System.out.println("Escolha uma opcao: 1 - Cadastrar Livro / 2 - Listar Livro / 0 - Voltar ao menu anterior ");
                        opcaoLC = scanner.nextInt();

                        switch (opcaoLC) {
                            case 1:
                                LivroCadastro novalc = new LivroCadastro();
                                Author novoEndLC = new Author();

                                System.out.println("Digite o Titulo do Livro: ");
                                novalc.titulo = scanner.next();

                                System.out.println("Digite o Autor: ");
                                novalc.autor = scanner.next();

                                ListaLc.add(novalc);

                                System.out.println("Cadastro feito com sucesso!");

                                break;
                            case 2:

                                if (ListaLc.size() > 0) {

                                    for (LivroCadastro cadaLc : ListaLc) {
                                        System.out.println();
                                        System.out.println("Titulo: " + cadaLc.titulo);
                                        System.out.println("Autor: " + cadaLc.autor);
                                    }

                                    opcaoLC = scanner.nextInt();
                                } else {
                                    System.out.println("Sem lista");
                                }

                                break;
                            case 0:
                                System.out.println("Voltando ao menu anterior");
                                break;
                            default:
                                System.out.println("0,1 ou 2 voce deve digitar pois qualquer outro numero nao vai funcionara");
                                break;
                        }

                    } while (opcaoLC != 0);

                    break;

            }
        }