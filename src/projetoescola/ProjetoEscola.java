/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoescola;

/**
 *
 * @author robso
 */
public class ProjetoEscola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Visitante v1 = new Visitante();
        v1.setNome("Alex Pereira");
        v1.setIdade(32);
        v1.setSexo("Masculino");
        System.out.println(v1.toString()); */
        
        Aluno a1 = new Aluno() {};
        a1.setNome("Roson Scarmagnani");
        a1.setIdade(29);
        a1.setSexo("Masculino");
        a1.setCurso("Engenharia Elétrica");
        a1.setMatricula(125486);
        System.out.println(a1.toString());
        
        System.out.println("\n");
        
        AlunoBolsista b1 = new AlunoBolsista();
        b1.setNome("Pedro Marques");
        b1.setIdade(35);
        b1.setSexo("Msculino");
        b1.setCurso("Analise de sistemas");
        b1.setMatricula(45458);
        System.out.println(b1.toString());
        
        System.out.println("\n");
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Alex Pereira");
        t1.setIdade(30);
        t1.setSexo("Masculino");
        t1.setRgtProfissional("GRP452");
        t1.praticar();
        System.out.println(t1.toString());
        
        

    }
    
}
