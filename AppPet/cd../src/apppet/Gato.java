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
public class Gato {
    private String nome;
    private int idade;
    private String nomeDono;
    private String cor;
    private double peso;
    private boolean morde;
    private String dieta;
    
    public void alteraDieta(String novaDieta){
        this.dieta = "Água - " + novaDieta;
    }
    
    public String imprimirFicha(){
        String dados = "\n\t" + this.nomeDono + "\n\t" + this.nome + "\n\t" + this.idade + "\n\t" + this.dieta;
        return dados;
    }    
    
    public void setNome(String nm){
        this.nome = nm;
    }
    
    public String getNomeGato(){
        return this.nome;
    }
    
}
