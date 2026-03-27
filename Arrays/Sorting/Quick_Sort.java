package Sorting;

import java.util.Vector;

public class Quick_Sort {

    public static void quickSort(Vector<Integer> arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(Vector<Integer> arr, int low, int high) {
        int pivot = arr.get(high);
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr.get(j) < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        return i + 1;
    }

    public static void main(String[] args) {
        Vector<Integer> arr = new Vector<>();
        arr.add(10);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(1);
        arr.add(5);

        System.out.println("Original Array: " + arr);

        quickSort(arr, 0, arr.size() - 1);

        System.out.println("Sorted Array: " + arr);
    }
}
