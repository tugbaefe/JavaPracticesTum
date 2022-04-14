package InterviewOuestions5;

import java.util.Scanner;

public class UsingDoWhileWithCondition {
    public static void main(String[] args) {
 /*
        Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!"
        Otherwise tell user "Lost!"

        Kullanıcıdan bir tamsayı girmesini isteyin.
        Tam sayı 100'den küçükse, kullanıcıya "Won!" Deyin.
        Aksi takdirde kullanıcıya "Kayıp!" deyin.
    */

        Scanner scan=new Scanner(System.in);
        int sayi=0;


        do {
            System.out.print("Bir tamsayi giriniz : ");
             sayi= scan.nextInt();

            if (sayi<100){
                System.out.println("Won!");
            }

        }while (sayi<100);


        System.out.println("Lost!");


    }
}
