import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    ListaArray listaPessoas = new ListaArray();
    Scanner scanner = new Scanner(System.in);

    int opcao;
    do {
      System.out.println("Menu Principal");
      System.out.println("1 - Inserir Pessoa");
      System.out.println("2 - Remover Pessoa");
      System.out.println("3 - Exibir Pessoas Cadastradas");
      System.out.println("4 - SAIR");
      System.out.println("Digite a opção desejada: ");
      opcao = scanner.nextInt();
      scanner.nextLine();

      switch (opcao) {
        case 1:
          System.out.print("Nome da pessoa: ");
          String nome = scanner.nextLine();
          System.out.print("Idade da pessoa: ");
          int idade = scanner.nextInt();
          Pessoa novaPessoa = new Pessoa(nome, idade);
          listaPessoas.insere(novaPessoa);
          System.out.println("Pessoa cadastrada com sucesso!");
          break;
        case 2:
          System.out.print("Índice da pessoa a ser removida: ");
          int indiceRemover = scanner.nextInt();
          listaPessoas.remove(indiceRemover);
          break;
        case 3:
          listaPessoas.exibe();
          break;
        case 4:
          System.out.println("Saindo do programa. Até mais!");
          break;
        default:
          System.out.println("Opção inválida. Escolha novamente.");
      }
    } while (opcao != 0);
    scanner.close();
  }
}