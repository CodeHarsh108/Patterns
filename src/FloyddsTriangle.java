import java.util.Scanner;

public class FloyddsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int num = 1;
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(num + " ");
                num++;
            }
            for (int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
