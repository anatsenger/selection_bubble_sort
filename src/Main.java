import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] vetor = {3, 6, 8, 1, 4, 9, 0};
        System.out.printf("vetor não ordenado: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.printf("\niniciando selection sort: ");
        vetor = SelectionSort.selectionSort(vetor);
        System.out.printf("\nvetor ordenado por Selection Sort: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        vetor = new int[]{3, 6, 8, 1, 4, 9, 0};
        System.out.printf("\niniciando Bubble sort: ");
        System.out.printf("\nvetor não ordenado: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        vetor = BubbleSort.bubbleSort(vetor);

        System.out.printf("\nvetor ordenado por Bubble Sort: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}