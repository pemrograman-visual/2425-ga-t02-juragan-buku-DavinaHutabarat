// 12S24047 - Davina Olivia Yosefanny Hutabarat
// 12S24050 - Ester Hasianna Nainggolan
import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn, judul, penulis, grade;
        int tahunterbit;
        String penerbit;
        String formatbukuelektronik;
        double hargapembelian, minimummargin;
        int stok;
        double rating;

        isbn = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunterbit = Integer.parseInt(input.nextLine());
        penerbit = input.nextLine();
        formatbukuelektronik = input.nextLine();
        hargapembelian = Double.parseDouble(input.nextLine());
        minimummargin = Double.parseDouble(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        if (rating >= 4.7) {
            grade = "Best Pick";
        } else {
            if (rating >= 4.5 && rating < 4.7) {
                grade = "Must Read";
            } else {
                if (rating >= 4.0 && rating < 4.5) {
                    grade = "Recommended";
                } else {
                    if (rating >= 3.0) {
                        grade = "Average";
                    } else {
                        if (rating < 3.0) {
                            grade = "Low";
                        }
                    }
                }
            }
        }
        System.out.println(isbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbukuelektronik + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + grade + "|" + toFixed(rating,1));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
