import java.util.Scanner;

public class Lingkarann29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r;
        double keliling, luas, phi = 3.14;

        System.out.print("Masukan Jari-Jari Lingkaran = ");
        r = input.nextInt();

        System.out.print("Keliling = ");
        keliling = 2 * phi * r;
        System.out.println(keliling);

        System.out.print("Luas = ");
        luas = phi * r * r;
        System.out.println(luas);

    }
}
