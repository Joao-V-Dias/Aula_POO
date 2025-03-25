/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaheranca;

/**
 *
 * @author IFTM
 */
public class Principal {
    public static void main(String[] args) {
        Funcionario maria = new Funcionario();
        maria.setNome("Maria");
        maria.setSobrenome("Silva");
        maria.setSalario(700.50);
        System.out.println("Funcionario: " + maria.getNome() + " " 
            + maria.getSobrenome() + "\n" + "Salario: R$ " 
            + maria.getSalario());
        
        FuncionarioComissionado marcelo = new FuncionarioComissionado();
        marcelo.setNome("Marcelo");
        marcelo.setSobrenome("Santos");
        marcelo.setSalario(700);
        marcelo.setComissao(20);
        marcelo.setVendas(10);
        String mostrar = "Funcionario: " + marcelo.getNome() + " "
            + marcelo.getSobrenome() + "\n" + "Salario fixo: R$ "
            + marcelo.getSalario();
        
        System.out.println("*********************************");
        System.out.println(mostrar + "\n" + "Comissao: R$ " + marcelo.getComissao()
            + "\n" + "Qtde vendas: " + marcelo.getVendas());
        
        System.out.println("*********************************");
        System.out.println("Adiciona 3");
        marcelo.acrescentarVendas(3);
        System.out.println(mostrar + "\n" + "Comissao: R$ " + marcelo.getComissao()
            + "\n" + "Qtde vendas: " + marcelo.getVendas());
        
        System.out.println("*********************************");
        System.out.println("Adiciona 3");
        marcelo.zerarVendas();
        System.out.println(mostrar + "\n" + "Comissao: R$ " + marcelo.getComissao()
            + "\n" + "Qtde vendas: " + marcelo.getVendas());
    }
    
}
