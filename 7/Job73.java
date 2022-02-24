import java.util.Scanner;

public class Job73{
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int i=1,  bil1=0, bil2=1, bil3=0, batas;

    System.out.print("Masukan batas nilai : ");
    batas = sc.nextInt();
    System.out.print(bil1+"-");
    System.out.print(bil2+"-");

    for(; i<=batas; ){
        bil3 = bil1+bil2;
        System.out.print(bil3);
        bil1 = bil2;
        bil2 = bil3;
        i = i + 1;
        if(i<=batas){
            System.out.print("-");
        }
    }
    
    }
}