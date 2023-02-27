/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoescola;

/**Na POO, as classe denominadas como Final 
 * Não podem ter filhas instanciadas apartir delas.
 * Por serem as utimas classes de uma arvore de herança,  as elas são conhecidas como  classes folhas.
 * @author robso
 */

public final class  Tecnico extends Aluno { 
    protected String rgtProfissional;
    
    //Getrs and Setrs
    public String getRgtProfissional() {
        return rgtProfissional;
    }

    public void setRgtProfissional(String rgtProfissional) {
        this.rgtProfissional = rgtProfissional;
    }
    
    //Metodo adicional 
    public void praticar(){
        System.out.println("Registro Porofissional " + this.getRgtProfissional() + " liberado");
    }
    
}
