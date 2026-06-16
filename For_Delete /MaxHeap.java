
import java.util.*;

public class MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(10);
        maxHeap.add(30);
        maxHeap.add(20);
        maxHeap.add(5);
        maxHeap.add(40);

        System.out.println("Max Heap: " + maxHeap);

        System.out.println("Removed Max Element: " + maxHeap.poll());

        System.out.println("New Max Element: " + maxHeap.peek());

        System.out.print("Remaining elements in descending order: ");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
        System.out.println();
    }
    
}
