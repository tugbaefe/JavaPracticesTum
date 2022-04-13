package IntervıewOuestıon4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpecialCharRemoveArray {
    public static void main(String[] args) {
          /*
   Problem Tanımı :
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */

        List<String>arrList=new ArrayList<>(Arrays.asList("$13", "$15", "$20"));
        System.out.println("String degerlerin toplami : "+ getSum(arrList));

    }

    private static int getSum(List<String> arrList) {
        int toplam=0;

        for (String each: arrList) {
            String str=each.replace("$","");
            toplam+=Integer.parseInt(str);


        }
        if (toplam<0) return -1;
        else return  toplam;
    }
}
