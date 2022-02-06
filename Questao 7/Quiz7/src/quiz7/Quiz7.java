/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz7;

import java.util.ArrayList;
/**
 *
 * @author Sergio Ferr
 */
import java.util.Scanner;

public class Quiz7 {

    public static void main(String[] args) {
        String pessoa;
        int acertou = 0;
        int errou = 0;
        Scanner scn = new Scanner(System.in);
        ArrayList<CertoErrado> questao = new ArrayList();

        questao.add(new CertoErrado("Qual o resultado da média do aluno que tirou nota 6 na prova 1, nota 5 na prova 2 e 7 na prova 3?", "6"));
        questao.add(new CertoErrado("Em que ano teve inicio a primeira guerra mundial?", "1914"));
        questao.add(new CertoErrado("Qual ano da copa em que o Brasil foi tetra campeão?", "1994"));
        questao.add(new CertoErrado("Qual nome do presidente do Brasil em 2017?","Michel Temer"));
        questao.add(new CertoErrado("Qual nome da capital da China?", "Pequim"));
        questao.add(new CertoErrado("Qual ano finalizou a segunda Guerra mundial?", "1945"));
        questao.add(new CertoErrado("Qual é a maior ave do mundo?","Avestruz"));
        questao.add(new CertoErrado("Qual nome do aeroporto Internacional de Belo Horizonte?" ,"Confins"));
        questao.add(new CertoErrado("Em que ano foi criada a primeira versão do Windows?","1985"));
        questao.add(new CertoErrado("Comando GIT que inicializa um novo repositório na pasta . ","git init"));
        
        /*ArrayList.shuffle((List<String>) questao);*/

        System.out.println("Qual o seu nome? ");
        pessoa = scn.nextLine();

        for (int i = 0; i < questao.size(); i++) {
            System.out.println(questao.get(i).getPergunta());
            String responda = scn.nextLine();
            
            if (responda.equalsIgnoreCase(questao.get(i).getResponda())) {
                System.out.println("Parabéns! Resposta certa!");
                acertou++;
            } else {
                System.out.println("Não foi desta vez. Você errou.");
                errou++;
            }
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        }
        System.out.println("Hey, " + pessoa + "! Está aquio seu placar do Quiz:");
        System.out.println("Jogador: " + pessoa);
        System.out.println("Total de acertos: " + acertou);
        System.out.println("Total de erros: " + errou);

    }
}
