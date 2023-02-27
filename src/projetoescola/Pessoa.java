/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoescola;

/**
 * As classes abstratas não podem ser instanciadas porém, seus atributos e metodos podem ser 
 * implementados pelas sua classes filhas e netas.
 * Ela também é conhecida como classe raiz. Ela Recebe esse nome por ser a classe
 * que da sustentação a uma arvore hierarquica.
 */
public abstract class Pessoa {
    //Atributos da class
    protected String nome;
    protected int idade;
    protected String sexo;
    
    //Metodo fazer anoversario
    public final void FazerAniversario(){
       this.setIdade(this.getIdade() + 1);
    }
    
    //Metodos especiais 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //toString

    @Override
    public String toString() {
        return "Dados{" + "nome = " + nome + ", idade = " + idade + ", sexo = " + sexo + '}';
    }
    
 
}
