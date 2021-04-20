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
public class Cavalo extends Animal{
    Cavalo(String n, int id) {
    }
    public void Cavalo(String nome, int idade){
        super.setNome(nome);
        super.setIdade(idade);
    }
    @Override
    public void seLocomove(){
        System.out.println("Cavalo: "+super.getNome());
        System.out.println("Idade: "+super.getIdade());
        System.out.println("Cavalga, Marcha, Trota");
    }
    @Override
    public void emiteSom(){
        System.out.println("Nhiiiiiiiiiiii rir iririri rin !!");
    }
}
