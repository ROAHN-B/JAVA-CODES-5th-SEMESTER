import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

       
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Second largest = " + secondLargest);
        }

        
    }
}
