import java.util.Scanner;

public class Tugas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan nilai A : ");
        double nilaiA = scanner.nextDouble();
         
        System.out.print("masukan nilai B : ");
        double nilaiB = scanner.nextDouble();

        double penjumlahan = nilaiA + nilaiB;
        double pengurangan = nilaiA - nilaiB;
        double perkalian = nilaiA * nilaiB;
        double pembagian = nilaiA / nilaiB;
        double modulus = nilaiA % nilaiB;

        System.out.println("hasil penjumlahan dari " + nilaiA + " + " + nilaiB + " = " + penjumlahan);
        System.out.println("hasil pengurangan dari " + nilaiA + " - " + nilaiB + " = " + pengurangan);
        System.out.println("hasil perkalian   dari " + nilaiA + " * " + nilaiB + " = " + perkalian);
        System.out.println("hasil pembagian   dari " + nilaiA + " / " + nilaiB + " = " + pembagian);
        System.out.println("hasil modulus     dari " + nilaiA + " % " + nilaiB + " = " + modulus);

    }
    
}
