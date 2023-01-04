import javax.swing.*;

public class Exercicio_Fixacao_2 {
    public static void main(String[] args) {
        int diasSemana = 7;
        float[] temperaturas = new float [diasSemana];
        float soma = 0f, media;
        String num;
        try{
            for (int i = 0; i < diasSemana; i++) {
                int dia = i+1;
                num = JOptionPane.showInputDialog(
                        "Temperatura do dia " + dia + ":"
                );
                temperaturas[i] = Float.parseFloat(num);
                soma = soma + temperaturas[i];
            }
            media = soma / diasSemana;
            System.out.println("Média das temperaturas da semana: " + media + "°C");
            //System.out.println("");
            System.out.println("Dias com temperatura acima da média:");
            for (int i = 0; i < diasSemana; i++) {
                int dia = i+1;
                if (temperaturas[i] > media) {
                    System.out.println("Dia " + dia + " | " + temperaturas[i] + "°C");
                }
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null, "Erro!"
            );
        }
    }
}
