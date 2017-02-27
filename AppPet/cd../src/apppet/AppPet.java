/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppet;

import java.util.Scanner;

/**
 *
 * @author Alunos
 */
public class AppPet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
       /* 
        Cachorro dog = new Cachorro("Vira-Lata","Jorge");
        dog.cor = "Rosa";
        dog.idade = 1;
        dog.morde = false;        
        
        dog.morder();
        System.out.println(dog.imprimirFicha());
        */
        Gato cat = new Gato();
        
        String nomeGato = teclado.next();
        
        cat.setNome(nomeGato);
     //   cat.idade = 4;
       // cat.morde = false;
        //cat.nomeDono = "Jorge";
        //cat.raca = "Vira-Lata";
       // System.out.println(cat.getNomeGato());
        cat.alteraDieta("Arroz");
       // System.out.println(cat.imprimirFicha());
        
        /*
        Coelho coelho = new Coelho();
        coelho.cor = "Branco";
        coelho.idade = 2;
        coelho.morde = false;
        coelho.nomeDono = "Jorge";
        coelho.raca = "Vira-Lata";
                
        System.out.println(coelho.imprimirFicha());
        */
        
        Clinica cli = new Clinica(199.99);
        cli.fazerConsulta("Doutor","Saudável", cat);        
    }
    
}
