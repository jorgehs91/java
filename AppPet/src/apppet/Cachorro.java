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
public class Cachorro {
    String raca;
    int idade;
    String nomeDono;
    String cor;
    double peso;
    boolean morde;
    String dieta;    
    
    Cachorro(String r, String nm){
         this.raca = r;
         this.nomeDono = nm;
         this.dieta = "Ração duas vezes ao dia..";
        System.out.println("Criando um cachorro");
    }
    
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
