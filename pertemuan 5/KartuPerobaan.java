public class KartuPercobaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap Anda: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM Anda: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Prodi Anda: ");
        String prodi = scanner.nextLine();
        System.out.print("Masukkan IPK Anda = ");
        double ipk = scanner.nextDouble();
        System.out.print("Masukkan Lama Studi Anda (tahun) = ");
        double lamaStudi = scanner.nextDouble();

        System.out.println();
        if((ipk >= 3.51 && ipk <= 4.00) && lamaStudi <= 4) {
            System.out.println(nama);
            System.out.println(nim);
            System.out.println(prodi);
            System.out.println("Predikat Kelulusan Anda adalah \" Summa Cumlaude (Dengan Pujian Tertinggi)\"");
        } else if((ipk >= 3.51 && ipk <= 4.00) && lamaStudi > 4) {
            System.out.println(nama);
            System.out.println(nim);
            System.out.println(prodi);
            System.out.println("Predikat Kelulusan Anda adalah \"Cumlaude (Dengan Pujian)\"");
        } else if((ipk >= 3.01 && ipk <3.51) && lamaStudi > 0) {
            System.out.println(nama);
            System.out.println(nim);
            System.out.println(prodi);
            System.out.println("Predikat Kelulusan Anda adalah \"Sangat Memuaskan\"");
        } else if((ipk >= 2.76 && ipk < 3.01) && lamaStudi > 0) {
            System.out.println(nama);
            System.out.println(nim);
            System.out.println(prodi);
            System.out.println("Predikat Kelulusan Anda adalah \"Memuaskan\"");
        } else if((ipk >= 2.00 && ipk < 2.76) && lamaStudi > 0) {
            System.out.println(nama);
            System.out.println(nim);
            System.out.println(prodi);
            System.out.println("Predikat Kelulusan Anda adalah \"Cukup\"");
        } else if(ipk < 2.00 && lamaStudi > 0) {
            System.out.println(nama);
            System.out.println(nim);
            System.out.println(prodi);
            System.out.println("Predikat Kelulusan Anda adalah \"Tidak Lulus\"");
        } else {
            System.out.println("\"Data Tidak Valid\"");
        }
    }
}