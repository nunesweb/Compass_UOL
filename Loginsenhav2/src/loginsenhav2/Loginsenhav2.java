/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginsenhav2;

/**
 *
 * @author Sergio Ferr
 */
import java.time.LocalTime;
import java.util.Scanner;
import java.util.ArrayList;

public class Loginsenhav2 {

    public static void main(String[] args) {
        /* chamar o metodo Scanner 
        modificando seu nome de chamada dentro do codigo */
        Scanner in = new Scanner(System.in);
        /* Declaração do metodo  import java.util.Arraylit; é feita da seguinte forma:
        * ArrayList<nome da sua classe> novo nome para chamar no script do seu código = new ArrayList<nome da sua classe>();
         */
        ArrayList<Usuarioesenhav2> usuarioesenha = new ArrayList<Usuarioesenhav2>();

        /*Criação de usuario no modelo de contrutor SEM paramentro definido na classe. 
        *Onde é necessario pra esse caso setar o usuario e setar a senha individualmente e 
        *depois mais uma linha de codigo para adicionar o usuario 
         */
        Usuarioesenhav2 usuariosenha2 = new Usuarioesenhav2();
        usuariosenha2.setUsuario("modelo1");
        usuariosenha2.setSenha("sergio01");
        usuarioesenha.add(usuariosenha2);
        
        usuariosenha2.setUsuario("carlos");
        usuariosenha2.setSenha("pai01");
        usuarioesenha.add(usuariosenha2);
        
        usuariosenha2.setUsuario("manuelle");
        usuariosenha2.setSenha("manu01");
        usuarioesenha.add(usuariosenha2);
               
        /*Linha de inserção de entrada do usuario do sistema:
         */
        System.out.println("login> ");
        String login = in.nextLine();
        /*Linha de inserção de entrada de senha do usuario:
         */
        System.out.println("senha> ");
        String senha = in.nextLine();

        /*Linhas de condição do que usuario inputar na entrada do sistema:
         */
        for (int i = 0; i < usuarioesenha.size(); i++) {
            if ((usuarioesenha.get(i).getUsuario().equals(login)) && (usuarioesenha.get(i).getSenha().equals(senha))) {
                System.out.printf("Usuário %s logado com sucesso!", login);
                UsuarioMsg();
                
                /*Break será usado para iterromper o loop  da condicao 
        *se for digitado corretamente*/
                break;

            } else {
                System.out.println("Usuario e/ou Senha incorretos!");

                /*Break usado para iterromper o loop  da condicao 
        * se se o usuario ou senha forem incorretos*/
                break;

            }
        }

    }

    /*Condição para apresentar a mensagem de hora 
    * em que o usuario realizou o login
     */
    public static void UsuarioMsg() {
        LocalTime horaatual = LocalTime.now();
        if (horaatual.isBefore(LocalTime.of(6, 0, 0))) {
            System.out.println(" Boa madurgada, você se logou ao nosso sistema.");
        } else if (horaatual.isBefore(LocalTime.of(12, 0, 0))) {
            System.out.println(" Bom dia, você se logou ao nosso sistema.");
        } else if (horaatual.isBefore(LocalTime.of(18, 0, 0))) {
            System.out.println(" Boa tarde, você se logou ao nosso sistema.");
        } else {
            System.out.println(" Boa noite, você se logou ao nosso sistema.");
        }

    }
}
