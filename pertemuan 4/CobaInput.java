import java.util.Scanner;

public class CobaInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan nilai A : ");
        int nilaiA = scanner.nextInt();
         
        System.out.print("masukan nilai B : ");
        int nilaiB = scanner.nextInt();

        int penjumlahan = nilaiA + nilaiB;

        System.out.println("hasil penjumlahan dari " + nilaiA + " + " + nilaiB + " = " + penjumlahan);

    }
}



