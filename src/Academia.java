import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Academia implements Cadastravel {
    private ArrayList<Aluno> alunos;

    public Academia() {
        alunos = new ArrayList<>();
    }

    @Override
    public void cadastrarAluno(Scanner scanner) {
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        Faixa faixa = null;
        while (faixa == null) {
            System.out.println("Digite a faixa do aluno (BRANCA, AZUL, ROXO, PRETA:");
            try {
                faixa = Faixa.valueOf(scanner.nextLine().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Faixa inválida. Tente novamente.");
            }
        }
        System.out.println("Digite a idade do aluno:");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite qual luta escolhida:");
        String lutaEscolhida = scanner.nextLine();

        System.out.println("O aluno é profissional: (Sim/Não)");
        String categoria = scanner.nextLine();

        if (categoria.equalsIgnoreCase("Sim")) {
            System.out.println("Digite a categoria profissional do aluno:");
            String categoriaProfissional = scanner.nextLine();

            alunos.add(new AlunoProfissional(nome, faixa, idade, lutaEscolhida, categoriaProfissional));
        } else {
            alunos.add(new AlunoRegular(nome, faixa, idade, lutaEscolhida ));
        }
        System.out.println("Aluno cadastrado com secesso!");
    }

    public void visualizarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de Alunos Cadastrados:");
            System.out.println("=====================================");
            for (Aluno aluno : alunos) {
                aluno.mostrarInformacoes();  // Aqui você deve garantir que Aluno tenha o método 'mostrarInformacoes()'
            }
        }
    }

    public void removerAluno(String nome) {
        alunos.removeIf(aluno -> aluno.getNome().equalsIgnoreCase(nome));
        System.out.println("Aluno removido com sucesso!");
    }
    public void modificarCadastro(Scanner scanner){
        System.out.println("Digit o nome do aluno a ser modificado: ");
        String nome = scanner.nextLine();

        Aluno alunoEncontrado = null;
        for (Aluno aluno : alunos){
            if (aluno.getNome().equalsIgnoreCase(nome)){
                alunoEncontrado = aluno;
                break;
            }
        }
        if (alunoEncontrado!= null) {
            System.out.println("Aluno encontrado! O que voce deseja modificar?");
            System.out.println("1. Nome");
            System.out.println("2. Faixa");
            System.out.println("3. Idade");
            System.out.println("1. Escolha uma opção:");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o novo nome:");
                    alunoEncontrado.setNome(scanner.nextLine());
                    break;
                case 2:
                    Faixa novaFaixa = null;
                    while (novaFaixa == null){
                        System.out.println("Digite a nova faixa(BRANCA, AZUL, ROXO, PRETA):");
                        try {
                            novaFaixa = Faixa.valueOf(scanner.nextLine().toUpperCase());
                        } catch (IllegalArgumentException e){
                            System.out.println("Faixa inválida. Tente novamente.");
                        }
                    }
                    alunoEncontrado.setFaixa(novaFaixa);
                    break;

                    case 3:
                    System.out.println("Digite a nova idade:");
                    int novaIdade = scanner.nextInt();
                    alunoEncontrado.setIdade(novaIdade);
                    scanner.nextLine();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            System.out.println("Cadastro modificado com sucesso!");
        }else {
            System.out.println("Aluno não encontrado.");
        }
    }
}

