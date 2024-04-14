import java.util.Scanner;

// Class untuk algoritma Bubble Sort
class BubbleSort {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // Tukar posisi
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

public class BubbleSortApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah bilangan
        System.out.print("Masukkan jumlah bilangan: ");
        int n = scanner.nextInt();

        // Input bilangan
        int[] arr = new int[n];
        System.out.println("Masukkan bilangan:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

       
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);

       
        System.out.println("Bilangan setelah diurutkan:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
