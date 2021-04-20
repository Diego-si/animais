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
public class Preguica extends Animal{
    Preguica(String n, int id) {
    }
    public void Preguica(String nome, int idade){
        super.setNome(nome);
        super.setIdade(idade);
    }
    @Override
    public void seLocomove(){
        System.out.println("Bicho Preguiça: "+super.getNome());
        System.out.println("Idade: "+super.getIdade());
        System.out.println("Subindo na Árvore");
    }
    @Override
    public void emiteSom(){
        System.out.println("Grrrrrrrrrrr");
    }
}
