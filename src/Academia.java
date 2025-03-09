import java.util.ArrayList;
import java.util.Scanner;

public class Academia implements Cadastravel {
    private final ArrayList<Aluno> alunos;

    public Academia() {
        alunos = new ArrayList<>();
    }

    @Override
    public void cadastrarAluno(Scanner scanner) {
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        int idade = 0;
        boolean idadevalida = false;
        while (!idadevalida){
            System.out.println("Digite a idade do aluno:");
            try {
                idade = Integer.parseInt(scanner.nextLine());
                if(idade > 0){
                    idadevalida = true;
                }else {
                    System.out.println("Idade inválida. A idade deve ser um numero posiivo");
                }
            }catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Por favor, insira um número inteiro para a idade");
            }
        }


        System.out.println("Escolha a Arte Marcial:");
        System.out.println("1. Karate");
        System.out.println("2. Judô");
        System.out.println("3. Taekwondo");
        System.out.println("4. Jiu-Jitsu");
        System.out.println("5. Aikido");
        System.out.println("6. Haokido");
        System.out.println("7. Kung Fu");

        String lutaEscolhida = null;
        while (lutaEscolhida == null){
          try {
              int escolhaLuta = Integer.parseInt(scanner.nextLine());

              switch (escolhaLuta){
                  case 1:
                      lutaEscolhida = "Karate";
                      break;
                  case 2:
                      lutaEscolhida = "Judô";
                      break;
                  case 3:
                      lutaEscolhida = "Taekwondo";
                      break;
                  case 4:
                      lutaEscolhida = "Jiu-Jitsu";
                      break;
                  case 5:
                      lutaEscolhida = "Aikido";
                      break;
                  case 6:
                      lutaEscolhida = "Haokido";
                      break;
                  case 7:
                      lutaEscolhida = "Kung Fu";
                      break;
                  default:
                      System.out.println("Opção inválida. Por favor, escolha um número de 1 a 7.");
              }
          } catch (NumberFormatException e) {
              System.out.println("Entrada inválida. Tente novamente.");
          }
        }


        Faixa faixa = null;
        while (faixa == null) {
            System.out.println("Digite a faixa do aluno " +
                    "(BRANCA, AMARELA, LARANJA, VERDE, AZUL, ROXA, MARROM, PRETA: ");
            try {
                faixa = Faixa.valueOf(scanner.nextLine().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Faixa inválida. Tente novamente.");
            }
        }

        System.out.println("O aluno é profissional: (Sim/Não)");
        String categoria = scanner.nextLine();

        if (categoria.equalsIgnoreCase("Sim")) {
            System.out.println("Qual a categoria de peso do aluno:");
            System.out.println("1. Leve");
            System.out.println("2. Médio");
            System.out.println("3. Pesado");

            String categoriaProfissional = null;
            while (categoriaProfissional == null){
                try {
                    int escolhaPeso = Integer.parseInt(scanner.nextLine());
                    switch (escolhaPeso){
                        case 1:
                            categoriaProfissional = "Leve";
                            break;
                        case 2:
                            categoriaProfissional = "Médio";
                            break;
                        case 3:
                            categoriaProfissional = "Pesado";
                            break;
                        default:
                            System.out.println("Opção inválida. Por favor, escolha um número de 1 a 3.");
                            break;
                    }
                }catch (NumberFormatException e){
                    System.out.println(" Entrada inválida. Tente novamente.");
                }
            }

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
                aluno.mostrarInformacoes();
            }
        }
    }

    public void removerAluno(String nome) {
        boolean alunoRemovido = alunos.removeIf(aluno -> aluno.getNome().equalsIgnoreCase(nome));

        if (alunoRemovido){
            System.out.println("Aluno removido com sucesso!");
        } else {
            System.out.println("Aluno não encontrado.");

        }
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
        if (alunoEncontrado != null) {
            System.out.println("Aluno encontrado! O que voce deseja modificar?");
            System.out.println("1. Nome");
            System.out.println("2. Faixa");
            System.out.println("3. Idade");
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
                        System.out.println("Digite a nova faixa do aluno " +
                                "(BRANCA, AMARELA, LARANJA, VERDE, AZUL, ROXA, MARROM, PRETA: ");
                        try {
                            novaFaixa = Faixa.valueOf(scanner.nextLine().toUpperCase());
                        } catch (IllegalArgumentException e){
                            System.out.println("Faixa inválida. Tente novamente.");
                        }
                    }
                    alunoEncontrado.setFaixa(novaFaixa);
                    break;

                    case 3:
                        while (true){
                            try {
                                int novaIdade = Integer.parseInt(scanner.nextLine());
                                alunoEncontrado.setIdade(novaIdade);
                                break;
                            }catch (NumberFormatException e){
                                System.out.println("Idade inválida. Tente novamente.");
                            }
                        }
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

