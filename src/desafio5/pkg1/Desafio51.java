package desafio5.pkg1;
import javax.swing.JOptionPane;
/**
 *
 * @author troll
 */
public class Desafio51 {
    public static void main(String[] args) {
        int ano;
        double chico, ze;
        
        chico = 1.50;
        ze = 1.10;
        ano = 0;
        while (chico > ze) {
            chico += 0.02;
            ze += 0.03;
            ano += 1;
        }
        JOptionPane.showMessageDialog(null, "Levou "+ano+" anos, para Zé ser maior que Chico.");
    }
}
