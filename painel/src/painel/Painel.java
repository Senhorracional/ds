/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package painel;
import javax.swing.JOptionPane;
/**
 *
 * @author CAMARGO
 */
public class Painel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean resposta;
        Acesso a = new Acesso();
        a.setUsuario(JOptionPane.showInputDialog("Digite o nome do usuário: "));
        a.setSenha(JOptionPane.showInputDialog("Insira a senha do usuário informado: "));
        resposta = a.validarSenha();
        if(resposta==true){
            JOptionPane.showMessageDialog(null, "Usuário " +a.getUsuario()+", conectado com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Senha incorreta");
        }
        
    }
    
}
