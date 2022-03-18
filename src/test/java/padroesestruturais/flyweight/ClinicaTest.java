package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClinicaTest {

    @Test
    void deveRetornarEquipamentos() {
        Clinica clinica = new Clinica();
        clinica.cadastrar("respirador", "sala vermelha", "o melhor que nos temos");
        clinica.cadastrar("maca", "sala amarela", "muito boa");
        clinica.cadastrar("monitor", "recepção", "4k full master");


        List<String> retorno = Arrays.asList(
                "Equipamento{nomeEquipamento='respirador', setor='sala vermelha', descricao='o melhor que nos temos'}",
                "Equipamento{nomeEquipamento='maca', setor='sala amarela', descricao='muito boa'}",
                "Equipamento{nomeEquipamento='monitor', setor='recepção', descricao='4k full master'}");



    }

    @Test
    void deveRetornarTotalSetores() {
        Clinica clinica = new Clinica();
        clinica.cadastrar("respirador", "sala vermelha", "o melhor que nos temos");
        clinica.cadastrar("maca", "sala amarela", "muito boa");
        clinica.cadastrar("monitor", "recepção", "4k full master");

        assertEquals(3, SetorFactory.getTotalSetores());
    }

}