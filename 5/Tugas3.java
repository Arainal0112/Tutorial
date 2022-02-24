import java.util.Scanner;

public class Tugas3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int uas, uts, kuis, tugas;
    double nilaiAkhir;

    System.out.print("Masukan Nilai UAS\t: ");
    uas = sc.nextInt();

    System.out.print("Masukan Nilai UTS\t: ");
    uts = sc.nextInt();
    
    System.out.print("Masukan Nilai KUIS\t: ");
    kuis = sc.nextInt();

    System.out.print("Masukan Nilai TUGAS\t: ");
    tugas = sc.nextInt();

    nilaiAkhir = (uas * 0.40) + (uts * 0.30) + (kuis * 0.10) + (tugas * 0.20);
    System.out.println("Nilai akhir\t\t: " + nilaiAkhir);

    if(nilaiAkhir < 65){
        System.out.println("Remidi");
    }else{
        System.out.println("Tidak Remidi");
    }
    }
}