// Classe dos alunos regulares e herda da classe Aluno
public class AlunoRegular extends Aluno{
    // Construtor da classe AlunoRegular chama o construto da superclasse Aluno
    public AlunoRegular(String nome, Faixa faixa, int idade, String lutaEscolhida){
        super(nome, faixa, idade, lutaEscolhida);
    }

    //Metodo que sobrescreve o metodo mostrarInformacoes da classe Aluno
    @Override
    public void mostrarInformacoes() {
        System.out.println("===========Aluno Regular============");
        System.out.println("Nome:" + getNome());
        System.out.println("Faixa:" + getFaixa());
        System.out.println("Idade:" + getIdade());
        System.out.println("Luta escolhida:" + getLutaEscolhida());
        System.out.println("====================================");
    }

}

