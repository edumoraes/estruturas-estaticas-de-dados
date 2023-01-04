import javax.swing.*;

public class Exercicio_Fixacao_6 {
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
        float maxima = temperatura[0];
        float minima = temperatura[0];
        for(int i = 0; i < diasSemana; i++) {
            if(temperatura[i] < minima) {
                minima = temperatura[i];
            } if (temperatura[i] > maxima) {
                maxima = temperatura[i];
            }
        }
        JOptionPane.showMessageDialog(
                null, "Mínima da semana = " + minima);
        JOptionPane.showMessageDialog(
                null, "Máxima da semana = " + maxima);
    }
}
