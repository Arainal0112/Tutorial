import java.util.Scanner;
public class Tugas2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];
        int balik=0;
        int i = 0;
        for(i = 0; i < 5; i++){
            System.out.print("Masukan nilai array ke-"+i+" : ");
            array[i]=sc.nextInt();
        }
        System.out.print("Array dengan Urutan Terbalik : ");
        for(int j = 0; j<5; j++){
            balik=array[5-j-1];
            System.out.print(balik);
            if(j<4){
                System.out.print(", ");
            }
        }

    }
}