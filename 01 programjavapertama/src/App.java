public class App {
    public static void main(String[] args) throws Exception {
       // Program Biodata Mahasiswa 
       // Deklarasi variabel 
    String nama;
    String nim; 
    String tgl_lahir;       
    String alamat;
    Float berat_badan;
    Float tinggi_badan;

     // mengisi variable
    nama = "sandi"; 
    nim = "23241070";
    tgl_lahir = "11_novembe_2003";
    alamat = "ruteng";
    berat_badan = 50.0f;
    tinggi_badan = 160.0f; 

    // cetak biodata
    System.out.println("=============================================");
    System.out.println("nama" + nama );
    System.out.println("NIM"+ nim);
    System.out.println("Tanggal lahir" + tgl_lahir);
    System.out.println("Alamat" + alamat );
    System.out.println("Berat Badan" + berat_badan);
    System.out.println("Tinggi Badan" + tinggi_badan);
    System.out.println("===============================================");
    }
}