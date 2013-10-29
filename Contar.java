/* */
package contar;

import java.util.Scanner;

public class Contar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String frase;
        String subcadena;
     // String[] lletres = {"abcdefghijklmnñopqrstuvwxyz"};
        int[] solucio = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
      
        System.out.println("Introdueix la frase: ");
        frase = lector.nextLine();
        

	//Comentari en el projecte1
        for (int i = 0; i < frase.length();i++) {
            subcadena = frase.substring(i, i+1);
            switch (subcadena) {
                case "a":
                    solucio[0]++;
                    break;
                case "b":
                    solucio[1]++;
                    break;
                case "c":
                    solucio[2]++;
                    break;
                case "d":
                    solucio[3]++;
                    break;
                case "e":
                    solucio[4]++;
                    break;
                case "f":
                    solucio[5]++;
                    break;   
                case "g":
                    solucio[6]++;
                    break;   
                case "h":
                    solucio[7]++;
                    break;   
                case "i":
                    solucio[8]++;
                    break;  
                case "j":
                    solucio[9]++;
                    break;        
                case "k":
                    solucio[10]++;
                    break;         
                case "l":
                    solucio[11]++;
                    break;       
                case "m":
                    solucio[12]++;
                    break;        
                case "n":
                    solucio[13]++;
                    break;       
                case "ñ":
                    solucio[14]++;
                    break;      
                case "o":
                    solucio[15]++;
                    break;      
                case "p":
                    solucio[16]++;
                    break;     
                case "q":
                    solucio[17]++;
                    break;        
                case "r":
                    solucio[18]++;
                    break;               
                case "s":
                    solucio[19]++;
                    break;    
                case "t":
                    solucio[20]++;
                    break;      
                case "u":
                    solucio[21]++;
                    break;      
                case "v":
                    solucio[22]++;
                    break;     
                case "w":
                    solucio[23]++;
                    break;        
                case "x":
                    solucio[24]++;
                    break;               
                case "y":
                    solucio[25]++;
                    break;    
                case "z":
                    solucio[26]++;
                    break;                        
            }
        }
        
        for (int i = 0; i <=26;i++) {
            if (solucio[i] != 0) {
                System.out.println(solucio[i]);
            }
        }   
    }
}