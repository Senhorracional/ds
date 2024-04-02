/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastro;

import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */

public class Cadastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String nome;
        String idade;
        String rg;
        String cpf;
        String celular;
        String email;
        String endereco;
        String cidade;
        String estado;
        String cep;
        
        System.out.print("Nome: ");
        nome = input.nextLine();
        
        System.out.print("Idade: ");
        idade = input.nextLine();
        
        System.out.print("RG: ");
        rg = input.nextLine();
        
        System.out.print("CPF: ");
        cpf = input.nextLine();
        
        System.out.print("Celular: ");
        celular = input.nextLine();
        
        System.out.print("E-mail: ");
        email = input.nextLine();
        
        System.out.print("Endereço: ");
        endereco = input.nextLine();
        
        System.out.print("Cidade: ");
        cidade = input.nextLine();
        
        System.out.print("Estado: ");
        estado = input.nextLine();
        
        System.out.print("CEP: ");
        cep = input.nextLine();
        
    }
    
}
