import java.util.Scanner;

public class Tugas4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    double diskon = 0.0, totalBayar;
    
    System.out.print("Masukan harga barang A\t:");
    int a = sc.nextInt();

    System.out.print("Masukan jumlah barang A\t:");
    int a2 = sc.nextInt();

    System.out.print("Masukan harga barang B\t:");
    int b = sc.nextInt();

    System.out.print("Masukan jumlah barang B\t:");
    int b2 = sc.nextInt();

    System.out.print("Masukan harga barang C\t:");
    int c = sc.nextInt();

    System.out.print("Masukan jumlah barang C\t:");
    int c2 = sc.nextInt();

    System.out.println("-----------------------------------------------------------");
    System.out.println("\t\tStruk total");
    System.out.println("-----------------------------------------------------------");

    System.out.println("Nama Barang\t|\tHarga\t|\tJumlah\t|\tTotal");
    
    int totalA = a * a2;
    int totalB = b * b2;
    int totalC = c * c2;
    System.out.println("Barang A\t\t" + a + "\t\t" + a2 + "\t\t" + totalA);
    System.out.println("Barang A\t\t" + b + "\t\t" + b2 + "\t\t" + totalB);
    System.out.println("Barang A\t\t" + c + "\t\t" + c2 + "\t\t" + totalC);

    int totalBeli = totalA + totalB + totalC;
    System.out.println("TOTAL\t\t: " + totalBeli);
    
    if(totalBeli > 1000000)
    {
        diskon = totalBeli * 10/100;
    System.out.println("Diskon\t\t: "+ diskon);
    }
    else if(totalBeli > 500000)
    {
        diskon = totalBeli *5/100;
    System.out.println("Diskon\t\t: "+ diskon);
    }
    else if(totalBeli > 200000)
    {
        diskon = totalBeli * 2/100;
    System.out.println("Diskon\t\t: " + diskon);
    }
    else if(totalBeli <= 200000) {
        System.out.println("0");
    }
    
    totalBayar = totalBeli - diskon;
    System.out.println("Total Bayar\t: " + totalBayar);

    System.out.println("\t\t\t\tTerima Kasih");
    }
}