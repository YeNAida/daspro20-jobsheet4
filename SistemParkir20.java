import java.util.Scanner;

public class SistemParkir20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [][] tempatParkir = new String[3][10]; // 3 lantai, 10 blok per lantai

        // Inisialisasi semua tempat parkir sebagai "kosong"
        for (int lantai = 0; lantai < tempatParkir.length; lantai++) {
            for (int blok = 0; blok < tempatParkir[lantai].length; blok++) {
                tempatParkir[lantai][blok] = "kosong";
            }
        }

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Parkir Kendaraan");
            System.out.println("2. Cari Tempat Parkir");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nomor kendaraan: ");
                    String nomorKendaraan = input.nextLine();

                    System.out.print("Masukkan lantai (1-3): ");
                    int lantai = input.nextInt();

                    System.out.print("Masukkan blok (1-10): ");
                    int blok = input.nextInt();
                    input.nextLine();

                    if (lantai < 1 || lantai > tempatParkir.length || blok < 1 || blok > tempatParkir[0].length) {
                        System.out.println("Lantai atau blok tidak valid.");
                    } else if (!tempatParkir[lantai - 1][blok - 1].equals("kosong")) {
                        System.out.println("Tempat parkir sudah terisi.");
                    } else {
                        tempatParkir[lantai - 1][blok - 1] = nomorKendaraan;
                        System.out.println("Kendaraan berhasil diparkir.");
                    }
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.println("\nTampilan Tempat Parkir:");
            for (int i = 0; i < tempatParkir.length; i++) {
                for (int j = 0; j < tempatParkir[i].length; j++) {
                    System.out.print(tempatParkir[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}