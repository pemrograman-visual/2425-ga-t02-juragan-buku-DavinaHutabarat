// 12S24047 - Davina Olivia Yosefanny Hutabarat
// 12S24050 - Ester Hasianna Nainggolan

import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn, judul, penulis;
        int tahunterbit;
        String penerbit;
        String formatbukuelektronik;
        double hargapembelian, minimummargin;
        int stok;
        String rate;
        double rating;

        isbn = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunterbit = input.nextInt();
        penerbit = input.nextLine();
        formatbukuelektronik = input.nextLine();
        hargapembelian = input.nextDouble();
        minimummargin = input.nextDouble();
        stok = input.nextInt();
        rating = input.nextDouble();
        if (rating >= 4.7 && rating < 5.0) {
            rate = "Best Pick";
        } else {
            if (rating >= 4.5 && rating < 4.7) {
                rate = "Must Read";
            } else {
                if (rating >= 4.0 && rating < 4.5) {
                    rate = "Recommended";
                } else {
                    if (rating >= 3.0 && rating < 4.0) {
                        rate = "Average";
                    } else {
                        if (rating < 3.0 && rating >= 0.0) {
                            rate = "Low";
                        }
                    }
                }
            }
        }
        System.out.println(isbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbukuelektronik + "|" + rate);
    }
}
