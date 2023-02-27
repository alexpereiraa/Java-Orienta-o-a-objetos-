/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoescola;

/**
 *
 * @author robso
 */
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    //Metodos especiais 
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    //Metodo complementar
    public void receberAlmentot(float aum){
        this.salario += aum;
    }
}
