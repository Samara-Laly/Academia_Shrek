public class Aluno {
    private String nome;
    private Faixa faixa;
    private int idade;
    private String lutaEscolhida;


    // contrutores
    public Aluno(){
        this.nome = "";
        this.faixa = Faixa.valueOf("Faixa.BRANCA");
        this.idade = 0;
        this.lutaEscolhida = "";
    }

    public Aluno(String nome, Faixa faixa, int idade, String lutaEscolhida) {
        this.nome = nome;
        this.faixa = faixa;
        this.idade = idade;
        this.lutaEscolhida = lutaEscolhida;
    }

    public Aluno(Aluno aluno){
        this.nome = aluno.nome;
        this.faixa = aluno.faixa;
        this.idade = aluno.idade;
        this.lutaEscolhida = aluno.lutaEscolhida;
    }

    //Metodos Getters Setters
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
    public void mostrarInformacoes(){

    }
}