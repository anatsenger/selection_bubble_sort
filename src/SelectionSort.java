public class SelectionSort {
    public static int[] selectionSort(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[min]) {
                    min = j;
                }
            }

            System.out.printf("\nindice do menor valor : " + min);
            int aux = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = aux;
            System.out.printf("\n");
            for (int num : vetor) {
                System.out.print(num + " ");
            }
        }
        return vetor;
    }
}

