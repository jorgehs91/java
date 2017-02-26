/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author Alunos
 */
public class Professor {
    public String nome;
	private Scanner scanner;
    
    public void fazerChamada(Aluno lista[]){    	    	  	
    			
        System.out.println("Boa noite!");
        System.out.println("Vou fazer a chamada, prestem atenção!");
       
        Relatorio chamada = new Relatorio();
        
        for (int i=0;i<lista.length;i++){                        
            System.out.println("Aluno "+lista[i].nome+" presente?");
            	scanner = new Scanner(System.in);            	
            	String resposta;               	
            	
            	resposta = scanner.nextLine();             	     
            	
            if(resposta.startsWith("s")){
            	chamada.nArray[i] = i+"\t"+lista[i].nome+"\tPresente";            	
            }
            
            if(resposta.startsWith("n")){
            	chamada.nArray[i] = i+"\t"+lista[i].nome+"\tAusente";
            }  
           
        }
        chamada.gerarData();
        chamada.gerarLista(); 
    }
}

