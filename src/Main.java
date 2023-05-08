/*
Java ile klavyeden girilen N tane sayma sayısından
en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç Tane Sayı Gireceksiniz? : ");
        int n = input.nextInt();

        /*Integer.MIN_VALUE , Java'daki herhangi bir tamsayı değişkeni için
        mümkün olan en düşük değeri sakladığını belirten, java.lang paketinin Tamsayı sınıfındaki
        bir sabittir.

        Integer.MAX_VALUE , Java'daki herhangi bir tamsayı değişkeni için
        mümkün olan en yüksek değeri sakladığını belirten, java.lang paketinin Tamsayı sınıfındaki
        bir sabittir
        */


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {

            System.out.print(i + ". sayıyı giriniz: ");
            int num = input.nextInt();

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
