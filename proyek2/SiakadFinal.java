//Nama          : M fauzidan
//NIM           : 21537144013
//Kelas         : J.1
//Program Studi : Teknologi Informasi
import java.util.Scanner;

public class SiakadFinal {
    Data[] data = new Data[1000];
    private int jumlahData = 0;

    public static void main(String[] args) {

        SiakadFinal siakadFinal = new SiakadFinal();
        int menu = 0;
        while (menu!=10) {
            menu = tampilanMenu();
            if (menu==1) {
                siakadFinal.lihatData();
            }else if (menu==2) {
                siakadFinal.tambahData();
            }else if (menu==3) {
                siakadFinal.cariDataByNIM();
            }else if (menu==4) {
                siakadFinal.editNama();
            }else if (menu==5) {
                siakadFinal.editProdi();
            }else if (menu==6) {
                siakadFinal.editFakultas();
            }else if (menu==7) {
                siakadFinal.editNIM();
            }else if (menu==8) {
                siakadFinal.rerataIPK();    
            }else if (menu==9) {
                siakadFinal.hapusData();
            }
        }
    }

    private static int tampilanMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("===== MENU SIAKAD =====");
        System.out.println(" ");
        System.out.println("1. Lihat Data");
        System.out.println("2. Tambah Data");
        System.out.println("3. Cari Data");
        System.out.println("4. Edit Nama");
        System.out.println("5. Edit Prodi");
        System.out.println("6. Edit Fakultas");
        System.out.println("7. Edit NIM");
        System.out.println("8. Rerata IPK");
        System.out.println("10.Hapus Data");
        System.out.println("11.Keluar");
        System.out.print("Pilihlah Menu = ");
        int menu = scan.nextInt();
        return menu;
    }

    private void lihatData() {
        if (jumlahData==0) {
            System.out.println("Data Belum Tersedia");
        }else {
            System.out.println("Berikut Data Mahasiswa");
            System.out.printf("%7s %17s %15s %20s %15s %10s %16s", "NIM", "NAMA", "PRODI", "FAKULTAS", "SEMESTER", "IPK", "Nama Ortu" );
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------");
            for (int i=0; i<jumlahData; i++) {
                data[i].getDetail();
            }
        }
    }

    private void tambahData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan NIM Mahasiswa = ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama Mahasiswa = ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Program Studi = ");
        String prodi = scan.nextLine();
        System.out.print("Masukkan Fakultas = ");
        String fakultas = scan.nextLine();
        System.out.print("Masukkan Semester Mahasiswa = ");
        String semester = scan.nextLine();
        System.out.print("Masukkan Nama Ortu = ");
        String namaortu = scan.nextLine();
        double ipk = 0;
        try {
            System.out.print("Masukkan IPK Mahasiswa = ");
            ipk = scan.nextDouble();
        }catch (Exception e) {
            System.out.println("Anda harus memasukan bilangan desimal dengan menggunakan tanda titik. Silahkan edit IPK anda setelah input data");
        }
        Data inputMahasiswa = new Data(nim, nama, prodi, fakultas, semester, ipk, namaortu);
        data[jumlahData] = inputMahasiswa;
        jumlahData++; 
        lihatData();
    }

    public void cariDataByNIM() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("NIM yang anda cari tidak ketemu");
        } else {
            data[index].getDetail();
        }
    }

    public int getIndexByNIM(String nim) {
        for (int i=0; i<jumlahData; i++) {
            if (data[i].getNIM().equals(nim)) {
                return i;
            }
        }
        return -1;
    }

    public void editNama() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("NIM yang anda edit tidak ada");
        } else {
            data[index].getDetail();
            System.out.print("Masukan Nama mahasiswa yang baru = ");
            String nama = scan.nextLine();
            data[index].setNama(nama);
            data[index].getDetail();         
        }
    }

    public int getIndexByNama(String nama) {
        for (int i=0; i<jumlahData; i++) {
            if (data[i].getNama().equals(nama)) {
                return i;
            }
        }
        return -1;
    }

    public void editProdi() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa yang akan diedit = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("NIM yang anda edit tidak ada");
        } else {
            data[index].getDetail();
            System.out.print("Masukan Prodi mahasiswa yang baru = ");
            String prodi = scan.nextLine();
            data[index].setProdi(prodi);
            data[index].getDetail();         
        }
    }

    public int getIndexByProdi(String prodi) {
        for (int i=0; i<jumlahData; i++) {
            if (data[i].getProdi().equals(prodi)) {
                return i;
            }
        }
        return -1;
    }

    public void editFakultas() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa yang akan diedit = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("NIM yang anda edit tidak ada");
        } else {
            data[index].getDetail();
            System.out.print("Masukan Fakultas mahasiswa yang baru = ");
            String fakultas = scan.nextLine();
            data[index].setFakultas(fakultas);
            data[index].getDetail();         
        }
    }

    public int getIndexByFakultas(String fakultas) {
        for (int i=0; i<jumlahData; i++) {
            if (data[i].getFakultas().equals(fakultas)) {
                return i;
            }
        }
        return -1;
    }

    public void editNIM() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nama mahasiswa yang akan diedit = ");
        String nama = scan.nextLine();
        int index = getIndexByNama(nama);
        if (index==-1) {
            System.out.println("Nama yang anda akan edit tidak ketemu");
        } else {
            data[index].getDetail();
            System.out.print("Masukan NIM mahasiswa yang baru = ");
            String nim = scan.nextLine();
            data[index].setNIM(nim);
            data[index].getDetail();           
        }
    }

    public void rerataIPK() {
        double total = 0.0;
        for(int i=0; i<jumlahData; i++) {
            total += data[i].getIPK();
        }
        double rerata = total/jumlahData;
        System.out.println("Rerata IPK Mahasiswa = "+ rerata);
    }

    public void hapusData() {
        Scanner scan  = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa dari data yang akan dihapus = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("Data yang anda akan hapus tidak ketemu");
        } else {
            for (int i = index; i<jumlahData; i++) {
                data[i] = data[i+1];
            }
            jumlahData--;
            lihatData();
        }
    }
}