// Hashing using Linear Probing
import java.util.Scanner;

class LinearProbing {
    private int[] table;
    private int size;
    
    public LinearProbing(int size) {
        this.size = size;
        this.table = new int[size];
    
        for (int i = 0; i < size; i++) {
            table[i] = -1;
        }
    }
    

    private int hash(int key) {
        return key % size;
    }
    

    public void insert(int key) {
        int index = hash(key);
        int i = 0;
        
        while (table[(index + i) % size] != -1) {
            i++;
            if (i == size) {
                System.out.println("Hash table is full!");
                return;
            }
        }
        
        table[(index + i) % size] = key;
        System.out.println("Inserted " + key + " at " + ((index + i) % size));
    }
    
  
    public boolean search(int key) {
        int index = hash(key);
        int i = 0;
        
        while (table[(index + i) % size] != -1) {
            if (table[(index + i) % size] == key) {
                System.out.println("Found " + key + " at index " + ((index + i) % size));
                return true;
            }
            i++;
            if (i == size) break;
        }
        
        System.out.println(key + " not found");
        return false;
    }
   
    public void display() {
        System.out.println("\nHash Table:");
        for (int i = 0; i < size; i++) {
            if (table[i] == -1) {
                System.out.println("Index " + i + ": Empty");
            } else {
                System.out.println("Index " + i + ": " + table[i]);
            }
        }
    }
}

public class Hashing2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter hash table size: ");
        int size = sc.nextInt();
        
        LinearProbing lp = new LinearProbing(size);
        
        while (true) {
            System.out.println("\n1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter key to insert: ");
                    int key = sc.nextInt();
                    lp.insert(key);
                    break;
                case 2:
                    System.out.print("Enter key to search: ");
                    key = sc.nextInt();
                    lp.search(key);
                    break;
                case 3:
                    lp.display();
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}