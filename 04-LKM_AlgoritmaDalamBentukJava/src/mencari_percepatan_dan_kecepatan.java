import java.util.Scanner;
 class mencari_percepatan_dan_kecepatan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // mancarri percepatan

        System.out.println(" Masukan kecepatan awal(dalam satuan m/s): ");
        double kecepatanAwal = scanner.nextDouble();
        System.out.println(" Masukan waktu: ");
        double waktu = scanner.nextDouble();
        System.out.println(" Masukan kecepatan setelah selang waktu(dalam waktu m/s): ");
        double kecepatanSetelahwaktu = scanner.nextDouble();
        double percepatan = (kecepatanSetelahwaktu-kecepatanAwal)/waktu;
        System.out.println("percepatan adalah : " + percepatan + "m/s^2");

         // Mencari kecepatan    
        
        System.out.println(" Masukan jarak (dalam satuan meter): ");
        double jarak = scanner.nextDouble();
        System.out.println(" Masukan waktu(dalam satuan detik): ");
        double Waktu = scanner.nextDouble();
        double kecepatan = jarak/Waktu;
        System.out.println("percepatan adalah : " + kecepatan + "m/s");
         
        scanner.close();
    }
}