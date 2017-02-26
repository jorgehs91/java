/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appchamada;

import classes.*;

/**
 *
 * @author Alunos
 */
public class AppChamada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno();
        Aluno aluno5 = new Aluno();
        
        aluno1.nome = "João";
        aluno2.nome = "José";
        aluno3.nome = "Pedro";
        aluno4.nome = "Joaquim";
        aluno5.nome = "Manoel";
        
        Aluno listaDeAlunos[] = {aluno1,aluno2,aluno3,aluno4,aluno5};
        
        Professor prof = new Professor();
        prof.nome = "Marcela";
        prof.fazerChamada(listaDeAlunos);
        
       // chamada.gerarData();
       //chamada.gerarLista();
       
    }    
}
