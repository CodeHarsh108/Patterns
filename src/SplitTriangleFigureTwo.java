import java.util.Scanner;

public class SplitTriangleFigureTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        // First: Right-Aligned Right-Angled Triangle
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Second: Left-Aligned Upside-Down Triangle
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - i - 1; j++){
                System.out.print("*");
            }
            for (int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
