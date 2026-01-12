import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            try {
                System.out.println("=== Kalkulator BMI ===");

                System.out.print("Masukkan nama kamu: ");
                String nama = input.nextLine();

                System.out.print("Masukkan berat badan (Kg): ");
                double berat = input.nextDouble();

                System.out.print("Masukkan tinggi badan (cm): ");
                double tinggi = input.nextDouble();

                double bmi = hitungBMi(berat, tinggi);
                // System.out.printf("Skor bmi anda: %.2f\n", bmi);

                System.out.println("Halo " + nama + " anda masuk dalam kategori: ");
                tentukanKategoriDanSaran(bmi);
                beratBadanIdeal(tinggi);

            } catch (Exception e) {
                System.out.println("Input tidak valid! harus input angka.");
                input.nextLine();
                continue;
            }

            System.out.println("Masih mau lanjut? (y/n)");
            String pilihanLanjut = input.next();
            input.nextLine();

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
            System.out.println("Berat badan kurang.");
            System.out.println("Tambah asupan makanan bergizi cuy");
        } else if (bmi <= 24.9) {
            System.out.println("Berat badan normal.");
            System.out.println("Pertahankan cuy");
        } else if (bmi <= 29.9) {
            System.out.println("Berat badan berlebih.");
            System.out.println("Defisit kalori dan perbanyak gerak bro!");
        } else {
            System.out.println("Anda obesitas.");
            System.out.println("Defisit kalori dan perbanyak gerak bro!");
        }
    }

    public static void beratBadanIdeal(double tinggiCM) {
        double tinggiMeter = tinggiCM / 100;
        double tinggiKuadrat = tinggiMeter * tinggiMeter;

        double beratMin = 18.5 * tinggiKuadrat;
        double beratMax = 22.9 * tinggiKuadrat;

        System.out.printf("Berat badan ideal anda adalah: %.1f kg - %.1f kg\n", beratMin, beratMax);
    }

}