import java.util.Scanner;

public class Tugas2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Umur anda :");
        int umur = sc.nextInt();

        if(umur >= 17){
            System.out.println("Boleh Berkendara");
        }else {
            System.out.println("Tidak boleh berkendara");
        }
    }
}