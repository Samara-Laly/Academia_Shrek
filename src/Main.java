import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Academia academia = new Academia();

        int opcao;
        do {
            System.out.println("=====Academia Shrek=====");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Visualizar Alunos");
            System.out.println("3. Modificar Cadastro");
            System.out.println("4. Remover Aluno");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    academia.cadastrarAluno(scanner);
                    break;
                case 2:
                    academia.visualizarAlunos();
                    break;
                case 3:
                    academia.modificarCadastro(scanner);
                    break;
                case 4:
                    System.out.println("Digite o nome do aluno a ser removido");
                    String nomeRemover = scanner.nextLine();
                    academia.removerAluno(nomeRemover);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao !=0);
            scanner.close();
    }
}