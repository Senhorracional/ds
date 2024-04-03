package condicional;

import javax.swing.JOptionPane;
public class nota {
    public static void main(String[] args) {
        String mencao =  JOptionPane.showInputDialog("Insira a mencao do aluno:");
        if (mencao.equals("A") || mencao.equals("B") || mencao.equals("C")){
            JOptionPane.showMessageDialog(null, "Promovido");
            System.exit(0);
        }
        else if(mencao.equals("D") ||  mencao.equals("E")){
            JOptionPane.showMessageDialog(null, "Retido");
            System.exit(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Avaliação Inválida");
            System.exit(0);
        }
    }
}
