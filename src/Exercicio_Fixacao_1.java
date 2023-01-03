import javax.swing.*;

public class Exercicio_Fixacao_1 {
    public static void main(String[] args) {
        int[] w = new int[9];
        int i = 5;

        w[1] = 17;
        w[i/2] = 9; //Posição [2]
        //w[2 * i - 1] = 95; //Out of bounds
        //w[i-1] = w[9] / 2; //Out of bounds
        w[i] = w[2];
        w[i+1] = w[i] + w[i-1];
        w[w[2]-2] = 78;
        w[w[i]-1] = w[1] * w[i];
        //w[w[2]%2+2] = w[i+9/2] + 3 * w[i-1*2]; //Out of bounds

        try {
            for (int j = 0; j < 9; j++) {
                System.out.println("Posição [" + j + "] " + w[j]);
            }
        }catch (Exception e) {
            JOptionPane.showInputDialog(
                    null, "Erro!"
            );
        }
    }
}
