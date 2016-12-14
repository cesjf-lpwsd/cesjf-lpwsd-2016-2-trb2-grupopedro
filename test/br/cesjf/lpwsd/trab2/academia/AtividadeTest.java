/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lpwsd.trab2.academia;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dara
 */
public class AtividadeTest {
    
    public AtividadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testGetAtividade(){
        Atividade a = new Atividade();
        assertEquals("", a.getNomeAtividade());
    }
    
    @Test
    public void testSetAtividade() {
        Atividade a = new Atividade();
        a.setNomeAtividade("Peteca");
        assertEquals("Peteca", a.getNomeAtividade());
    }
    @Test
    public void testSetStatus(){
        Atividade a = new Atividade();
        a.setStatus("aberto");
        assertEquals("aberto", a.getStatus());
    }
    @Test
    public void testFecharStatus(){
        Atividade a = new Atividade();
        a.setStatus("fechado");
        assertEquals("fechado", a.getStatus());        
    }
    @Test
    public void testMatricula(){
        boolean teste;
        Atividade a = new Atividade();
        Aluno b = new Aluno();
        Inscricao i = new Inscricao();
        a.setValor(100);
        a.setStatus("aberto");
        b.setNome("joao");
        teste = i.fazerMatricula(b, 150, a);
        assertEquals(true, teste);
    }
}
