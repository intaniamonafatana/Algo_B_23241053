import java.util.Scanner;

public class CetakAngka {
    public static void main(String[] args) {
        System.out.print("Masukan angka: ");
        Scanner scan = new Scanner(System.in);
        int angka = scan.nextInt();
        for(int i=0; i < angka ; i++){
           System.out.print( i + " ");
       }
   }
   
}
