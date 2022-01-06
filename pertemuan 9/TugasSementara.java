import java.util.Scanner;

public class TugasSementara {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai A = ");
        double a = scan.nextDouble();
        System.out.print("Masukkan nilai B = ");
        double b = scan.nextDouble();

        double angka = jumlah(a, b);
        System.out.println("Nilai " + a + " + " + b + " = " + angka);
        double angka2 = kurang (a, b);
        System.out.println("Nilai " + a + " - " + b + " = " + angka2);
    }

    public static double jumlah(double nilai1, double nilai2) {
        double angka = nilai1 + nilai2;
        return angka;
    }

    public static double kurang(double nilai1, double nilai2) {
        double angka2 = nilai1 - nilai2;
        return angka2;
    }
}