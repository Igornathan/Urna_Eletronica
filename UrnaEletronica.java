/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author senai
 */
public class UrnaEletronica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // A urna eletronica apresenta tres possiveis candidatos
        // Com um numero correspondendoa cada candidato
        
        //VARIAVEIS
            final int Igor = 1;
            final int Moacir = 2;
            final int Eduardo = 3;
             
            int VotoIgor = 0;
            int VotoMoacir = 0;
            int VotoEduardo = 0;
            
            Scanner scanner = new Scanner(System.in);
            
        //FINAL DAS VARIAVEIS
        
        
        //O programa apresenta um campo de entrada de dados para
        // que digite a escolha do seu candidato
        //Após, deve solicitar um novo voto
        int voto = 0;
        do{    
             System.out.print("========ELEIÇÕES 2023============\nA urna apresenta 3 candidados a serem eleitos.\n Igor = 1\n Moacir = 2 \n Eduardo = 3\n Digite o número referente ao candidato que você deseja.");
  
            voto = scanner.nextInt();
        //Ao digitar o numero escolhido, o programa ira somar um
        //voto para o candidato escolhido pelo usuario     
            
                if(voto == 1){
        //  o prograama deve exibir ao usuario uma mensagem que o voto foi 
        //computado com sucesso    
                    System.out.println("Voce votou no Igor. Confirma?S/N?");
                    String confirma = scanner.next();
                    if(confirma.equals("S")){
                        VotoIgor++;
                        System.out.println("Você votou no Igor, parabéns.");
                    }
                }else if(voto == 2){
                    System.out.println("Voce votou no Moacir. Confirma?S/N?");
                    String confirma = scanner.next();
                    if(confirma.equals("S")){
                        VotoMoacir++;
                        System.out.println("Você votou no Moacir, parabéns.");
                    }
                }else if(voto == 3){
                    VotoEduardo++;
                    System.out.println("Voce votou no Eduardo. Confirma?S/N?");
                    String confirma = scanner.next();
                    if(confirma.equals("S")){
                        VotoEduardo++;
                        System.out.println("Você votou no Eduardo, parabéns.");
                    }
                }else if(voto!=00000){
        //Quando o mesário digitar a senha secreta, o programa 
        //irá para de disponibilizar votos
                    System.out.println("Este numero é inválido");
                }else{        
        //Logo após parar de disponibilizar votos, o programa deve exibir
        //a quantidade de votos para cada candidato
                    System.out.println("A votação foi encerrada");
                    System.out.println("=====Votos=====\n O Igor teve "+VotoIgor+" votos \n O Moacir teve "+VotoMoacir+" votos \n O Eduardo teve "+VotoEduardo+" votos");
                }
                
            
        }while(voto!=00000);
                      
    }
    
}

