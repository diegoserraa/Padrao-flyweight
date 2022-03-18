package padroesestruturais.flyweight;

public class Setor {

    private String nome;
    private String descricao;

    public Setor(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}
