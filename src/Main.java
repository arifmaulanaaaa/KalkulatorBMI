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

                double tinggiBadanKuadrat = tinggi * tinggi;
                double bmi = berat / tinggiBadanKuadrat;

                if (bmi < 18.5) {
                    System.out.println("Berat badan anda kurang.");
                } else if (bmi >= 18.5 && bmi <= 22.9) {
                    System.out.println("Berat badan anda normal.");
                } else if (bmi >= 23 && bmi <= 29.9) {
                    System.out.println("Berat badan anda berlebih.");
                } else {
                    System.out.println("Anda obesitas.");
                }
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