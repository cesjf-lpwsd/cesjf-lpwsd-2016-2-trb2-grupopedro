/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lpwsd.trab2.beans;

import br.cesjf.lpwsd.trab2.academia.Aluno;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Dara
 */
@Stateless
public class AlunoFacade extends AbstractFacade<Aluno> {

    @PersistenceContext(unitName = "Trab2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AlunoFacade() {
        super(Aluno.class);
    }
    
}
