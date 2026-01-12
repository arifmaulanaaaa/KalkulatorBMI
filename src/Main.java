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

                double tinggiMeter = tinggi / 100;
                double bmi = berat / (tinggiMeter * tinggiMeter);
                System.out.printf("Skor bmi anda: %.2f\n", bmi);

                String saran;

                if (bmi < 18.5) {
                    System.out.println("Berat badan anda kurang.");
                    saran = "Tambah asupan makanan bergizi cuy";
                } else if (bmi >= 18.5 && bmi <= 22.9) {
                    System.out.println("Berat badan anda normal.");
                    saran = "Pertahankan cuy";
                } else if (bmi >= 23 && bmi <= 29.9) {
                    System.out.println("Berat badan anda berlebih.");
                    saran = "Defisit kalori dan perbanyak gerak bro!";
                } else {
                    System.out.println("Anda obesitas.");
                    saran = "Defisit kalori dan perbanyak gerak bro!";
                }

                System.out.println("Saran: " + saran + "\n");

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
}