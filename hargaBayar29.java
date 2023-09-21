import java.util.Scanner;

public class hargaBayar29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga, jumlah, jumlahHal;
        double dis, total, bayar, jmlDis;
        String merkBuku;

        System.out.println("Masukkan merk buku ");
        merkBuku = input.nextLine();
        System.out.println("Masukkan jumlah halaman buku ");
        jumlahHal = input.nextInt();
        System.out.println("Masukkan Diskon ");
        dis = input.nextDouble();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli ");
        jumlah = input.nextInt();

        total = harga * jumlah;
        jmlDis = total * dis /100;
        bayar = total - jmlDis;

        System.out.println("Merk buku " +merkBuku );
        System.out.println("Jumlah halaman buku "+jumlahHal );
        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis );
        System.out.println("Jumlah yang harus dibayar adalah " + bayar );
    }
}
