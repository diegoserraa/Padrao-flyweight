package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Clinica {

    private List<Equipamento> equipamentos = new ArrayList<>();

    public void cadastrar(String nomeEquipamento, String nome, String descricao) {
        Setor setor = SetorFactory.getSetor(nome, descricao);
        Equipamento equipamento = new Equipamento(nome, setor);
        equipamentos.add(equipamento);
    }

    public List<String> obterEquipamentos() {
        List<String> retorno = new ArrayList<String>();
        for (Equipamento equipamento : this.equipamentos) {
            retorno.add(equipamento.obterEquipamento());
        }
        return retorno;
    }


}
