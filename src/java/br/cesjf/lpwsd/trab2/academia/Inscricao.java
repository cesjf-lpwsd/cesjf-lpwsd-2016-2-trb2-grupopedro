
package br.cesjf.lpwsd.trab2.academia;

import java.util.ArrayList;

public class Inscricao {
    
    public boolean fazerMatricula(Aluno a, float matricula, Atividade b){
        if(b.getStatus() == "aberto" && matricula == (b.getValor() * 1.5f)){
            b.inserirAtividade(a);
            return true;
        } else return false;
    }
    
}
