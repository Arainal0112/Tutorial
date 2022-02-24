import java.util.Scanner;

public class Tugas1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan angka pertama : ");
        int angka1 = sc.nextInt();
        System.out.println("Masukan angka Kedua : ");
        int angka2 = sc.nextInt();
        if(angka1 > angka2){
            System.out.println("Angka Terbesar adalah : " + angka1);
        }else {
            System.out.println("Angka Terbesar adalah : " + angka2);
        }
    }
}