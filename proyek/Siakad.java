import java.util.Scanner;

public class Siakad {
    Mahasiswa[] mahasiswa = new Mahasiswa[1000];
    
    int jumlahData = 0;
    public static void main(String[] args) {
        Siakad.java siakad = new Siakad.java();
        int menu = 0;
        while (menu!=7) {
            menu = tampilanMenu();
            if (menu==1) {
                siakad.lihatData();
            } else if (menu==2) {
                siakad.tambahData();
            } else if (menu==3) {
                siakad.cariDataByNIM();
            } else if (menu==4) {
                siakad.rerataIPK();
            } else if (menu==5) {
                siakad.hapusNIM();
            } else if (menu==6) {
                siakad.editData();
            }
        }
    }

    public static int tampilanMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Selamat Datang di Sistem Informasi Akademik UNY!");
        System.out.println("--------------------------------------");
        System.out.println("                 MENU                 ");
        System.out.println("--------------------------------------");
        System.out.println("1. Lihat data");
        System.out.println("2. Tambah data");
        System.out.println("3. Cari data");
        System.out.println("4. Rerata IPK");
        System.out.println("5. Hapus NIM");
        System.out.println("6. Edit Data");
        System.out.println("7. Keluar");
        System.out.println("Silakan pilih menu");
        int menu = scan.nextInt();
        return menu;   
    }


    private void lihatData() {
        if (jumlahData==0) {
            System.out.println("Data kosong");
        } else {
            System.out.println("Data tersedia");
            for (int i=0; i<jumlahData;i++) {
                this.mahasiswa[i].getDetail();
            }
        }
        
    }

    private void tambahData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa = ");
        String nim = scan.nextLine();
        System.out.print("Masukan nama mahasiswa = ");
        String nama = scan.nextLine();
        System.out.print("Masukan alamat mahasiswa = ");
        String alamat = scan.nextLine();
        System.out.print("Masukan IPK mahasiswa = ");
        double ipk = scan.nextDouble();
        System.out.print("Masukan Tinggi Badan mahasiswa = ");
        double tinggi = scan.nextDouble();
        System.out.print("Masukan semester mahasiswa = ");
        int semester = scan.nextInt();
        Mahasiswa inputMahasiswa = new Mahasiswa(nim, nama, alamat, ipk, semester);
        inputMahasiswa.setTinggiBadan(tinggi);
        mahasiswa[jumlahData] = inputMahasiswa;
        jumlahData++;
        lihatData();
    }

    public void cariDataByNIM() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan NIM mahasiswa yang akan dicari = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("NIM yang Anda cari tidak ditemukan");
        } else {
            mahasiswa[index].getDetail();
        }
    }

    public int getIndexByNIM(String nim) {
        for (int i=0; i<jumlahData; i++) {
            if (mahasiswa[i].getNIM().equals(nim)) {
                return i;
            }
        }
        return -1;
    }
    public int getIndexByNama(String nama) {
        for (int i=0; i<jumlahData; i++) {
            if (mahasiswa[i].getNama().equals(nama)) {
                return i;
            }
        }
        return -1;
    }

    public void rerataIPK() {
        double total = 0.0;
        for(int i=0; i<jumlahData; i++) {
            total += mahasiswa[i].getIPK();
        }
        double rerata = total/jumlahData;
        System.out.println("Rerata IPK Mahasiswa = "+ rerata);
    }

    public void hapusNIM() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hapus NIM mahasiswa dari data yang akan Anda hapus: ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("Data yang akan Anda hapus tidak ditemukan: ");
        } 
        else {
            for (int i=index; i<jumlahData; i++) {
                mahasiswa[i] = mahasiswa[i+1];
            }
            jumlahData--;
            lihatData();
        }
    }

   public void editData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan NIM mahasiswa yang akan Anda edit");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("Nama yang Anda akan edit tidak ditemukan");
        } else {
            mahasiswa[index].getDetail();
            System.out.print("Masukan Nama mahasiswa yang baru = ");
            String Nama = scan.nextLine();
            mahasiswa[index].setNama(Nama);
            System.out.print("Masukan NIM mahasiswa yang baru = ");
            String nimString = scan.nextLine();
            mahasiswa[index].setNIM(nim);
            System.out.print("Masukan alamat mahasiswa yang baru = ");
            String alamat = scan.nextLine();
            mahasiswa[index].setAlamat(alamat);
            System.out.print("Masukan IPK mahasiswa yang baru = ");
            double IPK = scan.nextDouble();
            mahasiswa[index].setIPK(IPK);
            System.out.print("Masukan tinggi badan mahasiswa yang baru = ");
            double tinggiBadan = scan.nextDouble();
            mahasiswa[index].setTinggiBadan(tinggiBadan);
            System.out.print("Masukan semester mahasiswa yang baru = ");
            int semester = scan.nextInt();
            mahasiswa[index].setSemester(semester);
            mahasiswa[index].getDetail();

        }
    
    }
}    