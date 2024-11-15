import java.util.Scanner;

public class ManajemenKeuangan20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("MANAJEMEN KEUANGAN YOLA");
        double pemasukan, targetMingguan;
        int mingguan;
        System.out.print("Jumlah Pemasukan Bulanan Rp. ");
        pemasukan = input.nextDouble(); 
        System.out.print("Jumlah Minggu pada Bulan ini: ");
        mingguan = input.nextInt();
        targetMingguan = pemasukan/mingguan;
        System.out.printf("Pengeluaran Maksimum /minggu Rp %.2f \n",targetMingguan);

        // array satu dimensi dalam hari/minggu
        double[] pengeluaranHarian = new double[mingguan];
        for (int i = 0; i < pengeluaranHarian.length; i++) {
            System.out.printf("Masukkan Pengeluaran minggu ke-%d Rp. ", i + 1);
            pengeluaranHarian[i] = input.nextDouble();

            if (pengeluaranHarian[i] > targetMingguan) {
                System.out.printf("Pengeluaran minggu ke-%d melebihi batas\n", i + 1);
            }
        }
        
         // Hitung total pengeluaran
        double totalPengeluaran = 0;
        for (double pengeluaran : pengeluaranHarian) {
            totalPengeluaran += pengeluaran;
        }

        // Hitung sisa uang
        double sisaUang = targetMingguan * mingguan - totalPengeluaran;
        System.out.printf("Total pengeluaran Anda bulan ini: Rp%.2f \n", totalPengeluaran);
        System.out.printf("Sisa uang Anda: Rp%.2f \n", sisaUang);

        if (sisaUang < 50.0) {
            System.out.println("Bagus! Pertahankan Hemat pada bulan ini.");
        }else {
                System.out.println("Coba Lebih berhemat bulan depan!");
            } 
    }
}
