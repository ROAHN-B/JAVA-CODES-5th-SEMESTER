import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");

        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Frequencies of unique elements:");
        for (int i = 0; i < n; i++) {
            boolean alreadyCounted = false;

            
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            
            if (!alreadyCounted) {
                int count = 1;
                for (int k = i + 1; k < n; k++) {
                    if (arr[i] == arr[k]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " -> " + count );
            }
        }

        
    }
}
