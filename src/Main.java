import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kalkulator BMI");

        System.out.print("Masukkan berat badan: ");
        double berat = input.nextDouble();

        System.out.print("Masukkan tinggi badan: ");
        double tinggi = input.nextDouble();

        double tinggiBadanKuadrat = tinggi * tinggi;

        double bmi = berat / tinggiBadanKuadrat;
        System.out.printf("Skor bmi adalah %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Berat badan anda kurang.");
        } else if (bmi >= 18.5 && bmi <= 22.9) {
            System.out.println("Berat badan anda normal.");
        } else if (bmi >= 23 && bmi <= 29.9) {
            System.out.println("Berat badan anda berlebih.");
        } else {
            System.out.println("Anda obesitas.");
        }

        input.close();
    }
}