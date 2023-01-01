import javax.swing.*;

public class Exemplo_6_2 {
    public static void main(String[] args) {
        String vetor = JOptionPane.showInputDialog(
                "informe o tamanho do vetor"
        );
        int tamanhoVetor = Integer.parseInt(vetor);
        int[] teste1 = new int[tamanhoVetor];
        int[] teste2 = new int[tamanhoVetor];
        String num;
        try{

            for(int i = 0; i < tamanhoVetor; i++) {
                num = JOptionPane.showInputDialog(
                        "Digite o valor " + i + ":");
                teste1[i] = Integer.parseInt(num);
            }
            for(int i = 0; i < tamanhoVetor; i++) {
                if(i % 2 == 0)
                    teste2[i] = teste1[i] * 5;
                else
                    teste2[i] = teste1[i] + 5;
            }
            System.out.printf("%s/n", "Resultado:");
            for(int i = 0; i < tamanhoVetor; i++) {
                System.out.printf("%s%d%s%d",
                        "teste1[", i, "]= ", teste1[i]);
                System.out.printf("%10s%d%s%d\n",
                        "teste2[", i, "]= ", teste2[i]);
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(
                    null, "Ocorreu um erro durante a leitura!");
        }
    }
}