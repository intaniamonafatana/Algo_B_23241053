import java.util.Scanner;

public class BilanganGenap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         System.out.print("Masukan angka: ");
        int in = scan.nextInt();

        for(int i = 2; i < in; i+=2){
        System.out.print(i + " ");
        }
    }
}