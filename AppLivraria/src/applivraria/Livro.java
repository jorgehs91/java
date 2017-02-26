/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applivraria;

import java.util.Date;

/**
 *
 * @author Alunos
 */
public class Livro {    
//Atributos    
    String titulo;
    String autor;
    int ano;
    boolean estado = true;
    Date devolucao;
    String usuario;
//Métodos
    boolean emprestar(String usr){
        if (this.estado){
            this.estado = false;
            this.usuario = usr;
            System.out.println("Livro emprestado para "+this.usuario+" com sucesso");
        }else {
            System.out.println("Livro já emprestado para "+this.usuario);
            return false;
        }
        return true;        
    }
    boolean devolver(){
        this.estado = true;
        this.usuario = "";
        System.out.println("Livro devolvido!");
        return true;
    }
    
    void info(){
        System.out.println("O título deste livro é: "+this.titulo+", o autor é: "+this.autor+". Lançado no ano de "+this.ano+".\n");
        
    }
    
}
