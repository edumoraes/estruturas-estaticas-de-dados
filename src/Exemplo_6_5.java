import javax.swing.*;

public class Exemplo_6_5 {
    public static void main(String[] args) {
        final int diasSemana = 7;
        float[] temperatura = new float[diasSemana];
        temperatura[0] = 19.0f;
        temperatura[1] = 23.0f;
        temperatura[2] = 21.0f;
        temperatura[3] = 25.0f;
        temperatura[4] = 22.0f;
        temperatura[5] = 20.0f;
        temperatura[6] = 24.0f;
        float x;
        for(int i = 0; i < diasSemana; i++) {
            for(int j = i + 1; j < diasSemana; j++) {
                if(temperatura[j] < temperatura[i]) {
                    x = temperatura[i];
                    temperatura[i] = temperatura[j];
                    temperatura[j] = x;
                }
            }
        }
        JOptionPane.showMessageDialog(
                null, "Mínima da semana = " + temperatura[0]);
        JOptionPane.showMessageDialog(
                null, "Máxima da semana = " + temperatura[6]);
    }
}
