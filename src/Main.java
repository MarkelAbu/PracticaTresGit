import javax.swing.*;

public class Main {
    public static void main(String[] args) {
Random random = new Random();
numero = random.nextInt(100)+1;

adivinarNum();

JOptionPane.showMessageDialog(null, "ZORIONAK " + numero + " es correcto");
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
