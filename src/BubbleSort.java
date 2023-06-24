public class BubbleSort {
    public static int[] bubbleSort(int[] vetor) {
        int n = vetor.length;

         for (int i = 0; i < n ; i++) {
             for (int j = 0; j < n -1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    System.out.printf("\n valor no indice " + j + " vai para o " + (j + 1));
                    System.out.printf("\n");
                    for (int num : vetor) {
                        System.out.print(num + " ");
                    }
                }
            }
        }
        return vetor;
    }
}
