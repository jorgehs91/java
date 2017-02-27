/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applivraria;

/**
 *
 * @author Alunos
 */
public class AppLivraria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();
        
        livro1.autor    = "Marcela";
        livro1.titulo   = "Java";
        livro1.ano      = 2014;
        
        livro2.autor    = "Wade";
        livro2.titulo   = "Sempre chega atrasado";
        livro2.ano      = 2017;
        
        livro3.autor    = "Wade";
        livro3.titulo   = "Sempre chega atrasado";
        livro3.ano      = 2017;
        
        livro1.emprestar("Maria");
        livro1.devolver();
        livro1.emprestar("Joao");
        
        livro1.info();        
    }
    
}
