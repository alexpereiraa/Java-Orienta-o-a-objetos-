/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoescola;

/**
 *
 * @author robso
 */
public final class AlunoBolsista extends Aluno{
    //Attibutos
    private float balsa;
    
    //Metodos especiais 
    public float getBalsa() {
        return balsa;
    }

    public void setBalsa(float balsa) {
        this.balsa = balsa;
    }
    
    //Metodos complementares
    public void renovaBolsa(){
        if(this.getBalsa()== 350){
            System.out.println("Bolsa renovada!");
        }else{
            System.out.println("Impossivel renovar bolsa");
        }
    }
    
    //Metodo sobreposto da class aluno
    /** Na POO a sobreposição de metodo faz com que, um mesmo metodo possa ser implementados de diferentes formas. 
     * Por isso, recebe o nome de metodo polimorfo.
     * @param mensal 
     */
    @Override
    public void pagarMensal(float mensal) {
        this.balsa = mensal;
        if(this.getBalsa() == 350){
            System.out.println("Mensalidade paga no valor de " + this.getBalsa() + " R$");
        }else if(this.getBalsa() < 350){
            float valorAmenos = 350 - this.getBalsa();
            System.out.println("[ERRO] faltam " + valorAmenos + "R$" + " para completar o pagamento");
        } else if(this.getBalsa() > 350){
            float valorAmais = this.getMensalidade() - 350;
            System.out.println("Voce deposutou " + valorAmais + " R$ a mais" );
        }
    }
    
}
