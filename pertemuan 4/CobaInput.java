import java.util.Scanner;

public class CobaInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan nilai A : ");
        double nilai A = scanner.nextDouble();
        
        System.out.print("masukan nilai B : ");
        double nilai B = scanner.nextDouble();

        double penjumlahan = nilaiA + nilaiB;

        System.out.println("nilai hasil penjumlahan dari " + nilai A + "+" nilai B + " = " + penjumlahan);

    }
}



