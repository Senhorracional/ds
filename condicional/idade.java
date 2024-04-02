package condicional;

import javax.swing.JOptionPane;
public class idade {
    public static void main(String[] args) {
        int num;
        String idade = JOptionPane.showInputDialog(null, "Digite a sua idade:");
        num = Integer.parseInt(idade);

        if(num < 18){
            JOptionPane.showMessageDialog(null, "Não Permitido");;
        }else{
          JOptionPane.showMessageDialog(null, "Permitido");
        }
    }
}
