import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++){


            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }

            for (int j = 0; j < 2*(n - i - 1); j++){
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) System.out.print("*");


            System.out.println();
        }


        for (int i = n - 2; i >= 0; i--) {

            // Left: increasing stars (in reverse)
            for (int j = 0; j <= i; j++) System.out.print("*");

            // Middle spacing
            for (int j = 0; j < 2 * (n - i - 1); j++) System.out.print(" ");

            // Right: increasing stars (reverse)
            for (int j = 0; j <= i; j++) System.out.print("*");

            System.out.println();
        }
    }
}
