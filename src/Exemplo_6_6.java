import javax.swing.*;

public class Exemplo_6_6 {
    public static void main(String[] args) {
        int[][] G = new int[6][2];
        double prod;
        String num;
        try{
            for(int i = 0; i < 6; i++) {
                for(int j = 0; j < 2; j++) {
                    num = JOptionPane.showInputDialog(
                            "Informar valor G " + i + ", " + j + ":");
                    G[i][j] = Integer.parseInt(num);
                }
            }
            for(int i = 0; i < 6; i++) {
                prod = 1;
                for(int j = 0; j < 2; j++) {
                    prod = prod * G[i][j];
                }
                JOptionPane.showMessageDialog(
                        null, "Linha " + i + ": " + Math.sqrt(prod));
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(
                    null, "Ocorreu um erro durante a leitura!"
            );
        }
    }
}
