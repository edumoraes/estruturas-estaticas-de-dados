import javax.swing.*;

public class Exemplo_6_7 {
    public static void main(String[] args) {
        final int nProvas = 3;
        final int nAlunos = 10;
        float[][] notaProva = new float[nAlunos][nProvas];
        float[] medAlunos = new float[nAlunos];
        float[] medProvas = new float[nProvas];
        float soma;
        String num;
        try{
            for(int i = 0; i < nAlunos; i++) {
               soma = 0;
               for(int j = 0; j < nProvas; j++) {
                   num = JOptionPane.showInputDialog(
                           null, "Entre nota Aluno-" + i + " Prova-" + j
                   );
                   notaProva[i][j] = Float.parseFloat(num);
                   soma = soma + notaProva[i][j];
               }
               medAlunos[i] = soma / nProvas;
            }
            for(int j = 0; j < nProvas; j++) {
                soma = 0;
                for (int i = 0; i < nAlunos; i++) {
                    soma = soma + notaProva[i][j];
                }
                medProvas[j] = soma / nAlunos;
            }
            for(int i = 0; i < nAlunos; i++) {
                JOptionPane.showMessageDialog(
                        null, "Media do Aluno-" + i + ": " + medAlunos[i]
                );
            }
            for(int i = 0; i < nProvas; i++) {
                JOptionPane.showMessageDialog(
                        null, "Media da Prova-" + i + ": " + medProvas[i]
                );
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(
                    null, "Ocorreu um erro durante a leitura!"
            );
        }
    }
}
