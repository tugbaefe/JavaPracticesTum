package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T01_UzunKelime {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();
        String enUzunKelime="";

        String ilkUzunKelime=enUzunKelimeBul(cumle,enUzunKelime);
        System.out.println(ilkUzunKelime);

    }

    private static String enUzunKelimeBul(String cumle,String enUzunKelime) {
        List<String> yeniCumle=new ArrayList<>();
        cumle=cumle.trim().replaceAll("//p","");
        yeniCumle=List.of(cumle.split(" "));


         enUzunKelime=yeniCumle.get(0);

        for (int i = 0; i < yeniCumle.size() ; i++) {
            if (yeniCumle.get(i).length()>enUzunKelime.length()){
                enUzunKelime=yeniCumle.get(i);
            }

        }
       return enUzunKelime;



    }
}
