import java.util.Scanner;

public class Percobaan2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);    
            int nilai1, nilai2;
    
        
        System.out.print("Masukan Angka pertama : ");
        nilai1 = sc.nextInt();

        System.out.print("Masukan Angka Kedua : ");
        nilai2 = sc.nextInt();

        double rataRata = (nilai1 + nilai2)/2;

        if(rataRata >= 100){
            rataRata = rataRata - 5;
            System.out.print("Hasil rata rata + 10 = " + rataRata);
        }else{
        System.out.print("Jadi Hasil Akhirnya adalah " + rataRata);
        }

    }
}