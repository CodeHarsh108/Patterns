import java.util.Scanner;

public class AlphaTriangleUpsidedown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int letter = n - i;
            for (int j = 0; j < letter; j++){
                System.out.print((char)('A' + j));
            }

            System.out.println();
        }
    }
}
