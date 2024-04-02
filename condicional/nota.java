package condicional;

import javax.swing.JOptionPane;
public class nota {
    public static void main(String[] args) {
        String nota =  JOptionPane.showInputDialog(null, "Insira a nota do aluno:");
        if (nota == "A" || nota == "B" ||  nota == "C"){
            JOptionPane.showMessageDialog(null, "Promovido");
            System.exit(0);
        }else if(nota == "D" ||  nota == "E"){
            JOptionPane.showMessageDialog(null, "Retido");
            System.exit(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Avaliação Inválida");
            System.exit(0);
        }
    }
}
