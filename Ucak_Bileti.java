import java.util.Scanner;
public class Ucak_Bileti {
    public static void main(String[] args) {
        double ucret, mesafe;
        int yas, tip;
        Scanner input = new Scanner(System.in);
        System.out.println("Merhaba Sayın Müşteri, Temizkan Airlines' a hoşgeldiniz. Size en uygun fiyat teklifini sunmamız için;\n * Yolculuk mesafeniz(km)\n * Yaşınız\n * 1. Tekyön ya da 2. Gidiş-Dönüş(BU SEÇENEK İÇİN 1 YA DA 2 Yİ TUŞLAYIN!!)\nsırayla giriniz.");
        mesafe = input.nextDouble();
        yas = input.nextInt();
        tip = input.nextInt();
        if (yas < 0 || mesafe < 0 || (tip < 1 && tip > 2)) {
            System.out.println("Hatalı veri girdiniz.");
        } else {
            ucret = mesafe * 0.1;
            if (tip == 2) {
                ucret = ucret * 0.8;
                if (yas < 12) {
                    System.out.println("Bilet ücretiniz : " + ucret / 2);
                } else if (yas >= 12 && yas <= 24) {
                    System.out.println("Bilet ücretiniz : " + ucret * 0.9);
                } else if (yas >= 65) {
                    System.out.println("Bilet ücretiniz : " + ucret * 0.7);
                } else {
                    System.out.println("Bilet ücretiniz : " + ucret);
                }
            } else {
                if (yas < 12) {
                    System.out.println("Bilet ücretiniz : " + ucret / 2);
                } else if (yas >= 12 && yas <= 24) {
                    System.out.println("Bilet ücretiniz : " + ucret * 0.9);
                } else if (yas >= 65) {
                    System.out.println("Bilet ücretiniz : " + ucret * 0.7);
                } else {
                    System.out.println("Bilet ücretiniz : " + ucret);
                }
            }
        }
    }
}
