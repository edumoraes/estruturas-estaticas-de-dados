import javax.swing.*;

public class Exercicio_Fixacao_7 {
    public static void main(String[] args) {
        final int DIAS_SEMANA = 7;
        float[] temperaturas = new float[DIAS_SEMANA];
        String num;
        try {
            for (int i = 0; i < DIAS_SEMANA; i++) {
                int dia = i+1;
                num = JOptionPane.showInputDialog(
                        "Digite a temperatura do dia " + dia
                );
                temperaturas[i] = Float.parseFloat(num);
                for (int j = 0; j < temperaturas[i]; j++) {
                    System.out.printf("■ ");
                }
                System.out.printf("\n");
            }

        }catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null, "Erro!"
            );
        }

    }

}
