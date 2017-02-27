/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppet;

/**
 *
 * @author Alunos
 */
public class Coelho {
    String raca;
    int idade;
    String nomeDono;
    String cor;
    double peso;
    boolean morde;
    String dieta;
    
    void morder(){
        this.morde = true;
    }
    
    void alterarDieta(String novaDieta){
        this.dieta = novaDieta;
    }
    
    String imprimirFicha(){
        String dados = "\n\t" + this.nomeDono + "\n\t" + this.raca + "\n\t" + this.idade + "\n\tMorde: " + this.morde;
        return dados;
    }  
}
