import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            try {
                System.out.println("=== Kalkulator BMI ===");

                System.out.print("Masukkan berat badan (Kg): ");
                double berat = input.nextDouble();

                System.out.print("Masukkan tinggi badan (cm): ");
                double tinggi = input.nextDouble();

                double bmi = hitungBMi(berat, tinggi);
                System.out.printf("Skor bmi anda: %.2f\n", bmi);

                tentukanKategoriDanSaran(bmi);

            } catch (Exception e) {
                System.out.println("Input tidak valid! harus input angka.");
                input.nextLine();
                continue;
            }

            System.out.println("Masih mau lanjut? (y/n)");
            String pilihanLanjut = input.next();
            if (pilihanLanjut.equalsIgnoreCase("n")) {
                lanjut = false;
            }

        }
        input.close();
    }

    public static double hitungBMi(double berat, double tinggi) {
        double tinggiMeter = tinggi / 100;
        return berat / (tinggiMeter * tinggiMeter);
    }

    public static void tentukanKategoriDanSaran(double bmi) {
        if (bmi < 18.5) {
            System.out.println("Berat badan anda kurang.");
            System.out.println("Tambah asupan makanan bergizi cuy");
        } else if (bmi >= 18.5 && bmi <= 22.9) {
            System.out.println("Berat badan anda normal.");
            System.out.println("Pertahankan cuy");
        } else if (bmi >= 23 && bmi <= 29.9) {
            System.out.println("Berat badan anda berlebih.");
            System.out.println("Defisit kalori dan perbanyak gerak bro!");
        } else {
            System.out.println("Anda obesitas.");
            System.out.println("Defisit kalori dan perbanyak gerak bro!");
        }
    }
}