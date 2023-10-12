import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Livro> ListaL = new ArrayList<>();
        Livro metodosL = new Livro();

        System.out.println("Bem vindo(a) ao sistema de cadastro de Livro e Listagem de Livro");

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("Escolha - 1 Cadastrar Livro / - 2 Listar Livro / - 0 Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:

                    Livro novalc = new Livro();
                    Author novoEndL = new Author();

                    System.out.println("Digite o Titulo do Livro: ");
                    novalc.titulo = scanner.next();

                    System.out.println("Digite o Nome do autor: ");
                    novoEndL.nome = scanner.next();

                    System.out.println("Local de nascimento do autor: ");
                    novoEndL.localNascimento = scanner.next();

                    System.out.println("Preco do Livro: ");
                    novalc.preco = scanner.nextFloat();

                    System.out.println("Digite a data de Lancamento (dd/MM/aaa): ");
                    LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyy"));
                    Period period = Period.between(date, LocalDate.now());

                    novalc.dataLancamento = date;

                    if (period.getYears() >= 5) {
                        System.out.println("O livro tem mais de 5 anos!");
                    } else {
                        System.out.println("O livro nao tem mais de 5 anos!");
                        break;
                    }

                    novalc.autor = novoEndL;

                    ListaL.add(novalc);

                    System.out.println("Cadastro feito com sucesso!");

                    break;
                case 2:

                    if (ListaL.size() > 0) {

                        for (Livro cadaLc : ListaL) {
                            System.out.println();
                            System.out.println("Titulo: " + cadaLc.titulo);
                            System.out.println("Autor e Local de Nascimento: " + cadaLc.autor.nome + ", " + cadaLc.autor.localNascimento);
                            System.out.println("Preco: " + cadaLc.preco);
                            System.out.println("DataLancamento: " + cadaLc.dataLancamento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                        }

                        opcao = scanner.nextInt();
                    } else {
                        System.out.println("Sem lista");
                    }

                    break;
                case 0:
                    System.out.println("Voltando ao menu anterior");
                    break;
                default:
                    System.out.println("0,1 ou 2 voce deve digitar pois qualquer outro nao vai funcionara");
                    break;
            }

        } while (opcao != 0);
        ;
    }
}
