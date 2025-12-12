import java.util.Scanner;

public class FloyddsTriangleAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            char alpha = 65;
            for (int j = 0; j <= i; j++){
                System.out.print(alpha + " ");
                alpha++;
            }
            for (int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
