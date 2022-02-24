import java.util.Scanner;

public class Job72{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    int i, angka;

    System.out.print("Masukan angka : ");
    angka = input.nextInt();
    for(i=0; i<=angka; i++){
        if(i %5==0)continue;
            System.out.println(i);
    }
    }
}