import java.util.Scanner;

public class Latihan_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan input prompt
        System.out.print("Fahren Ngerjain sendiri Latihan 17-30? (Yoi/Malas): ");
        String input = scanner.nextLine();

        // Memeriksa input untuk menentukan output
        if (input.equalsIgnoreCase("Yoi")) {
            System.out.println("Fahren Ngerjain sendiri Latihan 17-30...");
            // Proses simulasi waktu eksekusi
            try {
                Thread.sleep(8000); // Menunggu selama 8 detik
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("KAMU KEREN BANGET REN. Good Job");
        } else {
            System.out.println("DASAR KEROCO");
        }

        // Menampilkan waktu total eksekusi
        System.out.println("Total time: 8 seconds");

        // Meminta input untuk menjalankan perintah lagi
        System.out.print("Fahren Ngerjain sendiri Latihan 17-30? (iyalah/malas): ");
        input = scanner.nextLine();

        // Memeriksa input kedua untuk menentukan output
        if (input.equalsIgnoreCase("Yes")) {
            System.out.println("Fahren Ngerjain sendiri Latihan 17-30?...");
            // Proses simulasi waktu eksekusi
            try {
                Thread.sleep(6000); // Menunggu selama 6 detik
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Error: code does not compile");
        } else {
            System.out.println("Program terminated.");
        }

        // Menampilkan waktu total eksekusi
        System.out.println("Total time: 6 seconds");

        scanner.close();
    }
}