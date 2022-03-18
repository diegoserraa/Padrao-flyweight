package padroesestruturais.flyweight;

public class Equipamento {

    private String nome;
    private Setor setor;

    public Equipamento(String nome, Setor setor) {
        this.nome = nome;
        this.setor = setor;
    }

    public String obterEquipamento() {
        return "Equipamento{" +
                "nome='" + this.nome + '\'' +
                ", setor='" + setor.getNome() + '\'' +
                ", descricao='" + setor.getDescricao() + '\'' +
                '}';
    }
}
