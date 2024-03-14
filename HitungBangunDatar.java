
import java.util.Scanner;


public class HitungBangunDatar {
    public static void main(String[] args){
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Bujur Sangkar");
        System.out.print("isikan pilihan: ");
        Scanner sc = new Scanner(System.in);
        
        int pilih = sc.nextInt();
        
        if (pilih ==1){
            System.out.print("Isikan panjang : ");
            int p = sc.nextInt();
            System.out.print("Isikan lebar : ");
            int l = sc.nextInt();
            PersegiPanjang pp=new PersegiPanjang(p,l);
            int Luas =pp.getLuas();
            int Keliling =pp.getKeliling();
            
            System.out.println("Luas Persegi :" + Luas);
            System.out.println("Keliling  Persegi Panjang :" + Keliling);
            
        }
        
        else if(pilih==2){
            System.out.println("isi nilai sisi :" );
            int s = sc.nextInt();
            BujurSangkar bs = new BujurSangkar(s);
            int Luas = bs.getLuas(s);
            int Keliling = bs.getKeliling();
            
            System.out.println("Bujur Sangkar : " + Luas);
            System.out.println("keliling bujur sangkar " + Keliling);
        }
    }
}
