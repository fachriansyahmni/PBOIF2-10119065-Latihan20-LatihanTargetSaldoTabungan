package pboif2.pkg10119065.latihan20.latihantargetsaldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;


 /*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program target saldo tabungan 
 */
public class PBOIF210119065Latihan20LatihanTargetSaldoTabungan {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        int saldo,i;
        i = 1;
        System.out.print("Saldo Awal: Rp. ");
        int saldoAwal = sc.nextInt();  
        System.out.print("Bunga/Bulan(%): ");
        int bunga = sc.nextInt();  
        System.out.print("Saldo Target : ");
        int saldoTarget = sc.nextInt();  
        
        saldo = saldoAwal;
        
        while(saldo < saldoTarget){
            System.out.println("Saldo di bulan ke-"+ i++ +" "+kursIndonesia.format(hitungTargetSaldo(saldo,bunga)));
            saldo = hitungTargetSaldo(saldo,bunga);
        }
        
       System.out.println("(Developed by : Fachriansyah Muhammad Nur Ihsan)");  
    }
    public static int hitungTargetSaldo(int saldo, int bunga){
        int Bunga = (saldo * bunga) /100;
        int saldoTabungan = saldo + Bunga;
        return saldoTabungan;
    }
 }