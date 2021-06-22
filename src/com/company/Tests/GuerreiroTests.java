package com.company.Tests;

import com.company.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuerreiroTests {

    @Test
    public void testClone() throws CloneNotSupportedException {
        Espada espada = new Espada(100, 120, Material.ADAMANTIUM);
        Escudo escudo = new Escudo(93, 30, Material.TITANIO);

        Escudo escudo2 = escudo.clone();
        escudo2.setDiametro(35);

        Guerreiro guerreiro = new Guerreiro(Poder.FORÇA, Raca.ORC, escudo, espada);

        Guerreiro guerreiro2 = guerreiro.clone();
        guerreiro2.setEscudo(escudo2);

        assertEquals("Guerreiro{poder=FORÇA, raca=ORC, escudo=Escudo{dureza=93, diametro=30, material=TITANIO}, espada=Espada{dureza=100, comprimento=120, material=ADAMANTIUM}}", guerreiro.toString());
    }
}
