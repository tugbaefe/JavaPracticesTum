package IntervıewOuestıon4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleMethodVarargs {
    public static void main(String[] args) {
 /*
	Problem Tanımı :
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	yazdıran parametreli method yazınız
 */
        String isim="";
        double notlar=0;

        ortalamaBul("Bilge",65,80,90,95,70,60);
        ortalamaBul("Vildan",55,90,70,95);
        ortalamaBul("Ayse",65,80,90);
        ortalamaBul("Gulce",65,80,90,95,70);

    }

    private static void ortalamaBul(String isim, double ...notlar) {
        double toplam=0;
        double ortalama=0;
        for (double each:notlar) {
            toplam+=each;
            
        }
        ortalama=toplam/notlar.length;
        System.out.println(isim + "'nin ortalamasi : "+ ortalama);

    }
}
