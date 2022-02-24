import java.util.Scanner;
public class Pemilihan1{
    public static void main(String[] args){
        //System.out.println("Tes");
        Scanner input = new Scanner(System.in);
        int bil;
        System.out.println("Masukkan sebuah bilangan");
        bil = input.nextInt();
        if(bil%2 == 0){
            System.out.println("Bilangan Genap");
        } else{
            System.out.println("Bilangan Ganjil");
        }
        String output = (bil % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
        System.out.println(output);
    }
}