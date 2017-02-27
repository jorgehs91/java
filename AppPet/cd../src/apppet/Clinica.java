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
public class Clinica {
    double valor;
    
    public Clinica(double vl){
        this.valor = vl;
    }
    
    public void fazerConsulta(String nomeMedico,String avaliacao,Gato cat){
        
        System.out.println("\n\t"+cat.imprimirFicha());
        System.out.println("Condições do "+cat.getNomeGato()+ avaliacao);
        System.out.println("A consulta irá custar:\t"+this.valor);
    }
}
