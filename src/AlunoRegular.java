
public class AlunoRegular extends Aluno{
    public AlunoRegular(String nome, Faixa faixa, int idade, String lutaEscolhida){
        super(nome, faixa, idade, lutaEscolhida);
    }

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

