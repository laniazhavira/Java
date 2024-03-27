import java.util.Scanner;

public class Matematika {
    public int tambah(int a, int b) {
        return a + b;
    }

    public int kurang(int a, int b) {
        return a - b;
    }

    public int kali(int a, int b) {
        return a * b;
    }

    public int bagi(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero");
            return 0; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matematika matematika = new Matematika();
        
        System.out.println("Menu Aplikasi Matematika:");
        System.out.println("1. Pertambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        
        System.out.print("Pilih Menu = ");
        int menu = scanner.nextInt();
        
        if (menu < 1 || menu > 4) {
            System.out.println("Pilihan menu tidak valid.");
            return; // Exit program
        }
        
        System.out.print("Masukkan Angka Pertama = ");
        int angka1 = scanner.nextInt();
        
        System.out.print("Masukkan Angka Kedua = ");
        int angka2 = scanner.nextInt();
        
        int hasil = 0;
        switch (menu) {
            case 1:
                hasil = matematika.tambah(angka1, angka2);
                System.out.println("Hasil Pertambahan antara " + angka1 + " dan " + angka2 + " adalah " + hasil);
                break;
            case 2:
                hasil = matematika.kurang(angka1, angka2);
                System.out.println("Hasil Pengurangan antara " + angka1 + " dan " + angka2 + " adalah " + hasil);
                break;
            case 3:
                hasil = matematika.kali(angka1, angka2);
                System.out.println("Hasil Perkalian antara " + angka1 + " dan " + angka2 + " adalah " + hasil);
                break;
            case 4:
                hasil = matematika.bagi(angka1, angka2);
                System.out.println("Hasil Pembagian antara " + angka1 + " dan " + angka2 + " adalah " + hasil);
                break;
            default:
                System.out.println("Pilihan menu tidak valid.");
        }
    }
}
