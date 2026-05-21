import java.util.Arrays;
import java.util.Scanner;

public class Uni6Exe07 {
 /*
     * Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base
     * neste valor, crie um vetor do tipo inteiro.
     * 
     * Em seguida, solicite ao usuário
     * para digitar um número inteiro várias vezes, até preencher o vetor.
     * Esse
     * número deverá ser armazenado no vetor caso ainda não exista, e se o valor já
     * existir deve ser pedido um novo valor.
     * 
     * Isto é, se o usuário informar o número
     * 2 e já existir o número 2 em alguma posição do vetor, o número não deve ser
     * adicionado. Após ter adicionado todos os números dentro do vetor, o mesmo
     * deve ser ordenado. Para isso reordene os elementos internos do vetor de modo
     * que este fique em ordem crescente, conforme no exemplo:
     * 
     * Vetor origem: [0][4][2][6][3]
     * Vetor ordenado: [0][2][3][4][6]
     * 
     * 2. Entrada: valores reais(até 20 posições)
     * 
     * 3. Saída:  vetor origem e vetor ordenado
     * 
     * 4. Gordura: Com base neste valor,  Em seguida, Esse número deverá ser, Isto é
     * 
     * 
     */

    public static void main(String[] args) {
        Scanner teste = new Scanner(System.in);
        int valorRepetido = 0;

        System.out.println("Informe o valor inteiro(limitado a 20 posições):  ");
        int valorInteiro = teste.nextInt();

        int vetorInteiro[] = new int[valorInteiro];

        for (int i = 0; i < vetorInteiro.length; i++) {
            System.out.println("Digite um número Inteiro: ");
            valorRepetido = teste.nextInt();

            boolean existe = false;
            for (int j = 0; j < i; j++) {
                if (vetorInteiro[j] == valorRepetido) {
                    existe = true;
                    break;

                }

            }
            if (existe) {
                System.out.println("Valor Repetido! \nInsira outro valor: ");
                i--;
            } else {
                vetorInteiro[i] = valorRepetido;
            }

        }
        Arrays.sort(vetorInteiro);

        System.out.println("\nVetor Ordenado:");
        for (int v : vetorInteiro) {
            System.out.println("[" + v + "] ");
        }
        teste.close();

    }
}
/**
 * 5. Casos de teste:
 * a. Entrada: 5, 0, 4, 2, 6, 3
 *    Saída: Vetor ordenado: [0][2][3][4][6]
 * b. Entrada: 4, 10, 5, 10, 3
 *   Saída: Valor Repetido! \nInsira outro valor:
 * c. Entrada: 3, 1, 1, 2
 *  Saída: Valor Repetido! \nInsira outro valor:
 * d. Entrada: 6, 9, 8, 7, 5, 4
 * Saída: Vetor ordenado: [4][5][7][8][9]
 * 
 */