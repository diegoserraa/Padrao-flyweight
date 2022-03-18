package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SetorFactory {
    private static Map<String, Setor> setores = new HashMap<>();

    public static Setor getSetor(String nome, String uf) {
        Setor setor = setores.get(nome);
        if (setor == null) {
            setor = new Setor(nome, uf);
            setores.put(nome, setor);
        }
        return setor;
    }

    public static int getTotalSetores() {
        return setores.size();
    }



}




