/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionarioq9;

/**
 *
 * @author Sergio Ferr
 */
import java.util.Scanner;

public class FuncionarioQ9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner scn = new Scanner(System.in);
       int qtFuncionario = 0;
        System.out.println("Quantos funcionários há na sua empresa?");
        qtFuncionario = scn.nextInt();
       Lfuncionarios[] lfuncionarios = new Lfuncionarios[qtFuncionario];
       
       //Determina a quantidades de funcionarios a serem analisados
        for (int cont = 0; cont < qtFuncionario; cont++) {
            scn.nextLine();
            System.out.print("Digite o nome do " + (cont + 1)+ "° funcionário: ");
            String func = scn.nextLine();
            /*nomes.add(func);*/
            System.out.print("Digite o salario " + (cont + 1)+ "° do funcionário: ");
            double salario = scn.nextDouble();
            lfuncionarios[cont]= new Lfuncionarios(func, salario);

        }
       
        //imprime a lista de funcionarios
        for (Lfuncionarios funciona : lfuncionarios){
            System.out.println();
            if (funciona.getBoni() <0){
                System.out.printf("Funcionário %s %nSalário: %.2f %nDesconto: %.2f %nSalário Liquido: %.2f%n", funciona.getFunc(), funciona.getSalario(), funciona.getBoni(), funciona.getSalLiquido());
            }else{
                System.out.printf("Funcionário %s %nSalário: %.2f %nBonus: %.2f %nSalário Liquido: %.2f%n", funciona.getFunc(), funciona.getSalario(), funciona.getBoni(), funciona.getSalLiquido());
            }
        }
        
    }
    
}
