import java.util.Scanner;
public class Tugas3{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int nilai=0;
        int bilBesar=0;
        System.out.print("Masukan isi array : ");
        nilai = sc.nextInt();
        int[] elemen = new int[nilai];
        for(int i = 0; i < nilai; i++){
            System.out.print("Masukan Elemen array ke - "+i+" : ");
            elemen[i] = sc.nextInt();
            if(bilBesar < elemen[i]){
                bilBesar = elemen[i];
            }    
        }System.out.print("Bilangan Terbesar adalah " + bilBesar);
        
    }
}