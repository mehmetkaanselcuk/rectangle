import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits : ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= (n-1); j++) {
                System.out.println(" ");
            }
            for (int k = i; k <= (2*i) - 1; k++) {
                System.out.println("*");
            }
            System.out.println();
        }


    }
}