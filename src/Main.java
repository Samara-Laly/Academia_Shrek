import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Cria um objeto para ler os dados do console
        Scanner scanner = new Scanner(System.in);
        // Cria um objeto Academia onde serão realizada a operacões
        Academia academia = new Academia();

        int opcao;
        do {
            System.out.println("========Academia Shrek========");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Visualizar Alunos");
            System.out.println("3. Modificar Cadastro");
            System.out.println("4. Remover Aluno");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            //Consome a quebra de linha deixada pelo nextInt()
            scanner.nextLine();

            switch (opcao){
                case 1:
                    //Chama os métodos
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
            // Repete o processo até o usuario escolha a opção de "Sair"
        } while (opcao !=0);
            //Fecha o scanner quando o program termina.
            scanner.close();
    }
}