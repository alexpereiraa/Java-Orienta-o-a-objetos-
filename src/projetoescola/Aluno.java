/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoescola;

/**
 * A herança abaixo  é conhecida como herança pra diferença. 
 * Ela tem esse nome, pois além de herdar atributos e metodos da sua superClass
 * ela ainda tem seus proprios metodos e atributos.
 * 
 * Podemos dezer tambem que, a classe Aluno é uma especialização da classe Pessoa
 * e que a classe Pessoa é uma generalização de Aluno.
 */
public abstract class Aluno extends Pessoa{
    private String curso;
    private int matricula;
    private float mensalidade;
  
    //Metodos especiais
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }
    
    //Metodos complementares
    protected final void cancelarMatricula(){
       if(this.getMensalidade() == 500){
           System.out.println("Matricula cancelada");
       }else{
           System.out.println("Impossivel cancelarta a matricula");
       }
    }
    
    //Metodo pagar mensalidade
    public void pagarMensal(float mensal){
        this.mensalidade = mensal;
    if(this.getMensalidade() == 500){
            System.out.println("Mensalidade paga no valor de " + this.getMensalidade() + "R$ \n"
                    + "Nome do aluno: " + this.getNome());
        }else if(this.getMensalidade() < 500){
          float valorAmenos = 500f - this.getMensalidade();
            System.out.println("[ERRO] faltam " + valorAmenos + "R$" + " para completar o pagamento"); 
        }else if(this.getMensalidade() > 500){
            float valorAmais = this.getMensalidade() - 500;
            System.out.println("Voce deposutou " + valorAmais + " R$ a mais" );
        }
    }
    
}
