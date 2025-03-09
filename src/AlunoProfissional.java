// A classe AlunoProfissional esta herdando da classe abstrata Aluno.
public class AlunoProfissional extends Aluno {
    private final String categoriaProfissional;

    public AlunoProfissional(String nome, Faixa faixa, int idade, String lutaEscolhida, String categoriaProfissional) {
        // Esta chamando o contrutor da classe Aluno
        super(nome, faixa, idade, lutaEscolhida);
        //Inicializa o atributo com o valor fornecido
        this.categoriaProfissional = categoriaProfissional;
    }
    //Sobrescreve o metodo abstrato vazio da classe Aluno "mostrarInformacoes()".
    @Override
    public void mostrarInformacoes() {
        System.out.println("========Aluno Profissional:========");
        System.out.println("Nome:" + getNome()); // Esta acessando através do metodo
        System.out.println("Faixa:" + getFaixa());
        System.out.println("Idade:" + getIdade());
        System.out.println("Luta escolhida:" + getLutaEscolhida());
        System.out.println("Categoria por peso:" + categoriaProfissional);
        System.out.println("====================================");
    }
}