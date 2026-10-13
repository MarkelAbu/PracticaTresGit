import javax.swing.*;

public class Main {
    public static void main(String[] args) {

    }

    public static int adivinarNum(){
        do {
            predi = Integer.parseInt(JOptionPane.showInputDialog("Numero?"));
            if (predi > numero){
                JOptionPane.showMessageDialog(null,"Pista! Es MAS PEQUEÑO");
            } else if (predi < numero){
                JOptionPane.showMessageDialog(null,"Pista! Es MAS GRANDE");
            }
        }
        while (numero != predi);
        return 0;
    }
}
