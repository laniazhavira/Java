import java.util.Scanner;

public class JumlahHari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tahun, bulan;

        System.out.print("Masukkan tahun: ");
        tahun = scanner.nextInt();

        System.out.print("Masukkan bulan: ");
        bulan = scanner.nextInt();

        scanner.close();

        JumlahHari2Beraksi obj = new JumlahHari2Beraksi();
        obj.tampilkanJumlahHari(tahun, bulan);
    }
}

class JumlahHari2Beraksi {
    void tampilkanJumlahHari(int tahun, int bulan) {
        int jumlahHari = hitungHari(tahun, bulan);
        if (jumlahHari != -1) {
            System.out.printf("Jumlah hari pada tahun %d bulan %d adalah %d hari\n", tahun, bulan, jumlahHari);
        } else {
            System.out.println("Input bulan tidak valid!");
        }
    }

    private int hitungHari(int tahun, int bulan) {
        int jumlahHari;

        switch (bulan) {
            case 1, 3, 5, 7, 8, 10, 12:
                jumlahHari = 31;
                break;
            case 4, 6, 9, 11:
                jumlahHari = 30;
                break;
            case 2:
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                    jumlahHari = 29;
                } else {
                    jumlahHari = 28;
                }
                break;
            default:
                jumlahHari = -1; 
                break;
        }

        return jumlahHari;
    }
}
