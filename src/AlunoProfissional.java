
public class AlunoProfissional extends Aluno {
    private final String categoriaProfissional;

    public AlunoProfissional(String nome, Faixa faixa, int idade, String lutaEscolhida, String categoriaProfissional) {
        super(nome, faixa, idade, lutaEscolhida);
        this.categoriaProfissional = categoriaProfissional;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("========Aluno Profissional:========");
        System.out.println("Nome:" + getNome());
        System.out.println("Faixa:" + getFaixa());
        System.out.println("Idade:" + getIdade());
        System.out.println("Luta escolhida:" + getLutaEscolhida());
        System.out.println("Categoria profissional:" + categoriaProfissional);
        System.out.println("====================================");
    }
}