/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz2;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class Matriz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random matRandom=new Random();
        int[][] matriz=new int[4][4];
        int l,c,soma,produto,maiorV;
        soma=0;
        produto=1;
        maiorV=0;
        for(l=0;l<matriz.length;l++){
            for(c=0;c<matriz[l].length;c++){
                matriz[l][c]=matRandom.nextInt(9);
            }
        }
            for(l=0;l<matriz.length;l++){
            for(c=0;c<matriz[l].length;c++){
            
            
            
            if(l==c){
                soma=soma+matriz[l][c];
                
            }
            if(l==1){
                produto=produto*matriz[l][c];
            }
            if(matriz[l][3]>maiorV){
                maiorV=matriz[l][2];
            }
        }
            }
         for(l=0;l<matriz.length;l++){
            for(c=0;c<matriz[l].length;c++){
                System.out.print(matriz[l][c]+" ");
              
            }
             System.out.println();
         }
        System.out.println("A soma da diagonal é: "+soma);
        System.out.println("O produto da 2° linha é: "+produto);
        System.out.println("O maior valor da 3° coluna é: "+maiorV);
        
    }
    
}
 

