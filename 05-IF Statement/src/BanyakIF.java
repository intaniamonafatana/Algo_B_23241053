import java.util.Scanner;

public class BanyakIF {
    public static void main(String[] args) throws Exception {
         // Data Member
        int nilai;
        String grade;

        // membuat objek Scanner
        Scanner scan = new Scanner(System.in);

        // memasukkan input dari keyboard
        System.out.print("Masukkan Nilai : ");
        nilai = scan.nextInt();

        // IF Statement
        if (nilai >= 80 ) {
            grade = "A";
        } else if ( nilai >= 70 && nilai <= 79 ) {
            grade = "B";
        } else if ( nilai >= 60 && nilai <= 69 ) {
            grade = "C";
        } else if ( nilai >= 50 && nilai <= 59 ) {
            grade = "D";
        } else {
            grade = "E";
        }
        System.out.println("Nilai: " + nilai );
        System.out.println("Grade: " + grade );    
    }
    
}