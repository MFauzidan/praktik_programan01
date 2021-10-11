import java.util.Scanner;

public class KartuHasilStudi {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    String  nmaDepan,nmaBelakang,nim,pStudi,fakultas;
    double  ipk;
    int  thnMasuk,thnLulus;
        
    System.out.print("Masukan nama depan = ");
    nmaDepan =scan.nextLine();
    System.out.print("Masukan nama belakang = ");
    nmaBelakang =scan.nextLine();
    System.out.print("Masukan nim = ");
    nim =scan.nextLine();
    System.out.print("Masukan program studi = ");
    pStudi =scan.nextLine();
    System.out.print("Masukan fakultas = ");
    fakultas =scan.nextLine();
    System.out.print("Masukan ipk = ");
    ipk =scan.nextDouble();
    System.out.print("Masukan tahun Masuk = ");
    thnMasuk =scan.nextInt();
    System.out.print("Masukan tahun lulus = ");
    thnLulus = scan.nextInt();

    System.out.println("Nama Lengkap = " + nmaDepan + nmaBelakang);
    System.out.println("NIM = " + nim);
    System.out.println("Program Studi = " + pStudi);
    System.out.println("Fakultas = " + fakultas);
    System.out.println("IPK = " + ipk);

     // output scan
    System.out.println("======================================");
   
    System.out.println("NIM             : " + nim);
    System.out.println("Program Studi   : " + pStudi);
    System.out.println("Fakultas        : " + fakultas);
    System.out.println("IPK             : " + ipk + "0");
    System.out.println("IPK             : " + ipk);
    System.out.println("Lama Studi      : " + lamaStudi + " tahun");
        
    // program if, else, else if
    int lamaStudi = thnLulus - thnMasuk + 1; 
    if (ipk >= 3.51 && lamaStudi <= 4) {
    // program if, else, else if 
    if (ipk > 4.00 || ipk < 0) {
        System.out.println("Predikat Lulus  : Tidak Valid");
        System.out.println(end);
    } else if (ipk >= 3.51 && lamaStudi <= 4) {
        System.out.println("Predikat Lulus  : Dengan Pujian Tertinggi (Summa Cumlaude)");
        System.out.println(end);
    } else if (ipk >= 3.51) {
    } else if (ipk < 2.00) {
        System.out.println("Predikat Lulus  : Tidak Lulus");
        System.out.println(end);
    } else if (ipk > 4.00 && ipk < 0) {
        System.out.println("Predikat Lulus  : Tidak Valid");
        System.out.println(end);
    }    

    System.out.println("======================================");
    System.out.println();
      
      }
   }
 } 

    

        
   
    