package condicional;

import javax.swing.JOptionPane;
public class aceito{
    public static void main(String[] args) {
        String sexo = JOptionPane.showInputDialog(null, "Masculino (M) e Feminino (F):");
        String altura = JOptionPane.showInputDialog(null, "Digite a sua altura:");
        String peso = JOptionPane.showInputDialog(null, "Digite o seu peso:");
        double altura1 = Double.parseDouble(altura);
        double peso1 = Double.parseDouble(peso);

        if(sexo.equals("M") && altura1 >= 1.80 && peso1 >= 75.0){
            JOptionPane.showMessageDialog(null, "Aceito");
            System.exit(0);
        }else{
            JOptionPane.showMessageDialog(null, "Não Aceito");
            System.exit(0);
        }
    }    
}