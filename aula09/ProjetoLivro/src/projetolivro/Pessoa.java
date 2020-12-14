package projetolivro;

public class Pessoa {
    // Atributos
    private String nome, sexo;
    private int idade;

    // Métodos Públicos
    public void fazerAniver() {
        this.setIdade(this.getIdade() + 1);
    }

    // Métodos Especiais
    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
