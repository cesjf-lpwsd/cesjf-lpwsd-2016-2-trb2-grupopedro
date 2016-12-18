
package br.cesjf.lpwsd.trab2.academia;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class AlunoTest {
    
    public AlunoTest() {
    }
    

 


   @Test
    public void testSetNome() {
        Aluno a = new Aluno();
        a.setNome("Igor");
        assertEquals("Igor", a.getNome());
    }

    /**
     * Test of getMensalidade method, of class Aluno.
     */
    @Test
    public void testGetMensalidade() {
       Aluno a = new Aluno();
       assertEquals(0.0, a.getMensalidade(), 0.001);
    }

    /**
     * Test of setMensalidade method, of class Aluno.
     */
    @Test
    public void testSetMensalidade() {
         Aluno a = new Aluno();
         a.setMensalidade(50f);
         assertEquals(50.0, a.getMensalidade(), 0.001);
    }

    /**
     * Test of getMatricula method, of class Aluno.
     */
    @Test
    public void testGetMatricula() {
        Aluno a = new Aluno();
        assertEquals(0.0, a.getMatricula(), 0.001);
    }

    /**
     * Test of setMatricula method, of class Aluno.
     */
    @Test
    public void testSetMatricula() {
         Aluno a = new Aluno();
         a.setMatricula(50f);
         assertEquals(50.0, a.getMatricula(), 0.001);
    }
    
}
