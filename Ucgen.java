package Giris;
import java.util.Scanner;
public class Ucgen {
    public static void main(String[] args) {
        int a, b, c;
        double u, alan, cevre;
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci kenarı giriniz: ");
        a = input.nextInt();
        System.out.println("İkinci kenarı giriniz: ");
        b = input.nextInt();
        System.out.println("Üçüncü kenarı giriniz: ");
        c = input.nextInt();
        u = (a+b+c)/2;
        cevre = (2*u);
        System.out.println("Ucgenin çevresi:" + cevre);
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı:"+ alan);
    }
}
