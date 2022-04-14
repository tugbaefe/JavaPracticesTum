package InterviewOuestions5;

import java.util.Scanner;

public class PrintEvenNumber {
    public static void main(String[] args) {
/*
    Write a method named isEven that accepts an integer argument.
    The method should return true if the argument is even, or false otherwise.
    */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi= scan.nextInt();

        System.out.println(ciftMi(sayi));
    }

    private static boolean ciftMi(int sayi) {

        if (sayi%2==0) return true;
        else return false;
    }

}
