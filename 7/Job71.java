import java.util.Scanner;

public class Job71{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int i, bil, jmlhBilGenap=0, totalGenap=0; 
        double rataRata=0;
    System.out.print("Masukan angka : ");
    bil = sc.nextInt();

    jmlhBilGenap = bil/2;
    System.out.printf("Banyaknya bilangan genap dari 1 sampai %d adalah %d\n", bil, jmlhBilGenap);

    System.out.print("Angka genap dalam range tersebut adalah");
    for(i=1;i<=bil;i++){
        if(i%2!=0)
            continue;
            System.out.print(", "+i);
            totalGenap = totalGenap + i;
    }System.out.println("\nHasil penjumlahan bilangan genap dari 1 sampai "+bil+" adalah "+totalGenap);

            rataRata=(double) totalGenap/jmlhBilGenap;

            System.out.print("Rata-rata bilangan genap dari 1 sampai " +bil +" adalah " +rataRata);
    
        
    }
}