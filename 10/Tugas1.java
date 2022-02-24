import java.util.Scanner;
public class Tugas1{
    public static void main(String[]args){
        /*Scanner sc = new Scanner(System.in);
        int checkNum[] = new int[10];
        int evenNum[] = new int[10];
        int oddNum[] = new int[10];
        int cEven=0, cOdd = 0;
        
        for(int i = 0; i<checkNum.length; i++){
            System.out.print("Input nilai : ");
            checkNum[i] = sc.nextInt();
        }
        for(int j = 0; j<checkNum.length; j++){
            if(checkNum[j] %2==0){
                evenNum[cEven]=checkNum[j];
                cEven++; 
                System.out.println("Isi indeks ke-"+j+" = "+checkNum[j]+" (Genap)"); 
            }else{
                oddNum[cOdd] = checkNum[j];
                cOdd++;
                System.out.println("isi indeks ke-"+j+" = "+checkNum[j]+" (Ganjil)"); 
            }
        }    
        System.out.println("Bilangan Genap berjumlah "+cEven+" angka"); 
        System.out.println("Bilangan Ganjil berjumlah "+cOdd+" angka"); */

        //import java.util.Scanner;
        Scanner sc = new Scanner(System.in);
        int checkNum[] = new int[10];
        int evenNum[] = new int[10];
        int oddNum[] = new int[10];
        int cEven=0, cOdd = 0;
        
        for(int i = 0; i<checkNum.length; i++){
            System.out.print("Input nilai : ");
            checkNum[i] = sc.nextInt();
        }
        for(int j = 0; j<checkNum.length; j++){
            if(checkNum[j] %2==0){
                evenNum[cEven]=checkNum[j];
                cEven++;
            }else{
                oddNum[cOdd] = checkNum[j];
            cOdd++;
            }  
        }
        System.out.print("Bilangan Genap : ")    ;
        for(int i = 0; i < cEven; i++ ){
            System.out.print(evenNum[i]+" ");
        }
        System.out.println();
        System.out.print("Bilangan Ganjil : ")    ;
        for(int j = 0; j < cOdd; j++ ){
            System.out.print(oddNum[j]+" ");
        }
      }
}