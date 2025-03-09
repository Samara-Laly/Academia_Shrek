// Classe abstract não pode ser instanciada diretamente
// Atributos privados da classe Aluno
public abstract class Aluno {
    private String nome;
    private Faixa faixa;
    private int idade;
    private String lutaEscolhida;


    // Contrutor padrão, inicializa os atributos com valores padrão
    public Aluno(){
        this.nome = "";
        this.faixa = Faixa.BRANCA;
        this.idade = 0;
        this.lutaEscolhida = "";
    }
    // Construtor parametrizado, inicializa com valores específico
    public Aluno(String nome, Faixa faixa, int idade, String lutaEscolhida) {
        this.nome = nome;
        this.faixa = faixa;
        this.idade = idade;
        this.lutaEscolhida = lutaEscolhida;
    }
    //Construtor de cópia, cria um abjeto a partir de outro.
    public Aluno(Aluno aluno){
        this.nome = aluno.nome;
        this.faixa = aluno.faixa;
        this.idade = aluno.idade;
        this.lutaEscolhida = aluno.lutaEscolhida;
    }

    //Metodos Getters Setters (acessadores e modificadores)

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Faixa getFaixa() {
        return faixa;
    }

    public void setFaixa(Faixa faixa) {
        this.faixa = faixa;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLutaEscolhida() {
        return lutaEscolhida;
    }

    public void setLutaEscolhida(String lutaEscolhida) {
        this.lutaEscolhida = lutaEscolhida;
    }
     //Metodo abstrato que mostra as informacoes dos alunos, implementadas nas subclasses.
    public void mostrarInformacoes(){

    }
}