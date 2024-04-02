/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package conta;
/**
 *
 * @author CAMARGO
 */
import java.util.Scanner; //programa utiliza a classe Scanner

public class Conta {

    /**
     * @param args the command line arguments
     */
    //método principal inicia o aplicativo Java
    public static void main(String[] args) {
        // TODO code application logic here
        //Cria um Scanner para obter entrada da janela de comando
        Scanner input = new Scanner(System.in);
        
        int num1;
        int num2;
        int sum;
        
        System.out.println("Insira o primeiro número:");
        num1 = input.nextInt();
        
        System.out.println("Insira o segundo número");
        num2 = input.nextInt();
        
        sum = num1 + num2;
        
        System.out.println("O resultado da soma é: " + sum);
    }
    
}
