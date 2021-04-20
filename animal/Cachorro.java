/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author diven
 */
public class Cachorro extends Animal{

    Cachorro(String n, int id) {
        
    }
    public void cachorro(String nome, int idade){
        super.setNome(nome);
        super.setIdade(idade);
    }
    @Override
    public void seLocomove(){
        System.out.println("cachorro: " +super.getNome());
        System.out.println("Idade: "+super.getIdade());
        System.out.println("Cachorro correndo, com suas 4 patas ");
    }
    @Override
    public void emiteSom(){
        System.out.println("Au Au !!");
    }
}
